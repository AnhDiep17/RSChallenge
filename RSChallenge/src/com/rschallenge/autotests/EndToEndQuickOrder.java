package com.rschallenge.autotests;

import com.rschallenge.modules.LoadHomePage;
import com.rschallenge.modules.ProcessDeliveryPage;
import com.rschallenge.pageobjects.BasketSummary;
import com.rschallenge.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.TAB;


public class EndToEndQuickOrder {

    public static void execute(WebDriver driver){

        System.out.println("\n\n*** Executing End to End Quick Order Test Case. ***\n");
        LoadHomePage.execute(driver);

        System.out.println("Entering RS Stock No and Quantity into the Quick Order fields.\n");
        HomePage.quickStockNumBox(driver).sendKeys("901-4972");
        HomePage.quickQtyBox(driver).sendKeys("1"+TAB);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HomePage.quickOrderAddToBasketButton(driver).click();

        // The Basket Summary page should load now.
        System.out.println("Verifying that the My basket page has loaded.\n");
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(BasketSummary.checkOutSecurelyButton(driver)));
        if(driver.getPageSource().contains("My basket"))
        {
            System.out.println("My Basket text is Present.\n");
        }
        else
        {
            System.out.println("My Basket text is not Present.\n");
        }
        BasketSummary.checkOutSecurelyButton(driver).click();
        if (BasketSummary.continueAsGuestSectionTitle(driver).isDisplayed())
        {
            System.out.println("Guest checkout title was displayed.\n");
        }
        else
        {
            System.out.println("Guest checkout title was not displayed.\n");
        }
        BasketSummary.guestEmail(driver).sendKeys("test@test.test");
        BasketSummary.guestCheckOutButton(driver).click();
        if (BasketSummary.haveYouRegisteredBeforeSectionTitle(driver).isDisplayed())
        {
            System.out.println("'Have you registered before?' title was displayed.\n");
        }
        else
        {
            System.out.println("'Have you registered before?' title was not displayed.\n");
        }
        BasketSummary.guestCheckOutContinueButton(driver).click();

        // The Delivery page should load now.
        ProcessDeliveryPage.execute(driver);



    }
}
