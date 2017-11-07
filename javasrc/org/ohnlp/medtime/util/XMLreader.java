package org.ohnlp.medtime.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


/**
 * @author: Rastegar Mojarad, Majid <mojarad.majid@mayo.edu>
 * 
 */

public class XMLreader {

	public static Document getDocument(String path) {
		Document document = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			dbf.setAttribute("http://xml.org/sax/features/namespaces", true);
			dbf.setAttribute("http://xml.org/sax/features/validation", false);
			dbf.setAttribute("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
			dbf.setAttribute("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

			dbf.setNamespaceAware(true);
			dbf.setIgnoringElementContentWhitespace(false);
			dbf.setIgnoringComments(false);
			dbf.setValidating(false);
			DocumentBuilder db = dbf.newDocumentBuilder();
			document = db.parse(path);
			document.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return document;
	}
	
	// added by Sijia
	public static Document getDocumentFromString(String textString) {
		Document document = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			dbf.setAttribute("http://xml.org/sax/features/namespaces", true);
			dbf.setAttribute("http://xml.org/sax/features/validation", false);
			dbf.setAttribute("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
			dbf.setAttribute("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

			dbf.setNamespaceAware(true);
			dbf.setIgnoringElementContentWhitespace(false);
			dbf.setIgnoringComments(false);
			dbf.setValidating(false);
		    InputSource is = new InputSource();
		    is.setCharacterStream(new StringReader(textString));

			DocumentBuilder db = dbf.newDocumentBuilder();
			document = db.parse(is);
			document.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return document;
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
					if (text != null)
						text = text.trim();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (text != null && text.length() > 0)
			text = text.trim();
		return text;
	}

	public static List<String> getLstOfOneNode(Element el, String name) {
		List<String> lstNodes = new ArrayList<String>();
		String text;
		try {
			NodeList nodeCon = el.getElementsByTagName(name);
			for (int i = 0; i < nodeCon.getLength(); i++) {
				Element elmCon = (Element) nodeCon.item(i);
				NodeList childElemNameCon = elmCon.getChildNodes();
				if (childElemNameCon.getLength() > 0) {
					text = ((Node) (childElemNameCon.item(0))).getNodeValue();
					if (!text.isEmpty()) {
						text = text.trim();
						lstNodes.add(text);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstNodes;
	}

	public static List<String> getLstOfOneNode(Element el, String parent, String name) {
		List<String> lstNodes = new ArrayList<String>();
		try {
			NodeList lstNodeInter = el.getElementsByTagName(parent);
			for (int k = 0; k < lstNodeInter.getLength(); k++) {
				Node ndInter = lstNodeInter.item(k);
				if (ndInter.getNodeType() == Node.ELEMENT_NODE) {
					Element elem = (Element) ndInter;
					String temp = XMLreader.getOneNode(elem, name).trim();
					lstNodes.add(temp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstNodes;
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

	public static void main(String[] args) {
		try {
			String path = "N:\\Projects\\Repurposing\\data\\DrugBank\\drugbank.xml";
			Document document = XMLreader.getDocument(path);
			NodeList lstNode = document.getElementsByTagName("drug");
			for (int i = 0; i < lstNode.getLength(); i++) {
				Node ndDrug = lstNode.item(i);
				if (ndDrug.getNodeType() == Node.ELEMENT_NODE) {
					Element elemDrug = (Element) ndDrug;
					String name = XMLreader.getOneNode(elemDrug, "name");
					// NodeList lstNdIssn =
					// elemJournal.getElementsByTagName("groups");
					// if (lstNdIssn.getLength() > 0) {
					// Element elmIssn = (Element) lstNdIssn.item(0);
					// if
					// (elmIssn.getAttribute("IssnType").equalsIgnoreCase("print"))
					// issn_print = true;
					// NodeList ndIssn = elmIssn.getChildNodes();
					// String issn = ((Node)
					// (ndIssn.item(0))).getNodeValue().trim();
					// }
					NodeList lstNodeTarget = elemDrug.getElementsByTagName("targets");
					if (lstNodeTarget.getLength() > 0) {
						Node ndJournalIssue = lstNodeTarget.item(0);
						if (ndJournalIssue.getNodeType() == Node.ELEMENT_NODE) {
							Element elemJournalIssue = (Element) ndJournalIssue;
							String volume = XMLreader.getOneNode(elemJournalIssue, "target");
							System.out.println(volume);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
