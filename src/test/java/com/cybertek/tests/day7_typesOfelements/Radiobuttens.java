package com.cybertek.tests.day7_typesOfelements;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Radiobuttens {

  @Test
  public void test1(){
      WebDriver driver= Web_Driver_Factory.getdriver("chrome");
      driver.manage().window().maximize();
      driver.get("http://practice.cybertekschool.com/radio_buttons");


     WebElement blueradiobutten =driver.findElement(By.id("blue"));
     WebElement redRadioButton=driver.findElement(By.id("red"));


      System.out.println(" is blue clected = " +blueradiobutten.isSelected());
      System.out.println("red clected = "+redRadioButton.isSelected());

      //Assert.assertTrue(blueradiobutten.isSelected(),"verifi that button is slected");
      //Assert.assertFalse(redRadioButton.isSelected(),"verifi that red butten is not slected");


      redRadioButton.click();


      Assert.assertFalse(blueradiobutten.isSelected(),"verifi that blue is not slected");
      Assert.assertTrue(redRadioButton.isSelected(),"verifi that red is slected");


      driver.quit();


  }


}
