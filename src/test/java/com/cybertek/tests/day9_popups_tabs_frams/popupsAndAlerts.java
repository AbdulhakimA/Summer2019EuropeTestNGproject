package com.cybertek.tests.day9_popups_tabs_frams;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class popupsAndAlerts {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

         driver = Web_Driver_Factory.getdriver("chrome");



    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //locating and clicking the destroy button
        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();

        driver.findElement(By.xpath("//*[text()='No']")).click();
    }


    @Test
    public void Alarts() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/javascript_alerts");


        driver.findElement(By.xpath("//button[1]")).click();


        //conttroling the alert using with Alert class
        Alert alert = driver.switchTo().alert();

        //accept alert-->clicking OK int the alerts
        alert.accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//*[text()='You successfuly clicked an alert']")).getText());


        driver.findElement(By.xpath("//button[2]")).click();

        //this is for click cancel
        Thread.sleep(4000);
        alert.dismiss();

        //Clicking JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("Hello");
        Thread.sleep(3000);
        alert.accept();


    }




}
