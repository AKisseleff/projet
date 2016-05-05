package controller;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import model.ListSTB;
import model.Personne;
import model.STB;

public class JaxbConvertisseur {

	public JaxbConvertisseur() {
		super();
	}


	public ListSTB getListSTB() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("STB.xml").getFile());
		ListSTB ListSTB = new ListSTB();
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ListSTB.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ListSTB = (ListSTB) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ListSTB;
	}
	
	/*
	public boolean AddSTB(STB stb){
		ClassLoader classLoader = getClass().getClassLoader();
		File xml = new File(classLoader.getResource("STB.xml").getFile());
		File xsd = new File(classLoader.getResource("STB.xsd").getFile());
		
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(ListSTB.class);
			 SchemaFactory factory = 
	                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	            Schema schema = factory.newSchema(xsd);
	            Validator validator = schema.newValidator();
	            validator.validate(new StreamSource(xml));
		} catch (JAXBException | IOException | SAXException e ) {
			System.out.println("Exception: "+e.getMessage());
            return false;
		}
		return false;
	}
	
	public boolean validateStb(STB stb){
		boolean result= false;
		ClassLoader classLoader = getClass().getClassLoader();
		File xml = new File(classLoader.getResource("STB.xml").getFile());
		File xsd = new File(classLoader.getResource("STB.xsd").getFile());
		
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(ListSTB.class);
			 SchemaFactory factory = 
	                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	            Schema schema = factory.newSchema(xsd);
	            Validator validator = schema.newValidator();
	            validator.validate(new StreamSource(xml));
		} catch (JAXBException | IOException | SAXException e ) {
			System.out.println("Exception: "+e.getMessage());
            return false;
		}
		
		return result;
	}
	
	*/

}
