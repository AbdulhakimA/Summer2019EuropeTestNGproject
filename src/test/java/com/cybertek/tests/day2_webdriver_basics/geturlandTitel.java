package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturlandTitel {
    public static void main(String[] args) {


               WebDriverManager.chromedriver().setup();
               WebDriver driver =new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
        //get the titels of the page
         String titile=driver.getTitle();
         System.out.println("tittles = "+titile);

          //get the cuurent URl of the page
         String cuurenturl=driver.getCurrentUrl();
        System.out.println("cuurenturl = " + cuurenturl);

         //gets the sorce ofcode of the page
        String sorecode=driver.getPageSource();
        System.out.println("sorecode = " + sorecode);



    }
}
