package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {


    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {

        // Web driver hierarchy

        // SearchContext(I) -> (2) -> WebDriver(I) -> (10) -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) (25) -> EdgeDriver(C)-> (45)

        // SearchContext(I)
        // -> WebDriver(I)
        // ->  RemoteWebDriver(C)
        // -> ChromiumDriver(C)
        //-> EdgeDriver(C)


        // SearchContext(I) - Interface - findElement, findElement - GGF
        // WebDriver(I) - Interface - some incomplete function - GF
        // RemoteWebDriver(C) - Class - It also has some function - F
        // ChromeDriver(C), FirefoxDriver,EdgeDriver,SafariDriver,InternetExploreDriver - class - S

        // SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        // RemoteWebDriver driver1 = new ChromeDriver();
        // ChromeDriver driver = new ChromeDriver();

        // Scenario
        // 1. Do you want to run on Chrome or Edge?
        // ChromeDriver driver = new ChromeDriver(); - 1%

        // 1. Do you want to run on Chrome then change to Edge?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();// 97%
        driver = new FirefoxDriver(); //

        // 1. Do you want to run on multiple browser, aws machine , ? - 2%
        // RemoteWebDriver driver (with GRID)- Advance (Last 2 Sessions)c





    }
}
