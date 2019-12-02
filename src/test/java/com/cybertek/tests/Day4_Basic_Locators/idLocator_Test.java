package com.cybertek.tests.Day4_Basic_Locators;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocator_Test {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Web_Driver_Factory.getdriver("chrome");
        driver.manage().window().maximize();
         driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontclickButton=driver.findElement(By.id("disappearing_button"));

        dontclickButton.click();























         Thread.sleep(5000);

         driver.quit();
    }




}
