package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductToFriend extends Utils{
    public void usershouldBeAnletoSendemailtoFfiendSuccessfully()
    {
        String actualResult = getTextFromElement(By.xpath("//div[@class='result']"));
        String exResult ="your message has been sent,";
        // verify the expected and actual result
        Assert.assertTrue(actualResult.equals(exResult), "your message has not been sent.");
    }
}
