package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }



//    @FindBys({
//            @FindBy(id ="prependedInput"),
//            @FindBy(id = "_username")
//    })

    //Locaters
    @FindBy(id="prependedInput")
    public WebElement usernameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInout;

    @FindBy(id="_submit")
    public WebElement logIn;


    //creat constructer to use as an objsect
    public void login(String username,String passwordSTR){

        usernameInput.sendKeys(username);
        passwordInout.sendKeys(passwordSTR);
        logIn.click();
    }

}
