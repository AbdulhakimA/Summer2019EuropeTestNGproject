package com.cybertek.tests.day17_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilDemo {


    @Test
    public void readExcelFile(){


        //create an object from ExcelUtil
        //it accepts two argument
        //argument 1: location of the file (path)
        //Argument 2: sheet that we want to open (sheet name)

        ExcelUtil qa3short =new ExcelUtil("src/test/Resources/Vytracktestdata.xlsx","QA3-short");

        //how many rows in the sheet
        System.out.println("Row count:  "+ qa3short.rowCount());


        //how many columns in the sheets
        System.out.println("column count: "+ qa3short.columnCount());



        //get all column name
        System.out.println("column name: "+qa3short.getColumnsNames());


        List<Map<String, String>> dataList = qa3short.getDataList();


        System.out.println(dataList.get(0));


        //print them one by one for each row
        for (Map<String ,String>onerow : dataList)
        {
            System.out.println(onerow);
        }


        //get all data in 2d array
        String[][] dataArray =qa3short.getDataArray();
        //print the array
        System.out.println(Arrays.deepToString(dataArray));

    }




}
