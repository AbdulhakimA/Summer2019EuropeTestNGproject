package com.cybertek.tests.Day4_Basic_Locators;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinktextpartiolLinktest {


    public static void main(String[] args) {


        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
         driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link3=driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));

        link3.click();

        WebElement Home=driver.findElement(By.linkText("Home"));

        Home.click();

       driver.navigate().back();

        WebElement link=driver.findElement(By.partialLinkText("Example 6"));


        link.click();


    }
}
