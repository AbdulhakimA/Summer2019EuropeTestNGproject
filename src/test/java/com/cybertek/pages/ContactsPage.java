package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    //we dont need to create constructer and use pageFctory class here,
    //sinse we are extending from basePage

    //if  you are using to come up dynamic xpath you cannot use @FindBy
    @FindBy(xpath = "//*[contains(text(),'mbrackstone9@example.com')] [@data-column-label='Email']")

    public WebElement email;

    //create a method that accept email as a string , and based on that email.
    public WebElement getContactEmail (String email){

        String EmailXpath = "//*[contains(text(),'"+email+"')] [@data-column-label='Email']";
       return  Driver.get().findElement(By.xpath(EmailXpath));

    }

}
