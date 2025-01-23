package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {


@Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01(){

   // Selenium 3
    // You need to setup the Driver(browser)
   // System.getProperties("webdriver.gecko.driver","/path/geckdriver");

    // Selenium 4
    // Selenium Manager - utility - Which can download the driver automaticially
    // start and stop itself.
    EdgeDriver driver = new EdgeDriver();
    driver.get("http://google.com");

    }
}
