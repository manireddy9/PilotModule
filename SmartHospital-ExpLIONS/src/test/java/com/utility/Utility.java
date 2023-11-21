package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public String URL,ChildName,Weight,title,Birth,Phone,AddreSS,CaseId,Fathername,Report,Case,staffid,Fname,date,Mail,IncomeName,IncomeDate,incomeAmount,ExpenseName,E_date,amount1,death,guardian,message,NoticeDate,publish;
		public Utility() {
			data();
		}
		public void data() {
			File file = new File("src\\test\\resources\\data.properties");
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
			Case=prop.getProperty("Case");
			 death = prop.getProperty("death");
			 guardian=prop.getProperty("guardian");
			
			staffid=prop.getProperty("staffid");
			Fname=prop.getProperty("Fname");
			date=prop.getProperty("date");
			Mail=prop.getProperty("Mail");
			IncomeName=prop.getProperty("IncomeName");
			IncomeDate=prop.getProperty("IncomeDate");
			incomeAmount=prop.getProperty("incomeAmount");
			ExpenseName=prop.getProperty("ExpenseName");
			E_date=prop.getProperty("E_date");
			amount1=prop.getProperty("amount1");
			message=prop.getProperty("message");
			NoticeDate=prop.getProperty("NoticeDate");
			publish=prop.getProperty("publish");
			title=prop.getProperty("title");
			
		}
}
