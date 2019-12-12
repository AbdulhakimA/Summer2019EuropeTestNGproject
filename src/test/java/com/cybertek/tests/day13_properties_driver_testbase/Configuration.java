package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class Configuration {

    @Test
    public void test1(){

        System.out.println(ConfigurationReader.get("browser"));
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("salesmanager_username"));
        //if your key not exist in prorperties file, it will return null
        System.out.println(ConfigurationReader.get("storemanager"));
    }


}
