package com.cybertek.pages;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DeshBoardPage extends BasePage{



    //no need to explicitly wite constructer ,because we already created in the BaseClass
    public DeshBoardPage (){

        PageFactory.initElements(Driver.get(),this);
    }




}
