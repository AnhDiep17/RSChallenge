package com.rschallenge.modules;

import com.rschallenge.pageobjects.PaymentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyPaymentPage {

    public static void execute(WebDriver driver) {

        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(PaymentPage.selectCardTypeText(driver)));
        if (PaymentPage.paymentTitle(driver).getText().equals("Payment"))
        {
            System.out.println("Payment page title was displayed.\n");
        }
        else
        {
            System.out.println("Payment page title was not displayed.\n");
            System.out.println("Actual text found: " + PaymentPage.paymentTitle(driver).getText() + "\n");
        }

    }

}
