package HomeWork;

import com.cybertek.utilities.Web_Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreatColum_Rowmethod {

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
    public void Test1(){

        //Create a method that accepts row and col number, and returns the cell as a webelement
       WebElement Row =Row();

        WebElement colum =colum();


        System.out.println("Row : " + Row.getText());
        System.out.println("Collum : " + colum.getText());


    }

    private WebElement colum() {


        WebElement colom =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td"));

       return colom;
    }

    private WebElement Row() {

        WebElement Row =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr"));

        return Row;

    }
}
