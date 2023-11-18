package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BirthAndDeathLocators {
	@FindBy(xpath="(//a[@class='btn btn-primary width50'])[1]")
	public WebElement admin;
	@FindBy(xpath="//button[@class='btn']")
	public WebElement signin;
	@FindBy(xpath=" //a[contains(.,'Birth & Death Record')]")
	public WebElement Clickbirthanddeath;
	@FindBy(xpath="(//ul[@class='treeview-menu menu-open']//a[1])[1]")
	public WebElement clickbirth;
	
	@FindBy(xpath="//i[@class='fa fa-plus']//parent::a[@class='btn btn-primary btn-sm birthrecord']")
	public WebElement addbirthrecord;
	
	//@FindBy(xpath="//div[contains(@class,'box-tools addmeeting')]//a[1]")
	//public WebElement plus;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	public WebElement childname;
	@FindBy(xpath="(//label[text()=' Gender']/following-sibling::select)[1]")
	public WebElement gender;
	@FindBy(xpath="(//input[@name='weight'])[1]")
	public WebElement weight;
	@FindBy(xpath="(//input[@name='birth_date'])[1]")
	public WebElement birthdate;
	@FindBy(xpath="(//input[@name='case_id'])[1]")// case id field is same is both birth and death
	public WebElement caseid;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	public WebElement phone;
	@FindBy(xpath="(//input[@name='address'])[1]")
	public WebElement address;
	@FindBy(xpath="(//input[@name='father_name'])[1]")
	public WebElement fathername;
	@FindBy(xpath= "(//label[text()='Report'])[2]/following::textarea")
	public WebElement textarea;
	@FindBy(xpath="//button[@class='btn btn-info']")// save btn is same for both birth and death
	public WebElement savebtn;
	
	//Death Locators
	
	@FindBy(xpath="//li[@class='active']//a")
	public WebElement deathRecord;
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm deathrecord']")
	public WebElement adddeathRecord;
	@FindBy(xpath="(//input[@id='case_id'])[1]")
	WebElement DeathCaseId;
	@FindBy(xpath="(//input[@name='death_date'])[1]")
	public WebElement Deathdate;
	
	@FindBy(xpath="//input[@id='guardian_name']")
	public WebElement gurdianname;
	
	
	//Human Resource Locators
	
	@FindBy(xpath="//span[text()='Human Resource']")
	public WebElement HumanResource;
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm btnMDb2']//parent::div[@class='btn-group']")
	public WebElement AddStaff;
	
	@FindBy(xpath="//input[@id='employee_id']")
	public WebElement StaffId;
	//dropdown
	@FindBy(xpath="//select[@id='role']")
	public WebElement StaffRole;
	
	@FindBy(xpath="//select[@id='designation']")
	public WebElement designation;
	@FindBy(xpath="//select[@id='department']")
	public WebElement department;
	//dropdown
	
	@FindBy(xpath="//button[text()='Select Specialist']")
	public WebElement Specialist;   //dropdow without select
	@FindBy(xpath="//input[@id='name']")
	public WebElement fname;
	@FindBy(id="input#surname")
	public WebElement lastname;
	@FindBy(name="gender")
	public WebElement Gender; //dropdown select 
	@FindBy(id="dob")
	public WebElement dateofbirth;
	@FindBy(id="email")
	public WebElement email;
	@FindBy(xpath="//button[@class='btn btn-info pull-right']")
	public WebElement BasicInfoSubmit;
	
//Staff atendance
	@FindBy(xpath="(//a[@class='btn btn-primary btn-sm btnMDb2'])[2]")
	public WebElement staffattendance;
	@FindBy(xpath="//select[@id='class_id']")
	public WebElement Role;
	@FindBy(xpath="//input[@id='date']")
	public WebElement staffattended;
	@FindBy(xpath="(//button[@name='search'])[3]")
	public WebElement staffsearch;
	
	
	
	//Finance 
	
	
	@FindBy(xpath="//span[text()='Finance']") //parent of income and expenses
	WebElement Finance;
	
	@FindBy(xpath="//a[text()=' Income ']")
	WebElement Income;
	@FindBy(xpath="//div[@class='box-tools pull-right']//child::a[@class='btn btn-primary btn-sm addincome']")
	WebElement AddIncome;
	@FindBy(xpath="//select[@id='inc_head_id']") //select 
	WebElement IncomeHead;
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='date']")
	WebElement date;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement amount;
	@FindBy(xpath="//button[@id='add_incomebtn']")
	WebElement incomebtn;
	//Expenses
	@FindBy(xpath="//a[text()=' Expenses']")
	WebElement Expenses;
	@FindBy(xpath="//a[text()='  Add Expense']")
	WebElement AddExpenses;
	@FindBy(xpath="//select[@id='exp_head_id']")
	WebElement ExpensesHead;
	@FindBy(xpath="//input[@id='name']")
	WebElement e_name;
	@FindBy(xpath="//input[@id='date']")
	WebElement expensesDate;
	@FindBy(xpath="//input[@id='amount']")
	WebElement expensesAmount;
	@FindBy(xpath="//button[@id='addexpensebtn']")
	WebElement expensesButton;
	
	
	
			

}
