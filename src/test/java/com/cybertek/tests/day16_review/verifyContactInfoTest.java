package com.cybertek.tests.day16_review;

import com.aventstack.extentreports.ExtentReports;
import com.cybertek.pages.BasePage;
import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTest extends TestBase {


    @Test
    public void ContactDetailTest(){

        extentLogger =report.createTest("ContactDetailTest");
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("salesmanager_username");

        String password =ConfigurationReader.get("salesmanager_password");
        extentLogger.info("password: "+password);
        extentLogger.info("username: "+username);
        extentLogger.info("Login as a sales manager");
        loginPage.login(username,password);



        ContactsPage contactsPage = new ContactsPage();

        extentLogger.info("Navigate to Customer-- contacts page");
        contactsPage.navigateToModule("Customers","Contacts");

        BrowserUtils.waitFor(4 );
        //contactsPage.waitUntilLoaderScreenDisappear();
        extentLogger.info("Click on mbrackstone9@example.com");
        contactsPage.getContactEmail("mbrackstone9@example.com").click();


        ContactInfoPage contactInfoPage =new ContactInfoPage();

        String actualFullName=contactInfoPage.fullName.getText();
        String expectedFullName="Ms Mariam Brackstone";

        extentLogger.info("Verify fullName is"+expectedFullName);
        Assert.assertEquals(actualFullName,expectedFullName,"Verify the full Name");

        String actualPhoneNumber = contactInfoPage.phone.getText();
        String expectedPhoneNumber="+18982323434";


        extentLogger.info("Verify phone number is "+expectedPhoneNumber);
        Assert.assertEquals(actualPhoneNumber,expectedPhoneNumber,"verify phone number");





        extentLogger.info("verify Email address is mbrackstone9@example.com ");
        Assert.assertEquals(contactInfoPage.email.getText(),"mbrackstone9@example.com");
    }

}
