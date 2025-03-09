package com.thetestingacademy.ex08_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestSelenium25a {

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_verify_print_imac_price() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("---start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        // #gh-ac
        //input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBox.sendKeys("macmini");// Find the "macmini"

        WebElement searchBoxButton = driver.findElement(By.cssSelector("input[value='Search']"));
        searchBoxButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }










    }

