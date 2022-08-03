package com.instacart.springbootcucumber.elements;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.instacart.springbootcucumber.driverscript.DriverScript;

public final class StoresAndDeliveryTimesElements {

	@FindBy(css="button.css-xp22gy")
	public WebElement showAllBtn;

	public String allStores = "ul[class=\\\"css-10xe3gn\\\"]"; 
	public String totalStores = "//ul[@class='css-10xe3gn']/li";
}
