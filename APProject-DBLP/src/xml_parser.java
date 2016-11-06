package threading;
import java.util.*;
import java.io.*;
import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.events.*;
public class xml_parser {

	public static void main(String[] args) {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		try {
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("dblp.xml"));
		 while(eventReader.hasNext())
		 {
			 XMLEvent event = eventReader.nextEvent();
			 if(event.getEventType() == XMLEvent.START_ELEMENT){
			        StartElement startElement = event.asStartElement();
			        System.out.println(startElement.getName());
			    }
		 }
		}
		catch(FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}

}
