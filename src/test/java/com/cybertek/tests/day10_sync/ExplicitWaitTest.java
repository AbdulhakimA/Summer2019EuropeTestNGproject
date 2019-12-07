package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = Web_Driver_Factory.getdriver("chrome");


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
       Thread.sleep(2000);
       driver.quit();

    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");


        //click the start button
        driver.findElement(By.tagName("button")).click();

        //how to wait XPILICITLY?
        //Create Expilicit object




        //find the userName input box
        WebElement userName= driver.findElement(By.id("username"));


        //how to wait XPILICITLY?
        //Create Expilicit object
        WebDriverWait wait= new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOf(userName));

        //sending user name to inbox
        userName.sendKeys("MikeSmith ");

    }

    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");


        //click enable button
        driver.findElement(By.xpath("//*[text()='Enable']")).click();

        //find the inputBox
        WebElement inputBox=driver.findElement(By.cssSelector("input[type='text']"));

        WebDriverWait wait=new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(inputBox));

        inputBox.sendKeys("mikeSmith");





    }

}
