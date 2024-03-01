package com.selenium.qa.PageElements;

import org.openqa.selenium.WebDriver;

import com.selenium.qa.BasePage;
import com.selenium.qa.secondpage.Locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PageInitialization extends BasePage {

    public PageInitialization(WebDriver driver) {
        super(driver);
    }

   
    public void setup() {
        super.setup(); // Call the setup method from the BasePage class
    }

   

    @Test
    public void FirstPageTestEntries() {
        FirstPage entries = new FirstPage(driver);
        entries.ValidateApearance();
        entries.UsernameEntry();
        entries.PasswordEntry();
        entries.LoginButton();

        Locators secondpage = new Locators(driver);
        //secondpage.NavBar();
        //secondpage.FbSearch();
    }
   
    public void tearDown() {
        super.tearDown(); // Call the tearDown method from the BasePage class
    }
}
