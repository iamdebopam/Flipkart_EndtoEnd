package com.Pages;

import com.Baseclass.Library;
import com.ResuableFunctions.SeleniumResuable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends Library {
    SeleniumResuable se;

    public SearchPage(WebDriver driver){
       this.driver= Library.driver;
       PageFactory.initElements(Library.driver,this);
    }
    @FindBy(xpath = "//input[@name='q']")
    WebElement SearchText;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[2]")
    WebElement Homepage;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]")
    WebElement Searchresult;

    @FindBy(xpath = "//*") //need to locate xpath
    List<WebElement> entireResult;

    @FindBy(xpath = "") //need to locate xpath
    WebElement thirdResult;

    public void Search(String text){
        se=new SeleniumResuable(driver);
        se.EnterValue(SearchText,text);
    }
    public void clickSearch(){
        SearchText.sendKeys(Keys.ENTER);
    }
    public void homeScreen(){
        System.out.println(Homepage.isDisplayed());
    }
    public void Result(){
        System.out.println(Searchresult.isDisplayed());
        System.out.println(driver.getTitle());
    }
    public void printEntireResult(){
        se.MultipleGetText(entireResult);
    }
    public void printThirdResult(){
        se.Getvalue(thirdResult);
    }
}
