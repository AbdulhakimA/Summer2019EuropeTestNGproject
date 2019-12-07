package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {
    WebDriver driver;

  @BeforeMethod
    public void setupMethod(){
      driver=Web_Driver_Factory.getdriver("chrome");

      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

  }


  @AfterMethod
    public void tearDownMethod() throws InterruptedException {
      Thread.sleep(2000);
      driver.quit();
  }

  @Test
    public void test1(){
      driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

      String massage =driver.findElement(By.id("finish")).getText();


      System.out.println(massage);

  }
}
