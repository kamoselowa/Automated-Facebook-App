package com.selenium.qa;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
    protected WebDriver driver;
    private String baseUrl = "https://web.facebook.com/login.php/?_rdc=1&_rdr";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
   @BeforeEach
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Thandeka\\Desktop\\FacebookAutomation\\EdgeDriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(baseUrl);
    }
    
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

