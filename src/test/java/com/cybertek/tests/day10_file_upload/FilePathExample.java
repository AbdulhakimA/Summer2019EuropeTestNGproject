package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class FilePathExample {


    @Test
    public void test1(){

        String projectPath=System.getProperty("user.dir");
        String relativePath="src/test/Resources/testfile.txt";


        String filePath=projectPath+"/"+  relativePath;


    }

}
