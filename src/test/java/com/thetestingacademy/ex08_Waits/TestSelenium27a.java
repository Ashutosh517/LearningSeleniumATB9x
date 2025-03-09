package com.thetestingacademy.ex08_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium27a {

    @Description("Verify that with invalid email, pass, error message is shown")
    @Test
    public void testVwoLoginNegative() throws Exception{



        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        // FindElement --> 1 element first web element
        // FindElements --> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());




        // Condition
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        Thread.sleep(10000);



        driver.quit();
    }



    }












