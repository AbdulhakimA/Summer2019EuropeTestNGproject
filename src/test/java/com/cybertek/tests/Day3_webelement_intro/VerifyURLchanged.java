package com.cybertek.tests.Day3_webelement_intro;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Verify URL changed
 * open chrome
 * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
 * enter any email
 * click on Retrieve password
 * verify that url changed to http://practice.cybertekschool.com/email_sent
 */

public class VerifyURLchanged {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Web_Driver_Factory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");



        //find email element
        WebElement email=driver.findElement(By.name("email"));


        //send data to email box
        email.sendKeys("1148431097@qq.com");

        //find the Retrive Password to click
        WebElement Retrivepassword=driver.findElement(By.id("form_submit"));
        Retrivepassword.click();

       //save the URL after click
        String actualURL =driver.getCurrentUrl();

        String expectedURL="http://practice.cybertekschool.com/email_sent";


if(actualURL.equals(expectedURL))
{
    System.out.println("PASS");
}else
{
    System.out.println("FAIL");
    System.out.println("Expected URL " + expectedURL);
    System.out.println("Actual URL" +actualURL);
}










        Thread.sleep(3000);
        driver.quit();
    }




}
