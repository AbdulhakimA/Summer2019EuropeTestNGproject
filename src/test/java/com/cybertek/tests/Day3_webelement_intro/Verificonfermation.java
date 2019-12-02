package com.cybertek.tests.Day3_webelement_intro;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verificonfermation {
/**
 * open browser
 * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
 * enter any email
 * verify that email is displayed in the input box
 * click on Retrieve password
 * verify that confirmation message says 'Your e-mail's been sent!'
 */

public static void main(String[] args) throws InterruptedException {
    WebDriver driver= Web_Driver_Factory.getdriver("chrome");

    driver.get("http://practice.cybertekschool.com/forgot_password");


    WebElement emailbox=driver.findElement(By.name("email"));


    String ecpectedemail="114843107@qq.com";

    emailbox.sendKeys(ecpectedemail);

    emailbox.getAttribute("value");

    String actualemail=emailbox.getAttribute("value");

    if(ecpectedemail.equals(actualemail))
    {
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }


    WebElement Retivepassword=driver.findElement(By.id("form_submit"));


    Retivepassword.click();

    WebElement TExt =driver.findElement(By.name("confirmation_message"));

   String actuamassage=TExt.getText();
   String expectedmassage="Your e-mail's been sent!";
   if(actuamassage.equals(expectedmassage))
   {
       System.out.println("PASS");
   }else
   {
       System.out.println("FAIL");
       System.out.println("Expextet massage " +expectedmassage);
       System.out.println("Actual massage "+  actuamassage);
   }

   Thread.sleep(5000);
   driver.quit();
}

}
