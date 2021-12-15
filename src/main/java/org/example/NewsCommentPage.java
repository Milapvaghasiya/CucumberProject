package org.example;

import org.openqa.selenium.By;

public class NewsCommentPage extends Utils{
    //By newReleaseCommentButton= By.xpath("//div[@class='buttons']/a[@href='/nopcommerce-new-release']");
    By commenter=By.xpath("//input[@class='enter-comment-title']");
    By commentText=By.xpath("//div[@class='form-fields']/div[2]/textarea");
    By addCommentButton=By.xpath("//div[@class='buttons']/button");


    public void newsCommentAdd() //create method for add new release product comment
    {
        //   clickOnElement(newReleaseCommentButton);     //click on news details

    }
}
