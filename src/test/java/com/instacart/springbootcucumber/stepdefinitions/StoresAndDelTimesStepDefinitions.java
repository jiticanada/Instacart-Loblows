package com.instacart.springbootcucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.instacart.springbootcucumber.pages.StoresAndDeliveryTimesPage;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StoresAndDelTimesStepDefinitions {

	StoresAndDeliveryTimesPage storesAndDelTimes = new StoresAndDeliveryTimesPage();
	
	@Given("^the user is on Instacart home page$")
	public void the_user_is_on_instacart_home_page() throws Throwable {
		storesAndDelTimes.verifyHome();
	}

	@When("^the user clicks on Show all button$")
	public void the_user_clicks_on_show_all_button() throws Throwable {
		storesAndDelTimes.clickShowAll();
	}

	@Then("^the delivery times should be displayed for all the stores$")
	public void the_delivery_times_should_be_displayed_for_all_the_stores() throws Throwable {
		storesAndDelTimes.getStoreNamesAndDeliveryTimes();
	}

}
