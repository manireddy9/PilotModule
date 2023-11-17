package com.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.BirthAndDeathLocators;
import com.utility.HelperClass;

public class BirthAndDeathActions {
  BirthAndDeathLocators objl;
  String URL,ChildName,Weight,Birth,Phone,AddreSS,CaseId,Fathername,Report;
  public BirthAndDeathActions() {
	  this.objl=new BirthAndDeathLocators();
	  PageFactory.initElements(HelperClass.getDriver(), objl);
  }
  public void setAdmin() {
	 objl.admin.click();
  }
  public void Sigin() {
	  objl.signin.click();
  }
  
  public void BirthAnddeath() {
	  objl.Clickbirthanddeath.click();;
  }
  public void clickBirth() {
	  objl.clickbirth.click();
  }
  public void birthRecord() {
//	  objl.birthrecord.click();
  }
  public void AddbirthRecord() {
	  objl.addbirthrecord.click();
	  objl.plus.click();
  }
  public void SetChild(String ChildName) {
	  objl.childname.sendKeys(ChildName);
  }
  public void setGender() {
	  Select s=new Select(objl.gender);
	  s.selectByIndex(1);
  }
  public void SetWeight(String Weight) {
	  objl.weight.sendKeys(Weight);
	  
  }

public void setBirthDate(String Birth) {
	
	objl.birthdate.sendKeys(Birth);
	
}
public void CaseId(String CaseId) { //CaseId is same for both death and birth
	objl.caseid.sendKeys(CaseId);
}
public void phonenum(String Phone) {
	objl.phone.sendKeys(Phone);
}
public void SetAddress(String AddreSS) {
	objl.address.sendKeys(AddreSS);
}
public void SetFather(String Fathername) {
	objl.fathername.sendKeys(Fathername);
}


public void TextArea(String Report) {
	objl.textarea.sendKeys(Report);
}
public void AddRecord() {
	objl.savebtn.click();
}
//death records
public void deathrecord() {
	objl.deathRecord.click();
}
public void adddeathRecord() throws InterruptedException {
	objl.adddeathRecord.click();
	Thread.sleep(3000);
}
public void DeathCase(String Case) {
	objl.deathRecord.sendKeys(Case);
}
public void deathDate(String death) {
	objl.Deathdate.sendKeys(death);
	
}

public void gurdian(String guardian) {
	objl.gurdianname.sendKeys(guardian);
}
public void AddBirthRecord(String ChildName,String Weight,String Birth,String CaseId,String Phone,String AddreSS,String Fathername) {
	
	SetChild(ChildName);
	setGender();
	SetWeight(Weight);
	setBirthDate(Birth);
	CaseId(CaseId);
	phonenum(Phone);
	SetAddress(AddreSS);
	SetFather(Fathername);

	
	
}
public void DeathRecord(String Case,String death, String guardian) {
	DeathCase("5679");
	deathDate("11/16/2023 6:03 PM");
	gurdian("SrinivasReddy");
	AddRecord();
	
	
}
}