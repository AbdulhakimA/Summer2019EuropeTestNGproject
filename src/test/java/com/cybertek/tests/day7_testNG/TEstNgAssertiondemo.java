package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TEstNgAssertiondemo {


    @Test
    public void test1(){

        Assert.assertEquals("one","on");


        System.out.println("Second Assertion");

        Assert.assertEquals("title","titl");




    }



    @Test
    public void test2(){


        //verify that title starts with C
        String actual ="Cybertek";
        String expected="C  ";


        Assert.assertTrue(actual.startsWith(expected),"verify that title starts with C");



    }

    @Test
    public void test3(){

       Assert.assertTrue("sdfsdf@gmail".contains("3"),"verify that email includs @ sign");
    }


    @Test
    public void test4(){
      Assert.assertNotEquals("one","one","one should not be equal");

      Assert.assertFalse(1<0);
    }



}
