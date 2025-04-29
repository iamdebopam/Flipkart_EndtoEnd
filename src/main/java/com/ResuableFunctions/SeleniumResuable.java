package com.ResuableFunctions;

import com.Baseclass.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class SeleniumResuable extends Library {

     public SeleniumResuable(WebDriver driver){
         this.driver=driver;
     }
     //Enter the Text of Element
     public void EnterValue(WebElement element,String text){
         try{
             element.sendKeys(text);
         }
         catch(Exception e){
             System.out.println("No such element Exception");
         }
     }
     //Click the Element
    public void click(WebElement element){
         try{
             element.click();
         }
         catch (Exception e){
             System.out.println("No such element Exception");
         }
    }
    //Get the title of the page
    public void getTitle(){
         try{
             System.out.println(driver.getTitle());
         }
         catch (Exception e){
             System.out.println("Couldn't get the Title");
         }
    }
    //Take the screenshot of the testcase
    public void screenshot(String path){
        TakesScreenshot TS= (TakesScreenshot) driver;
        File source= TS.getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(source,new File(path));
        }
        catch (Exception e) {
            System.out.println("Screenshot not found");
        }
    }
}
