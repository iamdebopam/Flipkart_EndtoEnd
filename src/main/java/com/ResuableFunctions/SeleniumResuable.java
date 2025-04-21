package com.ResuableFunctions;

import com.Baseclass.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumResuable extends Library {

     public SeleniumResuable(WebDriver driver){
         this.driver=driver;
     }

     public void EnterValue(WebElement element,String text){
         try{
             element.sendKeys(text);
         }
         catch(Exception e){
             System.out.println("No such element Exception");
         }
     }

}
