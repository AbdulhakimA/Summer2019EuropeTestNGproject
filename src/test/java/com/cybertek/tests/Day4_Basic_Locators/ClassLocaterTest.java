package com.cybertek.tests.Day4_Basic_Locators;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocaterTest {
    public static void main(String[] args) {

        WebDriver driver= Web_Driver_Factory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");


        WebElement Home=driver.findElement(By.className("nav-link"));
        Home.click();



      driver.get("http://practice.cybertekschool.com/multiple_buttons");


        System.out.println(driver.findElement(By.className("h3")).getText());

        driver.get("https://tinder.com/app/recs");






    }





}
