package com.rschallenge.modules;

import com.rschallenge.pageobjects.CRechargeableBatteriesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select5046073FromCRechargeableBatteries {

    public static void execute(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(CRechargeableBatteriesPage.CRechargeableBattery5046073Link(driver)));
        // Hardcoded sleep for stability.  To be improved.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CRechargeableBatteriesPage.CRechargeableBattery5046073Link(driver).click();
    }
}
