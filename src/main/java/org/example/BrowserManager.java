package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager extends BasePage{
    public String browserName = "chrome";


    public void OpenBrowser() {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            // driver = new EdgeDriver();
        }else
        {
            System.out.println("wrong Browser name");
        }
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }


    public void closeBrowser() {
        driver.close();
    }
}


