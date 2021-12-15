package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _clickOnNewsComment = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[3]/a[1]");
    By _clickOnRegisterButton = By.linkText("Register");
    public void clickOnTheRegister(){
        clickFindElement(_clickOnRegisterButton);
}
    public void clickOnTheNewsComment(){
        clickFindElement(_clickOnNewsComment);

    }
    public void clickOnElementComputers() {


        clickFindElement(By.linkText("Computers"));
    }
}






