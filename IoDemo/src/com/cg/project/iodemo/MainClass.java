package com.cg.project.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
		/*File fileFrom = new File("D:\\159859_Singh_Harkanwalpreet\\Codes.java");
		File fileTo = new File("D:\\FileReadWrite\\"+fileFrom.getName());
			IOClassesDemo.byteStreamReadWrite(fileFrom, fileTo);*/
			/*File file = new File("D:\\159859_Singh_Harkanwalpreet\\Codes.java");
			SerializationDemo.doSerialization(file);
			SerializationDemo.doDeSerialization(file);*/
			
			Properties projectProperties = new Properties();
			projectProperties.load(new FileInputStream(new File(".//resources//projectProperties.properties")));
			
			String projectKey1 = projectProperties.getProperty("projectKey1");
			String projectKey2 = projectProperties.getProperty("projectKey2");
			
			System.out.println(projectKey1 +"\n"+projectKey2);
		} catch (Exception e) {
			System.out.println("Some Exception");
			e.printStackTrace();
		}

	}

}
