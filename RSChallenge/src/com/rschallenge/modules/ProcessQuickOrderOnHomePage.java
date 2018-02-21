package com.rschallenge.modules;

import com.rschallenge.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.TAB;

public class ProcessQuickOrderOnHomePage {

    public static void execute(WebDriver driver) {
        System.out.println("Entering RS Stock No and Quantity into the Quick Order fields.\n");
        HomePage.quickStockNumBox(driver).sendKeys("901-4972");
        HomePage.quickQtyBox(driver).sendKeys("1"+TAB);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HomePage.quickOrderAddToBasketButton(driver).click();
    }

}
