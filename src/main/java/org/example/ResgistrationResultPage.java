package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResgistrationResultPage extends ResgistrationPage {
    By _ContinueButtonOnRegistertionPage=By.xpath("//a[@class=\"button-1 register-continue-button\"]");
    public void registrationResult() {
        String actualRegisterSuccessMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        String expectedRegisterSuccessMessage = "Your registration completed";
        Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage));

    }
    public void clcikonContinueInTheRegistrationPage(){
    clickFindElement(_ContinueButtonOnRegistertionPage);
}}