package com.cybertek.tests.day14_pom_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLogin extends TestBase {

    @Test
    public void WrongPasswordTest(){

        //use login class to navigate login element and send keys to inbox
        LoginPage logInPage =new LoginPage();

        logInPage.usernameInput.sendKeys("user1");
        logInPage.passwordInout.sendKeys("sodsf");
        logInPage.logIn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");


    }

    @Test
    public void wrongPassword(){


            LoginPage loginPage = new LoginPage();
            loginPage.usernameInput.sendKeys("someusername");
            loginPage.passwordInout.sendKeys("UserUser123");
            loginPage.logIn.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login","verify that url not changed");


    }


}
