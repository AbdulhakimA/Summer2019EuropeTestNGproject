package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AtrubuteTest {


   @Test
   public void test1() {

       WebDriver driver= Web_Driver_Factory.getdriver("chrome");
       driver.get("http://practice.cybertekschool.com/radio_buttons");

       WebElement radioButten=driver.findElement(By.id("blue"));
       System.out.println(radioButten.getAttribute("name"));

       System.out.println(radioButten.getAttribute("type"));

       System.out.println(radioButten.getAttribute("id"));

       System.out.println(radioButten.getAttribute("value"));

       //attribute without value (checked)

       //checked attribute returns boolean
       System.out.println(radioButten.getAttribute("checked"));

       System.out.println(radioButten.getAttribute("outerHTML"));

       System.out.println(radioButten.getAttribute("innerHTML"));



       driver.quit();
   }






}
