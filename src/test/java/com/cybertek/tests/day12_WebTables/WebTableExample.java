package com.cybertek.tests.day12_WebTables;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableExample {

    WebDriver driver;



    //Actions actions =new Actions(driver);

    @BeforeMethod
    public void setUpMethod(){
        driver = Web_Driver_Factory.getdriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
    @Test

    public void printTables(){
        WebElement tables =driver.findElement(By.id("table1"));
        System.out.println(tables.getText());
        String wholeTables=tables.getText();


        Assert.assertTrue(wholeTables.contains("jsmith@gmail.com"),"verify that jsmith@gmail.com is in the table");
    }


    @Test
    public void getAllHeads(){

        //how many colums we have



        //how many columns we have ?
        List<WebElement>  headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of columns " + headers.size());
        //print each column name one by one
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }


        //number of rows with header
        //number of rows without headerd

        List<WebElement> allRowsWithTheHeader=driver.findElements(By.xpath("//table[@id='table1']//tr"));

        System.out.println(allRowsWithTheHeader.size());


        List<WebElement> allrowsWithoutheader=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));

        System.out.println("\"allrowsWithoutheader\" = " + allrowsWithoutheader.size());
    }


    @Test
    public void getrow(){

       WebElement secondrow=driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[2]"));

        System.out.println(secondrow.getText());


        //number of rows
        List<WebElement> allrowsWithoutheader=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));



        for (int i = 1; i <=allrowsWithoutheader.size() ; i++) {

            String  rowXpeth="//*[@id='table1']/tbody/tr["+i+"]";

            //System.out.println(rowXpeth);
            WebElement singleRow=driver.findElement(By.xpath(rowXpeth));

           // System.out.println(singleRow.getText());


        }





    }

    @Test
    public void getAllCellsInRow(){



        List<WebElement> getAllCellsInRow=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr[1]/td"));

        for (WebElement webElement : getAllCellsInRow) {

            System.out.println(webElement.getText());
        }


    }


    @Test
    public void getsibglecell(){


        WebElement singleCell=driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[3]/td[2]"));

        System.out.println(singleCell.getText());


    }


    @Test
    public void printCellByIndex(){
        int rownumber=getNumerOfRows();
        int columnumber=getcolumnumber();


        for(int i=1;i<=rownumber;i++)
        {
            for (int j=1;j<=columnumber;j++)
            {

                //get the HTML indx to find table welement using loop
                String xpeth="//*[@id='table1']/tbody/tr['"+i+"']/td['"+j+"']";
                WebElement printCellByIndex =driver.findElement(By.xpath(xpeth));
                //get all information inside the table element
                System.out.print(printCellByIndex.getText());

            }
        }


    }

    private int getcolumnumber() {

        //get the colum number
        List<WebElement> allcolums=driver.findElements(By.xpath("//table[@id='table1']//th"));
        return allcolums.size();
    }


    private int getNumerOfRows() {
        //get the row number
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();
    }

    @Test
    public void getCellInRelationToAnother(){

        String name="Tim";
        String xpath="//table[@id='table1']//td[.='"+name+"']/../td[3]";
        WebElement email=driver.findElement(By.xpath(xpath));
        System.out.println(email.getText());
    }

}



