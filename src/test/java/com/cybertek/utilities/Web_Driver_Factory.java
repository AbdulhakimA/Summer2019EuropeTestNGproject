package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Driver_Factory {
   //write a static method that takes a string parameter
    // based on value of the parameter
    //the method must chromedriver or firefoxdriver object
    //name: getdriver

    public static WebDriver getdriver(String browsertype){

        WebDriver driver=null;
        switch(browsertype.toLowerCase())
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

        }
        return driver;
    }








}
