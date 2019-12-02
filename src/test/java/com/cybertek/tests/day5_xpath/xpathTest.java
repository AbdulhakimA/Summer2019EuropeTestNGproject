package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathTest {
    public static void main(String[] args) {


        WebDriver driver= Web_Driver_Factory.getdriver("chrome");
        driver.get("http://amazon.com");

        WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        String keyword="dsfasdfasdfasdfasdf";
        homebutton.sendKeys(keyword);

        WebElement seartch=driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));


        seartch.click();

        WebElement findresult =driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/h1/div/div[1]/div/div/span[1]"));

        String result=findresult.getText();
        String result3="";
        if(result.contains("over"))
        {
            String[] result1=result.split(" ");
            result3=result1[3];


        }else if (result.contains("of"))
        {
            String[] result1=result.split(" ");
            result3=result1[2];
        }else if (result.contains("for"))
        {
            String[] result1=result.split(" ");
            result3=result1[0];
        }

        if(result3.contains(","))
        {

          String[] s=result3.split(",") ;
          String Result="";
          for(int i=0;i<s.length;i++)
          {
              Result+=s[i];

          }

          int Result1=Integer.parseInt(Result);
            System.out.println("Result = " + Result1);

        }else
        {
            System.out.println("Result= " + result3);
        }

        if (result.contains("No results "))
        {
            int f=0;
            System.out.println("result = " + result+""+keyword);
            System.out.println("Result = " + f);
        }



        driver.quit();
    }
}
