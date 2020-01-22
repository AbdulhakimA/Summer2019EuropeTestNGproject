package com.cybertek.tests.day17_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object[][] testData(){

        String [][] data ={
                {"Game of Throne","9"},
                {"SEE","8.5"},
                {"Prison Break","10"},
                {"Life of PI","9.5"},
                {"The 100","8.5"},
                {"Jungle Book","10"},
                {"Star Wars","10"},
                {"Ferrari Vs Ford","7.5"},

        };

        return data;

    }

    //get the data from data provider and pass as and argument
    @Test(dataProvider = "testData" )
    public void test1(String TvShow,String Rating){

        System.out.println("Tv Show: <<"+TvShow+">> IMD Rating: "+Rating);
    }

}
