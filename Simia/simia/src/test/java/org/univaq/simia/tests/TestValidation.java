package org.univaq.simia.tests;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.univaq.simian.evaluation.RascalStructure;
import org.xml.sax.SAXException;

public class TestValidation {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		// TODO Auto-generated method stub
		RascalStructure rsc=new RascalStructure();
		//rsc.buildStructure("C:\\Users\\claudio\\Desktop\\validation_framework\\jackson_validation\\jackson_project");
		//rsc.movingJars("C:\\Users\\claudio\\Desktop\\validation_framework\\drools_validation", "C:\\Users\\claudio\\Desktop\\validation_framework\\drools_validation\\drools_project\\lib");
		//rsc.appendLibraries("C:\\Users\\claudio\\Desktop\\validation_framework\\jackson_validation\\jackson_project\\.classpath", "jackson-databind-2.9.6.jar");		
		
		
		rsc.applyMetrics("C:\\Users\\claudio\\Desktop\\validation_framework\\jackson_validation\\gt_methods.txt", "C:\\Users\\claudio\\Desktop\\validation_framework\\jackson_validation\\pattern_methods.txt");
	}
	

}
