package com.cybertek.tests.day6_css;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class css {
    public static void main(String[] args) {


        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        WebElement dotclickButton=driver.findElement(By.cssSelector("[onclick='button1()']"));

        String message=dotclickButton.getText();
        System.out.println("message = " + message);


    }
}
