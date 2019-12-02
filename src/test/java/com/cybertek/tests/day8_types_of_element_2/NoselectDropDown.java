package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoselectDropDown {


    @Test
    public void BeforeMethod() throws InterruptedException {
        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


        WebElement dropdown=driver.findElement(By.id("dropdownMenuLink"));
       dropdown.click();
     List<WebElement> listOfLinks =driver.findElements(By.className("dropdown-item"));
        System.out.println("Number Of  Links "+listOfLinks.size());

        for (WebElement listOfLink : listOfLinks) {
            System.out.println(listOfLink.getText());
        }


        listOfLinks.get(4).click();
        Thread.sleep(5000);
        driver.quit();
    }














}
