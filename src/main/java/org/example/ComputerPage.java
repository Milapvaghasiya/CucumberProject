package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{
    public void ClickOnTheDesktopButton()
    {
        clickFindElement(By.linkText("Desktop"));
    }
}
