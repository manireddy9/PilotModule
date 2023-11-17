package com.stepdefinition;


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
	//objBDA.BirthAnddeath();
	Thread.sleep(3000);
	System.out.println("Succesfully click the birth and death ");
	
	}


@When("user click the birth record")
public void user_click_the_birth_record() throws InterruptedException {
	objBDA.clickBirth();
	
	System.out.println("user Click the birth record");
}

@When("user click the Add birth record")
public void user_click_the_add_birth_record() throws InterruptedException {
	
	objBDA.AddbirthRecord();
	
	
	System.out.println("clicks the Add birth record");
    
}

@When("user enters the require values")
public void user_enters_the_require_values() throws InterruptedException {
	Thread.sleep(5000);
    objBDA.AddBirthRecord(ChildName, Weight, Birth, CaseId, Phone, AddreSS, Fathername);
    System.out.println("sends the all the required details to the fileds");
}

@Then("user need to click save")
public void user_need_to_click_save() throws InterruptedException {
	Thread.sleep(3000);
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
 
	objBDA.DeathRecord(CaseId, Fathername, AddreSS);
	System.out.println("Succesfully credentials entered!!");
}


@Then("user need to click save death record")
public void user_need_to_click_save_death_record() {
  objBDA.AddRecord();
  System.out.println("Succesfully add death record !!");
}


	
	
}
