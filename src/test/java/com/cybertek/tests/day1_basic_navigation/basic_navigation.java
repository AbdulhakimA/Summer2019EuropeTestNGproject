package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {


    public static void main(String[] args) {
// we have to setup webdrivwer based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();      //change the browser if u want to aotumate
        // creating objoket using selenium driver
        WebDriver driver =new ChromeDriver();


       driver.get("http://amazon.com");

        System.out.println(driver.getTitle());

         String d=driver.getTitle();
         String f="";
        for(int i=0;i<d.length();i++){

           f=f+d.charAt(i);



        }
        System.out.println(f);
        if(f.equals(d)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }







}
