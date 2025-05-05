package com.ResuableFunctions;

import com.Baseclass.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
    public void MultipleGetText(List<WebElement> element){
        List<WebElement> text = element;
        System.out.println(text.size());
        for (WebElement textCount: text){
            String totalList=textCount.getText();
            System.out.println("****************************************************");
            System.out.println(totalList);
        }
    }
    public void Getvalue(WebElement element){
         String text=element.getText();
         System.out.println(text);
    }
    public void dropdown(WebElement element,String Text){
         Select drp= new Select(element);
         drp.selectByValue(Text);
    }
    public void scrollDown(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",element);
    }
    public void waits() throws InterruptedException{
         Thread.sleep(2000);
    }

}
