package com.rschallenge.modules;

import com.rschallenge.pageobjects.DeliveryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.Keys.ENTER;

public class ProcessDeliveryPage {

    public static void execute(WebDriver driver) {

        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(DeliveryPage.customerTitle(driver)));
        if (DeliveryPage.deliveryTitle(driver).getText().equals("Delivery"))
        {
            System.out.println("Delivery page title was displayed.");
        }
        else
        {
            System.out.println("Delivery page title was not displayed.");
            System.out.println("Actual text found: " + DeliveryPage.deliveryTitle(driver).getText());
        }
        System.out.println("Processing the Delivery page.");
        DeliveryPage.customerTitle(driver).sendKeys("d"+ENTER);
        DeliveryPage.firstName(driver).clear();
        DeliveryPage.firstName(driver).sendKeys("Auto");
        DeliveryPage.surName(driver).clear();
        DeliveryPage.surName(driver).sendKeys("Tester");
        DeliveryPage.contactNumber(driver).clear();
        DeliveryPage.contactNumber(driver).sendKeys("0123456789");
        DeliveryPage.deliveryAddressName(driver).clear();
        DeliveryPage.deliveryAddressName(driver).sendKeys("Auto Tester");
        DeliveryPage.deliveryAddressLine1(driver).clear();
        DeliveryPage.deliveryAddressLine1(driver).sendKeys("1 Test Street");
        DeliveryPage.deliveryTown(driver).clear();
        DeliveryPage.deliveryTown(driver).sendKeys("Teston");
        DeliveryPage.deliveryPostCode(driver).clear();
        DeliveryPage.deliveryPostCode(driver).sendKeys("TE1 2ST");
        // Putting in a temporary sleep here to see what is going on.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DeliveryPage.checkOutSecurelyButton(driver).click();

    }

}
