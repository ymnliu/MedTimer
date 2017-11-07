package org.ohnlp.medtime.util;

import java.io.FileReader;

import javax.xml.stream.Location;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;


public class PMCStreamReader {


	public static void main(String argv[]) {

	    XMLInputFactory factory = XMLInputFactory.newInstance();
	    try{
	    XMLStreamReader streamReader = factory.createXMLStreamReader(
	           new FileReader("testdata/trec15/orgPMC/00/1064073.nxml"));

	    while(streamReader.hasNext()){
	        streamReader.next();
	        if(streamReader.getEventType() == XMLStreamReader.START_ELEMENT){
	            Location location = streamReader.getLocation();
	            System.out.println("byte location: " + location.getCharacterOffset());
	            }
	        }
	    } catch(Exception e){
	        e.printStackTrace();
	    }
	}
}
