package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fileupload {

   WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
        driver = Web_Driver_Factory.getdriver("chrome");


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
             Thread.sleep(2000);
            driver.quit();

    }

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.name("file")).sendKeys("/Users/hakim/Desktop/file.tex");

        driver.findElement(By.id("file-submit")).click();


        System.out.println(driver.findElement(By.tagName("h3")).getText());


        String actualFile=driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFile,"file.tex","verify the file name");


    }
    @Test
    public void test2(){


        driver.get("http://practice.cybertekschool.com/upload");

        String projectPath=System.getProperty("user.dir");
        String relativePath="src/test/Resources/Kazanqi_Folk_Tourism_District_2017_gbtimes_03_cropped.jpg";


        String filePath=projectPath+"/"+  relativePath;


        driver.findElement(By.name("file")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();


        System.out.println(driver.findElement(By.tagName("h3")).getText());


        String actualFile=driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFile,"Kazanqi_Folk_Tourism_District_2017_gbtimes_03_cropped.jpg","verify the file name");

    }
}
