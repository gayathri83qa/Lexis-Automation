LexisNexis Automation Framework
This is an automation framework built for testing the LexisNexis website using Cucumber and Selenium WebDriver.

Overview
The framework utilizes Cucumber for writing test scenarios in Gherkin language and Selenium WebDriver for interacting with the web application. It follows a BDD (Behavior-Driven Development) approach, allowing stakeholders to participate in the testing process by writing scenarios in plain English.

Features
Easy-to-read Gherkin syntax for writing test scenarios
Reusable step definitions for test automation
Integration with Selenium WebDriver for browser automation
Maven as a build and dependency management tool

Prerequisites
Java Development Kit (JDK) version 8 or higher
Maven installed on your system
Chrome or Firefox browser installed

Getting Started
Clone the repository to your local machine:
git clone https://github.com/your-username/lexis-automation.git

Run the following command to execute the tests:
mvn test


Project Structure

lexis-automation
│   README.md
│   pom.xml   
│
└───src
    └───test
        ├───java
        │   ├───pageObjects       # Page object classes
        │   ├───runners            # Test runner classes
        │   └───stepDefinitions    # Step definition classes
        └───resources
            └───features           # Feature files written in Gherkin language


