package com.cybertek.tests.day9_popups_tabs_frams;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframe {

    WebDriver driver;

    @BeforeMethod
    public void webDriver(){
       driver= Web_Driver_Factory.getdriver("chrome") ;


    }

    @AfterMethod
    public void quit() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        //how to Switch frames
        //1.switch by using id or name attribute of Iframe
        driver.switchTo().frame("mce_0_ifr");

        Thread.sleep(3000);
        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(3000);
        //locate the element and sen keys to that element
        driver.findElement(By.id("tinymce")).sendKeys("Hello World!");

        Thread.sleep(3000);
        //Switch back to main frame
        driver.switchTo().defaultContent();
        Thread.sleep(3000);



        //Using index

        driver.switchTo().frame(0);


        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(3000 );
        //Locate and send some keyss
        driver.findElement(By.id("tinymce")).sendKeys("What are you doing?");

        driver.switchTo().parentFrame();
        //go back to first frame .only to parent


        //3.using WebElement
        WebElement frameelement=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameelement);

        driver.findElement(By.id("tinymce")).clear();
        //locate and send tex

        driver.findElement(By.id("tinymce")).sendKeys("we are finished");




    }


    @Test
    public void multipleFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        //get tex of frame middle
        System.out.println(driver.findElement(By.id("content")).getText());

        //go back to frame parent
        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);

        //get the tex of right frame

        System.out.println(driver.findElement(By.tagName("body")).getText());

        //back to parent frame
        driver.switchTo().parentFrame();

        //switch using as webElement
        WebElement frame=driver.findElement(By.name("frame-left"));
        driver.switchTo().frame(frame);

        System.out.println(driver.findElement(By.tagName("body")).getText());



        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        System.out.println(driver.findElement(By.tagName("body")).getText());

        System.out.println();



    }

}
