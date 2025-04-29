package com.Pages;

import com.Baseclass.Library;
import com.ResuableFunctions.SeleniumResuable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Library {
    SeleniumResuable se;

    public SearchPage(){
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='q']")
    WebElement SearchText;
    public void Search(String text){
        se=new SeleniumResuable(driver);
        se.EnterValue(SearchText,text);
    }




}
