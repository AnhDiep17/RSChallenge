package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    private static WebElement element = null;

    public static WebElement paymentTitle(WebDriver driver){
        element = driver.findElement(By.className("layerTitleText top10 floatLeft"));
        return element;
    }

    public static WebElement selectCardTypeText(WebDriver driver){
        element = driver.findElement(By.xpath("//div[text()='Select card type']"));
        return element;
    }

}
