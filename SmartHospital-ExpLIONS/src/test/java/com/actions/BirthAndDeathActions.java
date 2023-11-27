package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.BirthAndDeathLocators;
import com.utility.HelperClass;

public class BirthAndDeathActions {
  BirthAndDeathLocators objl;
  WebDriverWait wait=new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(20));
  String URL,ChildName,Weight,Birth,Phone,AddreSS,CaseId,Fathername,Report,staffid,Fname,date,Mail,IncomeName,IncomeDate,incomeAmount,ExpenseName,E_date,amount1;
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
	  JavascriptExecutor js = (JavascriptExecutor) HelperClass.driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",objl.Clickbirthanddeath);
	  objl.Clickbirthanddeath.click();
	 
	
	  
  }

  public void birthRecord() {
  objl.birthrecord.click();
  }
  public void AddbirthRecord() {
	  wait.until(ExpectedConditions.elementToBeClickable(objl.addbirthrecord)).click();
	 
	// objl.plus.click();
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
public void AddRecord() throws InterruptedException {
	Thread.sleep(2000);
	 wait.until(ExpectedConditions.elementToBeClickable(objl.savebtn)).click();
	
}
//death records
public void deathrecord() {
	 JavascriptExecutor js = (JavascriptExecutor) HelperClass.driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",objl.Clickbirthanddeath);
	 objl.Clickbirthanddeath.click();
	objl.deathRecord.click();
}
public void adddeathRecord()  {
	objl.adddeathRecord.click();
	
}
public void DeathCase(String Case) {
	objl.DeathCaseId.sendKeys(Case);
}
public void deathDate(String death) {
	objl.Deathdate.sendKeys(death);
	
}

public void gurdian(String guardian) {
	objl.gurdianname.sendKeys(guardian);
}
public void DeathSave() {
	objl.deathsave.click();
}
//Human Resources

public void ClickHuman() {
	JavascriptExecutor js = (JavascriptExecutor) HelperClass.driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",objl.HumanResource);
	objl.HumanResource.click();
}

public void AddStaff() {
	objl.AddStaff.click();
}
public void staffID(String staffid) {
	wait.until(ExpectedConditions.visibilityOf(objl.StaffId));
	objl.StaffId.sendKeys(staffid);
	
}
public void StaffROle() {
	Select s= new Select(objl.StaffRole);

	s.selectByValue("Admin");
}
public void StaffFname(String Fname) {
	wait.until(ExpectedConditions.visibilityOf(objl.fname));
	objl.fname.sendKeys(Fname);
}
public void StaffGender() {
	Select m=new Select(objl.Gender);
	wait.until(ExpectedConditions.visibilityOf(objl.Gender));
	m.selectByVisibleText("Male");
}
public void DOB(String date) {
	wait.until(ExpectedConditions.visibilityOf(objl.dateofbirth));
	objl.dateofbirth.sendKeys(date);
}
public void HumanMail(String Mail) {
	wait.until(ExpectedConditions.visibilityOf(objl.dateofbirth));
	objl.email.sendKeys(Mail);
}
public void HumanSubmit() {
	wait.until(ExpectedConditions.visibilityOf(objl.BasicInfoSubmit));
	objl.BasicInfoSubmit.click();
}

public String RecordSaved() {
	wait.until(ExpectedConditions.visibilityOf(objl.recordSaved));
	return objl.recordSaved.getText();
}

// click attendance 
public void Attendance1() {
	wait.until(ExpectedConditions.visibilityOf(objl.staffattendance));
	objl.staffattendance.click();
}
public void ROle() {
	Select r=new Select(objl.Role);
	r.selectByIndex(5);
}
public void staffAttendance() {
	objl.staffattended.sendKeys("11/22/2023");
}
public void staffSearch() {
	objl.staffsearch.click();
}

//Finance
public void Finances() {
	JavascriptExecutor js = (JavascriptExecutor) HelperClass.driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",objl.Finance);
	objl.Finance.click();
}

//Income Methods

public void IncomeField()  {
	
	objl.Income.click();
	
}
public void Addincome()  {
	
	objl.AddIncome.click();
	
}
public void IncomeDrop()  {
	Actions act =new Actions(HelperClass.getDriver());
	act.moveToElement(objl.IncomeHead).click().perform();
	objl.IncomeHead.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	
	
}
public void Incomename(String IncomeName) {
	
	objl.name.sendKeys(IncomeName);
	
	
}
public void Incomedate(String IncomeDate)  {
	
	objl.date.sendKeys(IncomeDate);
}
public void IncomeAmount(String incomeAmount)  {
	
	objl.amount.sendKeys(incomeAmount);
}


public void IncomeSave()  {
	
	objl.incomebtn.click();
}

//Expenses Methods
public void expenses() {
	objl.Expenses.click();
}
public void addExpenses() {
	objl.AddExpenses.click();
}
public void ExpensesSelect() {
	Select expenses=new Select(objl.ExpensesHead);
	expenses.selectByIndex(3);
}
public void ExpensesName(String ExpenseName) {
	objl.e_name.sendKeys(ExpenseName);
}
public void Expensesdate(String E_date) {
	objl.expensesDate.sendKeys(E_date);
}
public void ExpensesAmount(String amount1) {
	objl.expensesAmount.sendKeys(amount1);
}
public void ExpensesSave() {
	objl.expensesButton.click();
}

//Expenses
public void ExpensesDetails(String ExpenseName,String E_date,String amount1) {
	ExpensesName(ExpenseName);
	Expensesdate( E_date);
	ExpensesAmount(amount1);
}

//Income 
public void IncomeDetails(String IncomeName,String IncomeDate,String incomeAmount)  {
	Incomename(IncomeName);
	Incomedate(IncomeDate);
	IncomeAmount(incomeAmount);
}
//Add Birth
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

//Add Death
public void DeathRecord(String Case, String death,String guardian) {
	DeathCase(Case);
    deathDate(death);
	gurdian(guardian);
	
	
	
}

//HumanResource

public void HumanAction(String staffid,String Fname,String date,String Mail) {
	this.staffID(staffid);
	this.StaffFname(Fname);
	this.DOB(date);
	this.HumanMail(Mail);
}

//Messaging

public void messageIcon() {
	JavascriptExecutor js=(JavascriptExecutor)HelperClass.getDriver();
	js.executeScript("arguments[0].scrollIntoView(true);",objl.Messaging);
	objl.Messaging.click();
}
public void PostMessage() {
	objl.PostMessaging.click();
}

public void message_box(String message) {
	
HelperClass.driver.switchTo().frame(objl.messageIframe);
objl.messageBox.sendKeys(message);
HelperClass.driver.switchTo().parentFrame();

}
public void SetTitle(String title) {
	
	objl.title.sendKeys(title);
}
public void Notice(String NoticeDate) {
	
	objl.NoticeDate.sendKeys(NoticeDate);
	
}
public void SetPublishOn(String publish) {
	objl.PublishON.sendKeys(publish);
}


public void SendMSg() {
	wait.until(ExpectedConditions.elementToBeClickable(objl.Send));
	
	objl.Send.click();
}

//profile
public void AdminProfile() {
	wait.until(ExpectedConditions.elementToBeClickable(objl.Profile));
	objl.Profile.click();
}
public void  AdminName() {
	wait.until(ExpectedConditions.elementToBeSelected(objl.AdminName));
	System.out.println( objl.AdminName.getText());
	
}
public void LogOut() {
	wait.until(ExpectedConditions.elementToBeClickable(objl.Logout));
	objl.Logout.click();
}


//Messaging main
	
}
