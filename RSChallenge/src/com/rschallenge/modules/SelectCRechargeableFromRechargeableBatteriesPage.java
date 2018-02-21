package com.rschallenge.modules;

import com.rschallenge.pageobjects.RechargeableBatteriesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCRechargeableFromRechargeableBatteriesPage {

    public static void execute(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(RechargeableBatteriesPage.CRechargeableBatteriesLink(driver)));
        RechargeableBatteriesPage.CRechargeableBatteriesLink(driver).click();
    }

}
