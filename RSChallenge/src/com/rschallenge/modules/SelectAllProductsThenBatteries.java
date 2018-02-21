package com.rschallenge.modules;

import com.rschallenge.pageobjects.BasketSummary;
import com.rschallenge.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAllProductsThenBatteries {

    public static void execute(WebDriver driver) {

        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(HomePage.allProductsMenu(driver)));
        HomePage.allProductsMenu(driver).click();
        HomePage.batteriesMenuItem(driver).click();
    }

}
