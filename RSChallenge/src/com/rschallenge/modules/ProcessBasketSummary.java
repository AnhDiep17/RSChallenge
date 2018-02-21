package com.rschallenge.modules;

import com.rschallenge.pageobjects.BasketSummary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProcessBasketSummary {

    public static void execute(WebDriver driver) {

        System.out.println("Verifying that the My basket page has loaded.");
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(BasketSummary.checkOutSecurelyButton(driver)));
        if(driver.getPageSource().contains("My basket"))
        {
            System.out.println("My Basket text is Present.");
        }
        else
        {
            System.out.println("My Basket text is not Present.");
        }
        BasketSummary.checkOutSecurelyButton(driver).click();
        if (BasketSummary.continueAsGuestSectionTitle(driver).isDisplayed())
        {
            System.out.println("Guest checkout title was displayed.");
        }
        else
        {
            System.out.println("Guest checkout title was not displayed.");
        }
        BasketSummary.guestEmail(driver).clear();
        BasketSummary.guestEmail(driver).sendKeys("test@test.test");
        BasketSummary.guestCheckOutButton(driver).click();
        if (BasketSummary.haveYouRegisteredBeforeSectionTitle(driver).isDisplayed())
        {
            System.out.println("'Have you registered before?' title was displayed.");
        }
        else
        {
            System.out.println("'Have you registered before?' title was not displayed.");
        }
        BasketSummary.guestCheckOutContinueButton(driver).click();

    }

}
