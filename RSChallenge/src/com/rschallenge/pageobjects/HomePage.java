package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebElement element = null;

    public static WebElement searchTextBox(WebDriver driver){
        element = driver.findElement(By.id("searchTerm"));
        return element;
    }

    public static WebElement quickStockNumBox(WebDriver driver) {
        element = driver.findElement(By.name("stocknum"));
        return element;
    }

    public static WebElement quickQtyBox(WebDriver driver) {
        element = driver.findElement(By.name("qty"));
        return element;
    }

    public static WebElement quickOrderAddToBasketButton(WebDriver driver) {
        element = driver.findElement(By.id("quickOrderBtn"));
        return element;
    }

    public static WebElement basketIcon(WebDriver driver) {
        element = driver.findElement(By.id("miniBasketId"));
        return element;
    }

}
