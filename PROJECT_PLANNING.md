# Automated Facebook App

Selenium WebDriver automation project for Facebook login using **Java + Maven + Microsoft Edge**.

## Features
- Automated login to Facebook
- Page Object Model (POM) pattern
- Logo validation on login page
- JUnit 5 testing

## Project Structure
```bash
Automated-Facebook-App/
├── EdgeDriver/
│   └── msedgedriver.exe
└── seleniumfacebooktesting/
    ├── pom.xml
    ├── .vscode/
    ├── src/test/java/com/selenium/qa/
    │   ├── BasePage.java
    │   ├── PageElements/
    │   │   ├── FirstPage.java
    │   │   └── PageInitialization.java
    │   └── secondpage/
    │       └── Locators.java
    └── target/ (compiled files)
