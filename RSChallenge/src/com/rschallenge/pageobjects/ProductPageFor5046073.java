package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageFor5046073 {

    private static WebElement element = null;

    public static WebElement addToBasketButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@class='btn btn-primary-red btn-large btn-add-to-basket']"));
        return element;
    }

    public static WebElement viewBasketButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@class='btn btn-secondary-blue btn-large nav-view-cart']"));
        return element;
    }

}
