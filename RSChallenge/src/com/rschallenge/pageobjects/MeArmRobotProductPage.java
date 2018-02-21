package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeArmRobotProductPage {

    private static WebElement element = null;

    public static WebElement productHeading(WebDriver driver){
        element = driver.findElement(By.xpath("//h1[@class='col-xs-12 main-page-header']"));
        return element;
    }

    public static WebElement RSStockNo(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()='134-0413']"));
        return element;
    }

}
