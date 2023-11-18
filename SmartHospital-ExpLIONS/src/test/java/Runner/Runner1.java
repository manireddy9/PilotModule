package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags="@BirthRecord",features="src\\test\\resources\\Features\\data.feature",glue="com.stepdefinition",plugin = { "pretty","html:target/cucumber-reports"})
		
public class Runner1 {
	

}
//{"pretty","json:target/cucumber-reports/Cucumber.json"},
//{"pretty","junit:target/cucumber-reports/Cucumber.xml" })