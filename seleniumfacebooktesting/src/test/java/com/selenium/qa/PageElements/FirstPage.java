package com.selenium.qa.PageElements;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.qa.BasePage;

public class FirstPage extends BasePage {
    
    private  WebDriverWait wait;
    static WebDriver driver;

    
    @FindBy(how = How.XPATH, using = "//img[@alt='Facebook']")
      WebElement LoginTiElement;

     @FindBy(how = How.XPATH, using = "(//input[@id='email'])[1]")
     WebElement UserName;

     @FindBy(how = How.ID, using ="pass")
     WebElement PassWord;

     @FindBy(how = How.NAME, using = "login")
     WebElement LoginBtn;

    
     

     //@FindBy(how = How.CSS, using = "a._97w4[href*='recover/initiate']\"")
     //WebElement ForgotPass;

     //@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Create new account')]")
     //WebElement CreateNewAccountBtn;

    
        public FirstPage(WebDriver d) {
            super(d); // Call the superclass constructor
            this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
            PageFactory.initElements(d, this);
        }
    
    

    public void ValidateApearance(){
        LoginTiElement.isDisplayed();
    }

    public void UsernameEntry(){
        UserName.sendKeys("0763577766");
    }

    public void PasswordEntry(){
        PassWord.sendKeys("0763577766Troxy");
    }

    public void LoginButton(){
        LoginBtn.click();
    }

    /*public void ForgetPassword(){
        ForgotPass.click();
    }

    public void NewAccount(){
        CreateNewAccountBtn.click();
    }*/
   


}
