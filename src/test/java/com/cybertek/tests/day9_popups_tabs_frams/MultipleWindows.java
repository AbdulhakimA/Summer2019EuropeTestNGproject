package com.cybertek.tests.day9_popups_tabs_frams;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
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
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Before clicking the link "+driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("After clicking the link "+driver.getTitle());

        //code for switching windows, we have to pass handle.
        //driver.switchTo().window()

        String currentWindowhandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowhandle);
        //After this line .our purpose is switching to new window

        //Set is just like arrayList but without duplicate values
        Set<String> windowHandle=driver.getWindowHandles();

        //how many diffrent handles it is keeping
        System.out.println(windowHandle.size());


        //get new window handle from set  of handle

        for (String handle: windowHandle) {

            if(!currentWindowhandle.equals(handle))
            {
                driver.switchTo().window(handle);
            }
        }

        System.out.println("After Switching the link "+driver.getTitle());



    }

    @Test
    public void moreThan2window(){
        driver.get("http://practice.cybertekschool.com/windows");

        String targetWindowTitle="New Window";
        driver.findElement(By.linkText("Click Here")).click();


        //check how many windows we have

        System.out.println(driver.getWindowHandles().size());


        Set<String> windowHandle=driver.getWindowHandles();

        for (String handle : windowHandle) {

            driver.switchTo().window(handle);
            if(driver.getTitle().equals(targetWindowTitle))
            {
                break;
            }
        }
        System.out.println(driver.getTitle());
    }



}
