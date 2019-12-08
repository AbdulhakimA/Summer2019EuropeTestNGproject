package com.cybertek.tests.day11_actions_jsexcuter;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecuterDemo {

    WebDriver driver;



    //Actions actions =new Actions(driver);

    @BeforeMethod
    public void setUpMethod(){
        driver = Web_Driver_Factory.getdriver("chrome");


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/");


        WebElement link =driver.findElement(By.linkText("Dropdown"));

        JavascriptExecutor jse =(JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click();",link);


    }


    @Test
    public void  type(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //find webElement inputBox
        WebElement typeBox=driver.findElement(By.cssSelector("form#input-example>input"));

        // create jvaScript object
        JavascriptExecutor jse= (JavascriptExecutor)driver;


        String str ="MikeSmith";

        //sent keys to inputBox
        jse.executeScript("arguments[0].setAttribute('value', '"+str+"')",typeBox);



    }

    @Test
    public void Scroll() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        for (int i = 0; i < 10; i++) {

            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0,1000)");
            
        }



    }

}
