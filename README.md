# Selenium Cucumber Framework

---
## Tools and Libraries
This project using 2 main tools, Selenium and Cucumber.
On the other hand, I am using some tools that support this framework.
The complete list of tools, you can see in the `pom.xml` file.

## Requirements
* Java Development Kit
* Maven
* WebDriver, using ChromeDriver

## Running Tests
* Clone the repository from your fork to this directory
* Open the project using any Java IDE
* Run the tests with the script below
```shell
$ mvn clean install
```

## Test Results
* Test report automatically generated on `target` folder after finished the test execution
* See test report from `target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html`
* You can also share your Cucumber Report with another person at https://reports.cucumber.io, just go to `src/test/resources/cucumber.properties` then change the value to be `true`
```properties
cucumber.publish.enabled=true
```

## list of tested feature
### Package details and prices in KSA
validate that the 3 packages names and details are correct, and validate the prices are in a SAR currency 
### Package details and prices in Kuwait
validate that the 3 packages names and details are correct, and validate the prices are in a KWD currency
### Package details and prices in Bahrain
validate that the 3 packages names and details are correct, and validate the prices are in a BHD currency 
### validate payment page content
validate that payment page contains correct details of selected plan
### test gift card code feature
validate that enter incorrect gift card code will result in an error message
### test payment page of subscribe to packages 
validate that the payment details are correct
