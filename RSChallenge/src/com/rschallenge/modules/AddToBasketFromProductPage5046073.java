package com.rschallenge.modules;

import com.rschallenge.pageobjects.ProductPageFor5046073;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToBasketFromProductPage5046073 {

    public static void execute(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(ProductPageFor5046073.addToBasketButton(driver)));
        ProductPageFor5046073.addToBasketButton(driver).click();
        ProductPageFor5046073.viewBasketButton(driver).click();
    }

}
