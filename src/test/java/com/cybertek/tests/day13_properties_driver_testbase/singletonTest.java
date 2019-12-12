package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class singletonTest {


    @Test
    public void test(){

        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();


        System.out.println(s1);
        System.out.println(s2);





    }


    @Test
    public void test2(){

        //this how we create our WebDriver object from now on
        //type of the driver come from the configuration.properties file
        WebDriver driver= Driver.get();

        //we are get the URL from configuration.properties file
        driver.get(ConfigurationReader.get("url"));





    }


    @Test
    public void test3() throws InterruptedException{

        Thread.sleep(5000);
        Driver.get().get("http://amazon.com");

        Driver.closeDriver();

    }








}
