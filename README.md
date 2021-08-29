# Serenity tests

For this assignment I have chosen Serenity framework in Java, beause I've been using it in the past. 

## Solution

### Folder structure
The project has following folder structure:
- `src`
   - `main` 
   	  - `java/com/test/serenity` - page object classes
   	  - `resources`
   	  	- `serenity.conf` - serenity configuration
   - `test` 
   	- `java/com/test/serenity` 
   		- `stepDefinitions` - cucumber step definitions
   		- `steps` - serenity steps
   		- `HappeoTestSuite.java` - test suite file
   	- `resources/feature/happeo` - tests written in gherkin syntax 		
- `pom.xml` mvn file

### Description
Main goal of this solution is to implement given test scenarios in serenity framework by using additional BDD approach. To achieve this we use cucumber framework with scenarios written in gherkin syntax. This gives us possibility to write test scenarios in a way which is easy to read. 

Tests are written in feature files. Each step in feature file uses methods implemented in *stepDefinitions* files. 

Serenity architecture generally uses **page object pattern**. All web elements are mapped in PageObject files. Those objects are used in test step files. By joining various test steps we are able to create step definitions used in features. 

#### Serenity
This library uses Selenium web driver. For demonstration I've chosen to use chrome browser and chromedriver. For mapping web elements I use `WebElementFacade` class. It gives me more options to work with web elements than `WebElement`. Mapping of elements on pages was achieved using css or id selectors. For creating usable css selector I've used various properties of html tags (eg. `[data-position="0"]`.

Environment variables, like url and credentials are located in `serenity.conf` file.

In test automation we deal with waiting until specific elements are loaded. To make test execution smooth we should not use static waits. Instead of this we used element waiting functions provided by `WebElementFacade`. 

For assertions we picked Junit as our assertion library. 

#### Cucumber
Feature files contain parameterized test scenarios for each test case. Good approach to compose scenarios is to write less than 10 steps in a single scenario. For opening login page and sign in process I put these steps into *background* section. This gives us a possibility to write common steps in multiple scenarios in a single feature. I also used steps which contain multiple user actions to simplify proces. If we had more difficult test scenarios we should consider to use data tables.

### Install and run locally
#### Preconditions
- Java > 8
- Google Chrome browser (or any other supported browser)
- chromedriver 
- maven

#### Installation steps 
1. Pull repository
2. Install *java JDK*
3. Install maven (`brew install maven`)
4. Install chromedriver (`brew install chromedriver`)

### Run tests
Locate `HappeoTestSuite.java` file and execute.

### Generating test report
Run `mvn clean install`

Iteresting files to check:
- `target/cucumber/index.html`
- `target/cucumber/failsafe-reports/*`
- `target/site/serenity/index.html`
-  `target/site/serenity/results.csv`
-  `target/json`

### Possible improvements
With additional time for this assignment I would  implement following steps:
1.  **Running tests in paralell** - This would give us quicker performance (browserstack).
2. **Using docker environment** - Using docker in this solution we can configure execution of test in selenium hub docker 
image. Docker compose file gives us an option to build test environment using selenium hub and chrome docker image. Creating volume between this project file structure and selenium hub file system structure we can accomplish mirroring of the test results. 
1. **Using multiple browsers** - This can help us find additional bugs in product related to specific browser.
2. **Improvement of wait functions** - Additional checks can cover different javascript behavior.
4. **Implementing CI/CD** - execution in cloud environment is not dependent on various local settings.
5. **Implementing another useful features of serenity framework**, eg. screenshot taking on failure.

