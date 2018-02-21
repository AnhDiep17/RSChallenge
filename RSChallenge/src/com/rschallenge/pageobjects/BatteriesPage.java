package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BatteriesPage {

    private static WebElement element = null;

    public static WebElement batteriesHeading(WebDriver driver){
        element = driver.findElement(By.xpath("//h1[text()='Batteries']"));
        return element;
    }

    public static WebElement rechargeableBatteriesLink(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@title='Rechargeable Batteries']"));
        return element;
    }
}
