package org.stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.repository.PageClass;
import org.resources.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends Utility {
	PageClass p;
	@Given("user launches facebook application")
	public void user_launches_facebook_application() {
   launchApp("https://www.facebook.com/");
	}


	@When("user enters valid credentials")
	public void user_enters_valid_credentials(io.cucumber.datatable.DataTable table) {
	   Map<String, String> map = table.asMap(String.class,String.class);
	   p=new PageClass();
	   fill(p.getUser(),map.get("username"));
	   fill(p.getPassword(),map.get("password"));
	   tap(p.getBtn());
	}


	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	 System.out.println("Completed");
	}

}
