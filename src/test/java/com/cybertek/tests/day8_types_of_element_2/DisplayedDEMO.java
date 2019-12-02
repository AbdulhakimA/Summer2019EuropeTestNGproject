package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDEMO {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = Web_Driver_Factory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");


        WebElement UserNameInput=driver.findElement(By.id("username"));

        System.out.println(UserNameInput.isDisplayed());

        Assert.assertFalse(UserNameInput.isDisplayed());



        WebElement StartButton=driver.findElement(By.cssSelector("#start>button"));

        StartButton.click();


        Thread.sleep(5000);

        System.out.println(UserNameInput.isDisplayed());

        Assert.assertTrue(UserNameInput.isDisplayed());



    }






}
