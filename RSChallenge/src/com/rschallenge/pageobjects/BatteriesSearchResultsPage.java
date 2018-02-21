package com.rschallenge.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BatteriesSearchResultsPage {

    private static WebElement element = null;

    public static WebElement searchSummarySection(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='searchSummary']"));
        return element;
    }

    public static WebElement popularCategoriesSection(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='popularCategoriesDiv']"));
        return element;
    }

    public static WebElement searchResultsHeading(WebDriver driver){
        element = driver.findElement(By.xpath("//h2[@class='searchResults']"));
        return element;
    }

}
