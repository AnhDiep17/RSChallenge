package com.rschallenge.autotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class AutoTests {

    private static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Execute Test Cases.

        // Given: A guest customer is at the homepage.
        // When: They enter the RS Stock No. of 901-4972 into the Quick Order fields.
        // Then: They should be able to complete the purchase of the torch referenced by 901-4972.
        EndToEndQuickOrder.execute(driver);

        //driver.quit();

    }
}
