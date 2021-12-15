package org.example;

import org.testng.Assert;

public class BuildYourComputer extends Utils {
    public void veryfyuserisonbuildyourComputerpage(){
      Assert.assertTrue(driver.getCurrentUrl().contains("build your own coputer"));
    //public void clickOnEmailFriend(){
    //    clickFindElement(By.xpath("//button[@class=\"Button-2 email -a-friend-button\"]'));
}

}
