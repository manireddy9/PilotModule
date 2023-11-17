package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public String URL,ChildName,Weight,Birth,Phone,AddreSS,CaseId,Fathername,Report;
		public Utility() {
			data();
		}
		public void data() {
			File file = new File("C:\\Explionss\\SmartHospital-ExpLIONS\\src\\test\\resources\\data.properties");
			FileInputStream fio =null;
			try {
				fio = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			Properties prop = new Properties();
			try {
				prop.load(fio);
			} catch (IOException e) {
				e.printStackTrace();
			}
			URL=prop.getProperty("URL");
			ChildName=prop.getProperty("ChildName");
			Weight=prop.getProperty("Weight");
			Birth=prop.getProperty("Birth");
			Phone=prop.getProperty("Phone");
			AddreSS=prop.getProperty("AddreSS");
			CaseId=prop.getProperty("CaseId");
			Fathername=prop.getProperty("Fathername");
			Report=prop.getProperty("Report");
			
		}
}
