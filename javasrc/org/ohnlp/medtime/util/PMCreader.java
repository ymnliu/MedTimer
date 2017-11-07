package org.ohnlp.medtime.util;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author: Rastegar Mojarad, Majid <mojarad.majid@mayo.edu>
 * 
 */

public class PMCreader {

	public static String getPmid(Element el, String name, String feature) {
		String text = "";
		try {
			NodeList nodeCon = el.getElementsByTagName(name);
			for (int i = 0; i < nodeCon.getLength(); i++) {
				Node ndDrug = nodeCon.item(i);
				if (ndDrug.getNodeType() == Node.ELEMENT_NODE) {
					Element elmCon = (Element) ndDrug;
					String att = elmCon.getAttribute("pub-id-type");
					if (att.equalsIgnoreCase(feature)) {
						NodeList childElemNameCon = elmCon.getChildNodes();
						if (childElemNameCon.getLength() > 0) {
							text = ((Node) (childElemNameCon.item(0))).getNodeValue();
							if (!text.isEmpty())
								text = text.trim();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (text.length() > 0)
			text = text.trim();
		return text;
	}

	public static String getOneNode(Element el, String parent, String name) {
		String text = "";
		try {
			NodeList lstBody = el.getElementsByTagName(parent);
			if (lstBody.getLength() > 0) {
				Node ndBody = lstBody.item(0);
				if (ndBody.getNodeType() == Node.ELEMENT_NODE) {
					Element elem = (Element) ndBody;
					text = getOneNode(elem, name);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String getYearPub(Element el, String parent, String name) {
		String text = "";
		try {
			NodeList lstBody = el.getElementsByTagName(parent);
			if (lstBody.getLength() > 0) {
				Node ndBody = lstBody.item(0);
				if (ndBody.getNodeType() == Node.ELEMENT_NODE) {
					Element elem = (Element) ndBody;
					text += getOneNode(elem, name, "subject");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String getCategories(Element el, String parent, String name) {
		String text = "";
		try {
			NodeList lstBody = el.getElementsByTagName(parent);
			if (lstBody.getLength() > 0) {
				Node ndBody = lstBody.item(0);
				if (ndBody.getNodeType() == Node.ELEMENT_NODE) {
					Element elem = (Element) ndBody;
					text += getOneNode(elem, name, "subject");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String getOneNode(Element el, String name) {
		String text = "";
		try {
			NodeList nodeCon = el.getElementsByTagName(name);
			if (nodeCon.getLength() > 0) {
				Element elmCon = (Element) nodeCon.item(0);
				NodeList childElemNameCon = elmCon.getChildNodes();
				if (childElemNameCon.getLength() > 0) {
					text = ((Node) (childElemNameCon.item(0))).getNodeValue();
					if (!text.isEmpty())
						text = text.trim();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (text.length() > 0)
			text = text.trim();
		return text;
	}

	public static String getOneAttributeOfNodeWithGrand(Element el, String grand, String parent, String name,
			String attr) {
		String text = "";
		try {
			NodeList nodeCon = el.getElementsByTagName(name);
			for (int i = 0; i < nodeCon.getLength(); i++) {
				Node ch = nodeCon.item(i);
				if (ch.getParentNode().getParentNode().getNodeName().equalsIgnoreCase(grand)) {
					if (ch.getParentNode().getNodeName().equalsIgnoreCase(parent)) {
						text = ch.getAttributes().getNamedItem(attr).getNodeValue();
						if (!text.isEmpty())
							text = text.trim();
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (text.length() > 0)
			text = text.trim();
		return text;
	}

	public static String getInsideText(Element el, String name) {
		String text = "";
		try {
			NodeList nodeCon = el.getElementsByTagName(name);
			if (nodeCon.getLength() > 0) {
				Element elmCon = (Element) nodeCon.item(0);
				text = elmCon.getTextContent();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static List<String> lstBodies;
	public static List<String> lstTitles;

	public static void getBody(Element el) {
		lstBodies = new ArrayList<String>();
		lstTitles = new ArrayList<String>();
		try {
			NodeList lstNodeInter = el.getElementsByTagName("body");
			//			System.out.println(lstNodeInter.getLength());
			for (int k = 0; k <lstNodeInter.getLength(); k++) {
				Node ndInter = lstNodeInter.item(k);
				Element elem = (Element) ndInter;
				NodeList lstNdTitles = elem.getElementsByTagName("title");
				NodeList lstParas = elem.getElementsByTagName("p");
				for (int q = 0; q < lstNdTitles.getLength(); q++) {
					Node nTitle = lstNdTitles.item(q);
					if (nTitle.getNodeType() == Node.ELEMENT_NODE) {
						String title = nTitle.getTextContent();
						String para = "";
						for (int qP = 0; qP < lstParas.getLength(); qP++) {
							Node nPara = lstParas.item(qP);
							if (nPara.getParentNode().equals(nTitle.getParentNode())) {
								para += nPara.getTextContent() + " ";
							}
						}
						lstTitles.add(title);
						lstBodies.add(para);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getAbstract(Element el, String name) {
		String text = "";
		try {
			NodeList nodeCon = el.getElementsByTagName(name);
			if (nodeCon.getLength() > 0) {
				Element elm = (Element) nodeCon.item(0);
				text = getInsideText(elm, "p");
				if (text == null || text.length() < 5) {
					Element elmCon = (Element) nodeCon.item(0);
					text = elmCon.getTextContent();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

}
