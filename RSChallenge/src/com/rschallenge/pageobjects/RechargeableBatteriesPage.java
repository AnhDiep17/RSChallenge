package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RechargeableBatteriesPage {

    private static WebElement element = null;

    public static WebElement CRechargeableBatteriesLink(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@title='C Rechargeable Batteries']"));
        return element;
    }

}
