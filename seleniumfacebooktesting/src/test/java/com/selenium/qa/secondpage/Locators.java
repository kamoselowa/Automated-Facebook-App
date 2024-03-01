package com.selenium.qa.secondpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.qa.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Locators extends BasePage {

    public Locators(WebDriver driver) {
        super(driver);
    }

    public void waitForMultipleElements() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Define your locators
        By NavBar = By.xpath("//div[@class='xds687c xixxii4 x17qophe x13vifvy x1vjfegm']");
        By FbSearch = By.xpath("//label[@class='x1a2a7pz x1qjc9v5 xnwf7zb x40j3uw x1s7lred x15gyhx8 x9f619 x78zum5 x1fns5xo x1n2onr6 xh8yej3 x1ba4aug xmjcpbm']");
        // Add more locators as needed
        
        // Store all locators in a list
        List<By> locators = new ArrayList<>();
        locators.add(NavBar);
        locators.add(FbSearch);
        // Add more locators as needed

        // Wait for each element in the list
        for (By locator : locators) {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            if (locator.equals(NavBar)){
                
            }
        }
    }

    // Define other methods for your Locators class as needed
}
