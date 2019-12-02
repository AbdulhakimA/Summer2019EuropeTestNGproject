package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.WebDriver;

public class callwebdriverfactory {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= Web_Driver_Factory.getdriver("chrome");


        driver.get("https://www.google.com");


        Thread.sleep(5000);

        driver.quit();


    }






}
