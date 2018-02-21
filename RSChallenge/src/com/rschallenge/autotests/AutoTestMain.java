package com.rschallenge.autotests;

import com.rschallenge.modules.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class AutoTestMain {

    private static WebDriver driver = null;

    public static void main(String[] args) {

        String featureFilePath = ".\\src\\com\\rschallenge\\featurefiles\\";

        System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Execute Test Cases.
        TestRunner.execute(driver, featureFilePath + "EndToEndQuickOrder.feature");
        TestRunner.execute(driver, featureFilePath + "EndToEndAllProductsMenuOrder.feature");
        TestRunner.execute(driver, featureFilePath + "GuestSearchesForBatteries.feature");
        TestRunner.execute(driver, featureFilePath + "GuestSearchesForTorches.feature");
        TestRunner.execute(driver, featureFilePath + "GuestSearchesForRobotByRSStockNo.feature");

        //driver.quit();

    }
}
