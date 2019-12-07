package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThreadSleepExample {

  WebDriver driver;


  @BeforeMethod
    public  void setupMethod(){
      driver=Web_Driver_Factory.getdriver("chrome");


  }


  @AfterMethod

    public void tearDownMethod() throws InterruptedException {
      Thread.sleep(3000);
      driver.quit();
  }


  @Test

    public void Test1() throws InterruptedException {

      driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
      Thread.sleep(5000);
      driver.findElement(By.id("username")).sendKeys("MIkeSmith");
  }
}

