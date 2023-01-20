package com.virgin.pages;

import com.virgin.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"__tealiumGDPRecModal\"]/div/div/div/div[2]/label")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'All Games')]" )
    WebElement clickOnAllGames;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"styledApp\"]/div/section[1]/div/h2")
    WebElement verifyText;

//-------------------------------------------------------------------------------------------------
    public void clickAcceptCookie(){
        log.info("Clicking on Accept Cookie : " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

public void setClickOnLoginLink(){
    log.info("Clicking on Live Login Link : " + clickOnAllGames.toString());
    clickOnElement(clickOnAllGames);
}

public String verifyPage(){
    log.info("Verifying All Games Page : " + verifyText.toString());
        String actualMessage = getTextFromElement(verifyText);
        return actualMessage;
}

}


