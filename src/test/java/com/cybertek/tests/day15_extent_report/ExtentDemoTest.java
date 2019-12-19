package com.cybertek.tests.day15_extent_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {

    //this class is use for starting and building reports
    ExtentReports reports;

    //this class is used for create th HTML report file
    ExtentHtmlReporter htmlReporter;

    //this will define a test ,enable adding logs, authors , test steps
    ExtentTest extentLogger;




    @BeforeMethod

    public void setUp(){
        //initialize the class
        reports =new ExtentReports();
        //create report path
        String projectPath =System.getProperty("user.dir");
        String path =projectPath +"/test-output/report.html";

        //initialize the html report with the report path
        htmlReporter =new ExtentHtmlReporter(path);

        //attach the html report to the report object
        reports.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Vytrack smoke test ");

        // set environment information
        reports.setSystemInfo("Environment","QA");
        reports.setSystemInfo("Browser","chrome");
        reports.setSystemInfo("Tester","Europe Testers");


    }

    @Test
    public void test1(){
        //give name to the current test
        extentLogger = reports.createTest("TC342 Login as Driver Test");
        //test steps
        //info()--> write test steps
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver info");
        extentLogger.info("click submit");
        extentLogger.info("verify logged in");
        //pass()-->marks the test case as passed
        extentLogger.pass("TC342 is passed");
    }
    @AfterMethod
    public void teardown(){
        //this is when the report is actually created
        reports.flush();
    }
    }

