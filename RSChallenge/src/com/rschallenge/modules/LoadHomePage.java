package com.rschallenge.modules;

import com.rschallenge.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoadHomePage {

    public static void execute(WebDriver driver) {
        driver.get("http://uk.rs-online.com/web/");
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(HomePage.quickStockNumBox(driver)));

        // Temporarily adding a hard coded sleep here temporarily so I can visibly see what's happening.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
