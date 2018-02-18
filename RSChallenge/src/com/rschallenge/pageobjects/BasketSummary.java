package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketSummary {

    private static WebElement element = null;

    public static WebElement checkOutSecurelyButton(WebDriver driver){
        element = driver.findElement(By.id("checkoutSecurelyAndPuchBtn"));
        return element;
    }

    public static WebElement continueAsGuestSectionTitle(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Continue as a guest']"));
        return element;
    }

    public static WebElement guestEmail(WebDriver driver) {
        element = driver.findElement(By.name("guestCheckoutForm:GuestWidgetAction_emailAddress_decorate:GuestWidgetAction_emailAddress"));
        return element;
    }

    public static WebElement guestCheckOutButton(WebDriver driver) {
        element = driver.findElement(By.name("guestCheckoutForm:guestCheckout"));
        return element;
    }

    public static WebElement haveYouRegisteredBeforeSectionTitle(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Have you registered before?']"));
        return element;
    }

    public static WebElement guestCheckOutContinueButton(WebDriver driver) {
        element = driver.findElement(By.name("alreadyRegisteredForm:continue"));
        return element;
    }

}
