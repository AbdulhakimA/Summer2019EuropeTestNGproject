package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckboxDemo {


    @Test
    public void test1(){

        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("//input[1]"));


        WebElement checkbox2=driver.findElement(By.xpath("//input[2]"));


        //checkbox1.click();
       Assert.assertFalse(checkbox1.isSelected(),"verify checkbox1 is unselected");
       Assert.assertTrue(checkbox2.isSelected(),"verify checkbox1 is  selected");



       checkbox1.click();

        Assert.assertTrue(checkbox1.isSelected(),"verify checkbox1 is unselected");
        Assert.assertTrue(checkbox2.isSelected(),"verify checkbox1 is  selected");


    }



}
