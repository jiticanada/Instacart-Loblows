package com.instacart.springbootcucumber.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.instacart.springbootcucumber.elements.StoresAndDeliveryTimesElements;

import graphql.Assert;

public final class StoresAndDeliveryTimesPage {

	WebDriver driver;
	StoresAndDeliveryTimesElements storesAndDelTimesElements = new StoresAndDeliveryTimesElements();


	public void verifyHome()
	{
		Assert.assertTrue(storesAndDelTimesElements.showAllBtn.isDisplayed());
	}


	public void clickShowAll() 
	{
		storesAndDelTimesElements.showAllBtn.click();
	}


	public void getStoreNamesAndDeliveryTimes() 
	{

		Map<String, String> store_Time = new HashMap<String, String>();

		List<WebElement> fullStoresList = driver.findElements(By.xpath(storesAndDelTimesElements.totalStores));

		for (int i = 1; i <= fullStoresList.size(); i++) 
		{
			String storeName = driver.findElement(By.xpath("//ul[@class='css-10xe3gn']/li[i]/descendant::p[1]")).getText();
			String storeDeliveryTime = driver.findElement(By.xpath("//ul[@class='css-10xe3gn']/li[i]/descendant::p[2]")).getText();

			store_Time.put(storeName, storeDeliveryTime);

			System.out.println(storeName + "  "+ storeDeliveryTime);

		}
	}
}
