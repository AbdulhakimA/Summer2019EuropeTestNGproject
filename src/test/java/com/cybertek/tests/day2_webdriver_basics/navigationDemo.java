package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
          //navigate to website
        driver.get("https://www.google.com");
        // another way of opinig wesite
        driver.navigate().to("https://www.facebook.com");
//goes back to previes one
driver.navigate().back();
Thread.sleep(3000); //stops code based on that number 1000=1 second
//goes forward
driver.navigate().forward();
//refresh the page
        driver.navigate().refresh();

    }







}
