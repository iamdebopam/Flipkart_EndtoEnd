package com.Pages;

import com.Baseclass.Library;
import com.ResuableFunctions.SeleniumResuable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends Library {
    SeleniumResuable sc;
    public FilterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")//need to locate Min locator
    WebElement MinimumAmount;
    @FindBy(xpath = "")//need to locate Max locator
    WebElement MaximumAmount;
    @FindBy(xpath = "")//need to locate Brand locator
    WebElement Brand;
    @FindBy(xpath = "")//need to locate Ram locator
    WebElement Ram;
    @FindBy(xpath = "")//need to locate Battery Capacity
    WebElement BatteryArrow;
    @FindBy(xpath = "")//need to locate Battery Capacity
    WebElement BatteryCapacity;

    public void Min(){
        sc=new SeleniumResuable(driver);
        sc.dropdown(MinimumAmount,"10000");
    }
    public void Max(){
        sc=new SeleniumResuable(driver);
        sc.dropdown(MaximumAmount,"50000");
    }
    public void brand(){
        sc.click(Brand);
    }
    public void ram(){
        sc.scrollDown(Ram);
        sc.click(Ram);
    }
    public void clickBattery(){
        sc.scrollDown(BatteryArrow);
        sc.click(BatteryArrow);
        sc.click(BatteryCapacity);
    }
}
