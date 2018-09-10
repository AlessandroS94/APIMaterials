package org.univaq.simia.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.univaq.simia.business.impl.APICallRecommenderImpl;
import org.univaq.simia.business.impl.SimianFileImpl;
import org.univaq.simian.evaluation.RascalStructure;
import org.univaq.simian.model.SimianPattern;
import java.util.List;




public class TestClone {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub 
		APICallRecommenderImpl chk=new APICallRecommenderImpl();
		SimianFileImpl sc=new SimianFileImpl();	
		long start=System.currentTimeMillis();
		//directories
		
		//String clams="C:\\Users\\claudio\\Desktop\\resultsPattern\\paho.mqtt.java";	
		
		/*
		String snippetCode="Twitter mTwitter;\r\n" + 
				"    final String CONSUMER_KEY;\r\n" + 
				"    final String CONSUMER_SECRET;";
		
		File recFile=sc.createTempFile(snippetCode)*/	
		
		File rank=new File("C:\\Users\\claudio\\Desktop\\validation_framework\\drools_validation\\droolsPatterns");		
		File developerFile=new File("C:\\Users\\claudio\\Desktop\\validation_framework\\drools_validation\\droolsSample.java");
		
			
		ArrayList<File> files=sc.scan(rank,"java");				
		List<SimianPattern> allpatterns=new ArrayList<SimianPattern>();			
		for(File f: files) {			
			allpatterns.add(chk.findPattern(f,developerFile,2));			
		}
	
		long end=System.currentTimeMillis();
		long elapse=end-start;		
		sc.putRecommendations(allpatterns,"C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\current_rec.java");	
		sc.parseAst(developerFile);			
		
		File result=new File("C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\ast.java");
		sc.splitFile(0,80 , developerFile);		
		List<SimianPattern> secondRec=new ArrayList<SimianPattern>();
		File splitted=new File("C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\split.java");
		
		for(File f2: files) {
			secondRec.add(chk.findPattern(f2, result, 2));
		}
		
		sc.putRecommendations(secondRec, "C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\second_rec.java");
		
		
		//sc.evaluate("C:\\Users\\claudio\\Desktop\\validation_framework\\gt_methods.txt", "C:\\Users\\claudio\\Desktop\\validation_framework\\patterns_methods.txt");
		
		String path_n="C:\\Users\\claudio\\Desktop\\validation_framework\\drools_validation\\org.drools";
		System.out.println("done");
		RascalStructure rsc=new RascalStructure();
		rsc.createPatternFile(secondRec, path_n,"droolsSample");
		
		
		
		
	}
	


}
