package org.example;

import org.testng.Assert;

public class DestopResult extends Utils{
    public void veryfyUserNavigatestoDesktopPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));

    }
}
