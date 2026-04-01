# Automated Facebook App

A Selenium WebDriver automation project built with **Java + Maven** for automating Facebook login and UI interactions using Microsoft Edge.

## Features
- Automated Facebook login process
- Page Object Model (POM) design pattern
- Logo validation on login page
- JUnit 5 test framework
- Edge browser automation

## Project Structure
```bash
Automated-Facebook-App/
├── EdgeDriver/
│   └── msedgedriver.exe
├── seleniumfacebooktesting/
│   ├── pom.xml
│   ├── src/test/java/com/selenium/qa/
│   │   ├── BasePage.java
│   │   ├── PageElements/
│   │   │   ├── FirstPage.java
│   │   │   └── PageInitialization.java
│   │   └── secondpage/
│   │       └── Locators.java
│   └── target/
├── PROJECT_PLANNING.md
├── README.md
└── .gitignore
