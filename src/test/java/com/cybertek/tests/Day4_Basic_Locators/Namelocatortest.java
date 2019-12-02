package com.cybertek.tests.Day4_Basic_Locators;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Namelocatortest {

    public static void main(String[] args) throws InterruptedException {
         //open browser
        WebDriver driver= Web_Driver_Factory.getdriver("chrome") ;
        //go to web page
        driver.get("http://practice.cybertekschool.com/sign_up");

        //Enterfullname
        WebElement Fullname =driver.findElement(By.name("full_name"));
        Fullname.sendKeys("mike smith");
        //Enter email
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("mikesmith@gmail.com");

        //Click the sign up button
        WebElement signUP=driver.findElement(By.name("wooden_spoon"));
        signUP.click();

        String ecpectedmassege="Thank you for signing up. Click the button below to return to the home page.";

       WebElement massage=driver.findElement(By.name("signup_message"));


        String actualmassge=massage.getText();

          if(ecpectedmassege.equals(actualmassge))
                  {
                      System.out.println("PASS");
                  }else
                            {
                             System.out.println("FAIL");
                                System.out.println("ecpectedmassege = " + ecpectedmassege);
                                System.out.println("actualmassge = " + actualmassge);
                            }


                      Thread.sleep(5000);

                       driver.quit();
      }







}
