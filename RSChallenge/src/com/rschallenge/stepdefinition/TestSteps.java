package com.rschallenge.stepdefinition;

import com.rschallenge.modules.*;
import com.rschallenge.pageobjects.BatteriesPage;
import com.rschallenge.pageobjects.BatteriesSearchResultsPage;
import com.rschallenge.pageobjects.HomePage;
import com.rschallenge.pageobjects.MeArmRobotProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.Keys.ENTER;

public class TestSteps {

    public void Guest_at_Homepage(WebDriver driver) {
        LoadHomePage.execute(driver);
    }

    public void Guest_completes_Quick_Order_fields(WebDriver driver) {
        ProcessQuickOrderOnHomePage.execute(driver);
    }

    public void Guest_completes_My_Basket_page(WebDriver driver) {
        ProcessBasketSummary.execute(driver);
    }

    public void Guest_completes_Delivery_page(WebDriver driver) {
        ProcessDeliveryPage.execute(driver);
    }

    public void Payment_page_displayed(WebDriver driver) {
        VerifyPaymentPage.execute(driver);
    }

    public void Guest_selects_Batteries_from_All_Products_Menu(WebDriver driver) {
        SelectAllProductsThenBatteries.execute(driver);
    }

    public void Guest_selects_Rechargeable_Batteries(WebDriver driver) {
        SelectRechargeableBatteriesFromBatteriesPage.execute(driver);
    }

    public void Guest_selects_C_Rechargeable_Batteries(WebDriver driver) {
        SelectCRechargeableFromRechargeableBatteriesPage.execute(driver);
    }

    public void Guest_clicks_504_6073(WebDriver driver) {
        Select5046073FromCRechargeableBatteries.execute(driver);
    }

    public void Guest_clicks_Add_to_basket(WebDriver driver) {
        AddToBasketFromProductPage5046073.execute(driver);
    }

    public void Guest_searches_for_Batteries(WebDriver driver) {
        HomePage.searchTextBox(driver).sendKeys("Batteries"+ENTER);
    }

    public void Batteries_page_displayed(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(BatteriesPage.batteriesHeading(driver)));
        System.out.println("Batteries page was displayed.");
    }

    public void Guest_searches_for_Torches(WebDriver driver) {
        HomePage.searchTextBox(driver).sendKeys("Torches"+ENTER);
    }

    public void Torches_Search_Results_page_displayed(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(BatteriesSearchResultsPage.searchSummarySection(driver)));
        System.out.println("Torches Search Results page was displayed.");
        if (BatteriesSearchResultsPage.popularCategoriesSection(driver).isDisplayed())
        {
            System.out.println("Popular Categories Section was displayed.");
        }
        else
        {
            System.out.println("Popular Categories Section was not displayed.");
            System.out.println("Actual text found: " + BatteriesSearchResultsPage.popularCategoriesSection(driver).getText());
        }
        if (BatteriesSearchResultsPage.searchResultsHeading(driver).isDisplayed())
        {
            System.out.println("Search Results Heading was displayed.");
        }
        else
        {
            System.out.println("Search Results Heading was not displayed.");
            System.out.println("Actual text found: " + BatteriesSearchResultsPage.searchResultsHeading(driver).getText());
        }
    }

    public void Guest_searches_for_134_0413(WebDriver driver) {
        HomePage.searchTextBox(driver).sendKeys("134_0413"+ENTER);
    }

    public void Product_page_for_MeArm_Robot_displayed(WebDriver driver) {
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(MeArmRobotProductPage.productHeading(driver)));
        System.out.println("MeArm Robot Product page was displayed.");
        if (MeArmRobotProductPage.productHeading(driver).getText().contains("MeArm Robot Arm Deluxe Kit"))
        {
            System.out.println("MeArm Robot Product Heading was displayed.");
        }
        else
        {
            System.out.println("MeArm Robot Product Heading was not displayed.");
            System.out.println("Actual text found: " + MeArmRobotProductPage.productHeading(driver).getText());
        }
        if (MeArmRobotProductPage.RSStockNo(driver).isDisplayed())
        {
            System.out.println("MeArm Robot RSStock No was displayed.");
        }
        else
        {
            System.out.println("MeArm Robot RSStock No was not displayed.");
        }
    }

}
