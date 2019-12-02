package com.cybertek.tests.Day3_webelement_intro;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifiURLnotChange {




    public static void main(String[] args) throws InterruptedException {
        //open chrome
        WebDriver driver= Web_Driver_Factory.getdriver("chrome");


        //go to this webpage belove
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected url to String
        String expectedURl=driver.getCurrentUrl();

        //find the Retive password element
        WebElement retripassword=driver.findElement(By.id("form_submit"));


        //click the Retrive password
        retripassword.click();

         //Save the actual URl to String
        String actualURl=driver.getCurrentUrl();


        //Verify URL not changed
       if(expectedURl.equals(actualURl))
       {
           System.out.println("PASS");
       }else
       {
           System.out.println("FAIl");
       }

        /**
         * Verify URL changed
         * open chrome
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */


         //open chrome
































        Thread.sleep(3000);
         driver.quit();

    }

}
