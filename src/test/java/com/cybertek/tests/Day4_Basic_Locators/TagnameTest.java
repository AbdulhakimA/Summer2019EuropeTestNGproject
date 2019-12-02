package com.cybertek.tests.Day4_Basic_Locators;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= Web_Driver_Factory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement Full_name=driver.findElement(By.tagName("input"));

        Full_name.sendKeys("Abdulhakim");

        WebElement email =driver.findElement(By.name("email"));

        email.sendKeys("114jaf@qq.com");

        WebElement signup = driver.findElement(By.tagName("button"));

        signup.click();


         WebElement printmassage=driver.findElement(By.tagName("h3"));



          String print=printmassage.getText();


         System.out.println("print = " + print);


        //Thread.sleep(5000);
        //driver.quit();
    }
}
