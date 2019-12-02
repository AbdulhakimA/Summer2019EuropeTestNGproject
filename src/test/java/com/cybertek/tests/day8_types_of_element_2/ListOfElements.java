package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    @Test
    public void test1(){
        WebDriver driver= Web_Driver_Factory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        //get all webelement which is buttons
        List<WebElement> buttons=driver.findElements(By.tagName("button"));

        Assert.assertEquals(buttons.size(),6,"verify we got 6 buttons");

        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }
    }


    @Test
    public void test2(){

        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

     List<WebElement> buttons=driver.findElements(By.tagName("buttonsdlskjfs"));

        System.out.println(buttons.size());

    }



}
