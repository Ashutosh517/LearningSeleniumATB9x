package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


@Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01(){

        // Open A URL
        // Print the title
        FirefoxDriver driver = new FirefoxDriver();
    EdgeDriver driver1 = new EdgeDriver();
    // new EdgeDriver() ---> POST Request (localhost:56055),Create session end point
    //Edge Real Browser


//        driver.get("https://app.vwo.com");
//        System.out.println(driver.getTitle());
    }
}
