package com.cybertek.tests.day8_types_of_element_2;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SlectClassDropDowns {

    @Test
    public void  test1(){


        WebDriver driver= Web_Driver_Factory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdown=driver.findElement(By.id("state"));

        Select stateList=new Select(dropdown);

        //we use grt option for select the all the option in the drop down
        List<WebElement> options =stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }



    }


    @Test
    public void test2() throws InterruptedException {

        WebDriver driver= Web_Driver_Factory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdown=driver.findElement(By.id("state"));

        Select stateList=new Select(dropdown);

        String expectedResult="Select a State";
       String actualOption= stateList.getFirstSelectedOption().getText();


        Assert.assertEquals(actualOption,expectedResult,"verify that selection is select a state");

        //how to select option from the dropdown
        //1.using visible text
        Thread.sleep(3000);
        List<WebElement> options =stateList.getOptions();

        for (WebElement option : options) {
            //System.out.println(option.getText());

            //select the options in the dropdown
            stateList.selectByVisibleText(option.getText());

            //save the actual result By getFirstSelectedMethod
            actualOption= stateList.getFirstSelectedOption().getText();
            //than verify the actual and expected result
            Assert.assertEquals(actualOption,option.getText(),"verify that"+option.getText()+"is selected");


        }
        //actualOption= stateList.getFirstSelectedOption().getText();


        //Assert.assertEquals(actualOption,"Texas");



        //2. select the option by index
        stateList.selectByIndex(34);
        System.out.println(stateList.getFirstSelectedOption().getText());


           //3.using Value
           //Scanner atribute= new Scanner(System.in);
       // System.out.println("Enter attribute value");
          // String value=atribute.nextLine();

           stateList.selectByValue("AL");

           actualOption=stateList.getFirstSelectedOption().getText();

           Assert.assertEquals(actualOption,"Alabama","verify that Alabama is selected");





    }








}
