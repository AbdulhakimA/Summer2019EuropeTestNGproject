package com.cybertek.tests.day11_actions_jsexcuter;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
    WebDriver driver;

    WebElement user;

    //Actions actions =new Actions(driver);

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
       driver.get("http://practice.cybertekschool.com/hovers");


       //actions object contains all the user interacter
        Actions action = new Actions(driver);



        user = driver.findElement(By.tagName("img"));

        //move your mouse to webelement (hover over)
        action.moveToElement(user).perform();

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed(),"Verify view profile is display");


        user=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));


        action.moveToElement(user).perform();


        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed(),"Verify view profile is display");

    }


    @Test
    public void test2(){

      driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");

      Actions actions=new Actions(driver);

      //we have to provide source and target to this method

        //grag this element
        WebElement graggBall=driver.findElement(By.id("draggable"));

        //drop inside this element
        WebElement target=driver.findElement(By.id("droptarget"));

        //waiting just like Thred.sleep();

        actions.pause(1000);


        actions.dragAndDrop(graggBall,target).perform();


        System.out.println(target.getText());
    }

    @Test

    public void dragAndDropChaining(){

        driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");

        Actions actions=new Actions(driver);

        //we have to provide source and target to this method

        //grag this element
        WebElement graggBall=driver.findElement(By.id("draggable"));

        //drop inside this element
        WebElement target=driver.findElement(By.id("droptarget"));

        //waiting just like Thred.sleep();

        actions.pause(1000);

        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();


        //if you are chaining actions we add build () method before perform
        actions.moveToElement(graggBall).clickAndHold().moveToElement(target).pause(1000).release().build().perform();



    }

}
