package com.stepdefinition;


import org.testng.Assert;

import com.actions.BirthAndDeathActions;
import com.locators.BirthAndDeathLocators;
import com.utility.HelperClass;
import com.utility.Utility;

import io.cucumber.java.en.*;

public class BirthStepdefinition extends Utility {
	BirthAndDeathActions objBDA=new BirthAndDeathActions();
	BirthAndDeathLocators objloc=new BirthAndDeathLocators();
	Utility util=new Utility();

@Given("user is navigate to login page")
public void user_is_navigate_to_login_page() throws InterruptedException {
	 HelperClass.openPage(URL);
	  
	Thread.sleep(2000);
	   objBDA.setAdmin();
	   objBDA.Sigin();
	   System.out.println("Sign is successfully completed !!");
}
@When("user need to click the birth and death record")
public void user_need_to_click_the_birth_and_death_record() throws InterruptedException  {
	objBDA.BirthAnddeath();
	
	System.out.println("Succesfully click the birth and death ");
	
	}


@When("user click the birth record")
public void user_click_the_birth_record() throws InterruptedException {
	objBDA.birthRecord();
	
	System.out.println("user Click the birth record");
}

@When("user click the Add birth record")
public void user_click_the_add_birth_record() throws InterruptedException {
	
	objBDA.AddbirthRecord();
	
	
	System.out.println("clicks the Add birth record");
    
}

@When("user enters the require values")
public void user_enters_the_require_values() throws InterruptedException {
	
    objBDA.AddBirthRecord(ChildName, Weight, Birth, CaseId, Phone, AddreSS, Fathername);
    System.out.println("sends the all the required details to the fileds");
}

@Then("user need to click save")
public void user_need_to_click_save() throws InterruptedException {
	
    objBDA.AddRecord();
    System.out.println("user saves the record!!");
}
// death record
@When("user click the death record")
public void user_click_the_death_record() {
	objBDA.deathrecord();
   System.out.println("user need to click the death record");
}

@When("user click the Add death record")
public void user_click_the_add_death_record() throws InterruptedException {
	objBDA.adddeathRecord();
   System.out.println("user need to add the death record");
}

@When("user enters the valid entires")
public void user_enters_the_valid_entires() {
    
	objBDA.DeathRecord(Case,death,guardian);
	System.out.println("Succesfully credentials entered!!");
}


@Then("user need to click save death record")
public void user_need_to_click_save_death_record() {
  objBDA.AddRecord();
  System.out.println("Succesfully add death record !!");
}

//Human Resource
@When("User clicks the HumanResource")
public void user_clicks_the_human_resource() throws InterruptedException {
	
	objBDA.ClickHuman();
   System.out.println("user clicked the Human Resource Successfully");
}

@When("user clicks the AddStaff")
public void user_clicks_the_add_staff() throws InterruptedException {
	
	objBDA.AddStaff();
  System.out.println("User click the add Staff Button");
}

@When("user need to fill the required fileds")
public void user_need_to_fill_the_required_fileds() {
   
	objBDA.HumanAction(staffid,Fname,date,Mail);
	
    System.out.println("user completed to proivde details");
}

@Then("user need to save the information")
public void user_need_to_save_the_information() {
	objBDA.HumanSubmit();
	Assert.assertTrue(objloc.recordSaved.getText().contains(objBDA.RecordSaved()));
  System.out.println("user save the information Successfully");
  
}

@Then("User need to click the Staff Attendance")
public void user_need_to_click_the_staff_attendance() throws InterruptedException {
	Thread.sleep(2000);
	objBDA.Attendance1();
   System.out.println("User Click the Staff Attendance");
}

@Then("user need to provide the staff attendance")
public void user_need_to_provide_the_staff_attendance() {
	objBDA.ROle();
	objBDA.staffAttendance();
	//objBDA.staffSearch();
	
  System.out.println("user complete the attendance ");
}

@Then("Save the record")
public void save_the_record() {
	objBDA.staffSearch();
  System.out.println("User Finally Saved the Record");
}


//finance


@When("User clicks the Finance")
public void user_clicks_the_finance() {
	objBDA.Finances();
   System.out.println("User clicks the Financ successfully !!");
}

@When("user clicks the Income")
public void user_clicks_the_income() {
	objBDA.IncomeField();
   System.out.println("user choose the income");;
}

@When("user click the Add Income")
public void user_click_the_add_income() {
	objBDA.Addincome();
    System.out.println("user click teh Add Income");
}

@When("user needs to send the required entires")
public void user_needs_to_send_the_required_entires() {
	objBDA.IncomeDetails(IncomeName,IncomeDate,incomeAmount);
	System.out.println("user need to fill the income details");
  
}

@Then("user need to validate the profile")
public void user_need_to_validate_the_profile() {
	objBDA.IncomeSave();
   System.out.println("Save the Income");
}
//expenses

@When("user clicks the expenses")
public void user_clicks_the_expenses() {
	objBDA.expenses();
   System.out.println("user clicks the expenses");
}

@When("user clicks the Add Expenses")
public void user_clicks_the_add_expenses() {
	objBDA.addExpenses();
  System.out.println("user click the add expenses");
}

@When("user need to enter the details")
public void user_need_to_enter_the_details() {
	objBDA.ExpensesDetails( ExpenseName,E_date,amount1);
  System.out.println("user provided the details");
}

@When("user need to save the record")
public void user_need_to_save_the_record() {
	objBDA.ExpensesSave();
  System.out.println("user click the Save Record !!");
}

@When("user click the messaging")
public void user_click_the_messaging() {
	objBDA.messageIcon();
  System.out.println("user click the messaging");
}

@When("user click the post messaging")
public void user_click_the_post_messaging() {
	objBDA.PostMessage();
    System.out.println("user click the post messaging icon");
}

@When("user need to give value for required fields")
public void user_need_to_give_value_for_required_fields() {
	objBDA.SetTitle(title);

	objBDA.message_box(message);
	objBDA.Notice(NoticeDate);
	objBDA.SetPublishOn(publish);
    System.out.println("user need to give the required values");
}

@When("user click the Send button")
public void user_click_the_send_button() {
	objBDA.SendMSg();
  System.out.println("user click the send button");
}

@When("user need to logout")
public void user_need_to_logout() {
	objBDA.AdminProfile();
	Assert.assertSame(objBDA.AdminName().contains("Super Admin "),"this successfully logout!!");
  System.out.println("user logout from the particular login");
}




	
	
	
}
