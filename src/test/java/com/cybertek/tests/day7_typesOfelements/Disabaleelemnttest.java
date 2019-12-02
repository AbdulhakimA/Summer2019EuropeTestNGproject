package com.cybertek.tests.day7_typesOfelements;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Disabaleelemnttest {
    @Test
            public void test1(){
        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement greenRadiobutten= driver.findElement(By.id("green"));

        System.out.println("is element enable = "+greenRadiobutten.isEnabled());
        Assert.assertFalse(greenRadiobutten.isEnabled(),"verify that green button is enable");




    }

@Test
    public void test2(){

    WebDriver driver= Web_Driver_Factory.getdriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dynamic_controls");

   WebElement inbutbox=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
    System.out.println("is input enable: "+ inbutbox.isEnabled());
    inbutbox.sendKeys("hithere");

}






}
