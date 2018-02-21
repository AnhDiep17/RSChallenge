package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRechargeableBatteriesPage {

    private static WebElement element = null;

    public static WebElement CRechargeableBattery5046073Link(WebDriver driver) {
        //element = driver.findElement(By.xpath("//a[@href='/web/p/c-rechargeable-batteries/5046073/' AND @class='text-contents small-link']"));
        element = driver.findElement(By.linkText("504-6073"));
        return element;
    }

}
