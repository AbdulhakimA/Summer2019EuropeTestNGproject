package com.cybertek.tests.day14_pom_tests;

import com.cybertek.pages.BasePage;
import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DeshBoardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    @Test
    public void VerifySubTitleTest(){

        LoginPage loginPage =new LoginPage();
        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        DeshBoardPage deshBoardPage =new DeshBoardPage();

        String expectedSubtitle="Quick Launchpad";

        String actualSubtitle=deshBoardPage.getPageSubTitle();



        Assert.assertEquals(actualSubtitle,expectedSubtitle,"Verify that subtitle is Quick Launchpad");


        deshBoardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","Verify Calender Events");


        calendarEventsPage.createCalendarEvent.click();









    }






}
