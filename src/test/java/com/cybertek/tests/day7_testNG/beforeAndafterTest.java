package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class beforeAndafterTest {


    @Test
    public void test1(){

        System.out.println("this my test one");

    }


    @BeforeMethod

    public void setup(){

        System.out.println("BEFORE METHOD");
        System.out.println("OPEN Browser");
    }



    @AfterMethod
    public void setupmethod(){
        System.out.println("After method");
        System.out.println("close the browser");

    }
@Test
    public void test2(){

    System.out.println("this my second test");

    }

    @Test
    public void test3(){

        System.out.println("this my third test");
    }
@BeforeClass
    public void beforeclss(){
    System.out.println("this is my before class");
}

@AfterClass

    public void afterclass(){
    System.out.println("this is after class");
}




    }



