package com.Stepdefinitions;

import com.Baseclass.Library;
import com.Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MyStepdefs extends Library {
    SearchPage sp;
    @Given("Launch the FlipKart Application")
    public void launchTheFlipKartApplication() throws IOException {
        launchApplication();
    }

    @When("Close the popup")
    public void closeThePopup() {
        System.out.println(driver.getTitle());
    }

    @Then("It should Navigate to the Home page")
    public void itShouldNavigateToTheHomePage() {
        sp=new SearchPage(driver);
        sp.homeScreen();
    }

    @Given("User enter the Text in the Search field")
    public void userEnterTheTextInTheSearchField() {
        sp.Search("Mobile");
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevant details")
    public void itShouldNavigateToTheSearchResultPageAndDisplayTheRelevantDetails() {
        sp.Result();
    }

    @Then("Extract the Results and print in console")
    public void extractTheResultsAndPrintInConsole() {
        sp.printEntireResult();
        System.out.println("******************************************");
    }
    @Then("Print the Third result and keep it in the console")
    public void printTheThirdResultAndKeepItInTheConsole() {
        sp.printSecondResult();
    }

}
