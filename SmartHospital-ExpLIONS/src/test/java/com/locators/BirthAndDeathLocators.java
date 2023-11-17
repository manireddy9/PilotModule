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
	@FindBy(xpath="//li[@class='active']//a[1]")
	public WebElement clickbirth;
	
	@FindBy(xpath="(//a[contains(text(),'Birth Record')])[1]")
	public WebElement addbirthrecord;
	
	@FindBy(xpath="//div[contains(@class,'box-tools addmeeting')]//a[1]")
	public WebElement plus;
	
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
	
	
			

}
