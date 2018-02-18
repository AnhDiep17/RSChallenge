package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryPage {

    private static WebElement element = null;

    public static WebElement deliveryTitle(WebDriver driver){
        element = driver.findElement(By.className("layerTitleText top10 floatLeft"));
        return element;
    }

    public static WebElement customerTitle(WebDriver driver){
        element = driver.findElement(By.className("title formInput"));
        return element;
    }

    public static WebElement firstName(WebDriver driver){
        element = driver.findElement(By.name("deliveryCollectionForm:CustomerContactDetailsWidgetAction_firstName_decorate:CustomerContactDetailsWidgetAction_firstName"));
        return element;
    }

    public static WebElement surName(WebDriver driver) {
        element = driver.findElement(By.name("deliveryCollectionForm:CustomerContactDetailsWidgetAction_surName_decorate:CustomerContactDetailsWidgetAction_surName"));
        return element;
    }

    public static WebElement contactNumber(WebDriver driver) {
        element = driver.findElement(By.name("deliveryCollectionForm:CustomerContactDetailsWidgetAction_contactNumber_decorate:CustomerContactDetailsWidgetAction_contactNumber"));
        return element;
    }

    public static WebElement deliveryAddressName(WebDriver driver) {
        element = driver.findElement(By.name("deliveryCollectionForm:GuestDeliveryAddressWidgetAction_companyNameOne_decorate:GuestDeliveryAddressWidgetAction_companyNameOne"));
        return element;
    }

    public static WebElement deliveryAddressLine1(WebDriver driver) {
        element = driver.findElement(By.name("deliveryCollectionForm:GuestDeliveryAddressWidgetAction_addressLineOne_decorate:GuestDeliveryAddressWidgetAction_addressLineOne"));
        return element;
    }

    public static WebElement deliveryTown(WebDriver driver) {
        element = driver.findElement(By.name("deliveryCollectionForm:GuestDeliveryAddressWidgetAction_addressLineThree_decorate:GuestDeliveryAddressWidgetAction_addressLineThree"));
        return element;
    }

    public static WebElement deliveryPostCode(WebDriver driver) {
        element = driver.findElement(By.name("deliveryCollectionForm:GuestDeliveryAddressWidgetAction_postCode_decorate:GuestDeliveryAddressWidgetAction_postCode"));
        return element;
    }

    public static WebElement checkOutSecurelyButton(WebDriver driver) {
        element = driver.findElement(By.id("checkoutSecurelyBtn"));
        return element;
    }

}
