package com.Stepdefinitions;

import com.Baseclass.Library;
import com.Pages.FilterPage;
import com.ResuableFunctions.SeleniumResuable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class FilterSearch extends Library {
    FilterPage fp;
    SeleniumResuable sc;
    @And("Select Minimum and Maximum Amount")
    public void selectMinimumAndMaximumAmount() throws InterruptedException {
        fp=new FilterPage(driver);
        sc=new SeleniumResuable(driver);
        String BeforeFilter=driver.findElement(By.xpath("")).getText(); //need to locate xpath
        System.out.println("Before Filter: "+BeforeFilter);

        fp.Min();
        sc.waits();
        fp.Max();
        sc.waits();
    }

    @And("Select the Brand")
    public void selectTheBrand() throws InterruptedException {
        fp.brand();
        sc.waits();
    }

    @And("Select the Ram")
    public void selectTheRam() throws InterruptedException {
        fp.ram();
        sc.waits();
    }

    @And("Select the Battery Capacity")
    public void selectTheBatteryCapacity() throws InterruptedException {
        fp.clickBattery();
        sc.waits();
    }

    @Then("It should display the relevant result")
    public void itShouldDisplayTheRelevantResult() {
        System.out.println("*********************************************");
        String AfterFilter=driver.findElement(By.xpath("")).getText(); //need to locate xpath
        System.out.println("Before Filter: "+AfterFilter);
    }
}
