package com.virgin.steps;

import com.virgin.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on Virgin games homepage$")
    public void iAmOnVirginGamesHomepage() {
    }
    @When("^I acceptCookies$")
    public void iAcceptCookies() {
        new LoginPage().clickAcceptCookie();
    }
    @And("^I am clicking on All Games link$")
    public void iAmClickingOnAllGamesLink() {
        new LoginPage().setClickOnLoginLink();
    }
    @Then("^I am on All Games page$")
    public void iAmOnAllGamesPage() {
    }
    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyText(String expectedMessage)  {
        Assert.assertEquals("User is not navigate to All Games Page ", expectedMessage, new LoginPage().verifyPage());

    }







}
