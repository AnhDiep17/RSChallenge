package com.rschallenge.modules;

import com.rschallenge.pageobjects.BatteriesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectRechargeableBatteriesFromBatteriesPage {

    public static void execute(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(BatteriesPage.rechargeableBatteriesLink(driver)));
        BatteriesPage.rechargeableBatteriesLink(driver).click();
    }

}
