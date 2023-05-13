package StepDefinitions;

import PageObjects.HomePage;
import Utilities.Log;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomeSteps {

    HomePage homePage;
    TestContext testContext;

    public HomeSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("Home page in English")
    public void homePageWithoutLogin() {
        homePage.changeLangToEng();
    }

    @When("open KSA country page")
    public void openHomePageInKSA(){
        homePage.clickOnCountryName();
        homePage.selectKSACountry();
        Assert.assertEquals(homePage.getCurrentCountryName(), "KSA");
    }

    @When("open Bahrain country page")
    public void openHomePageInBH(){
        homePage.clickOnCountryName();
        homePage.selectBahrainCountry();
        Assert.assertEquals(homePage.getCurrentCountryName(), "Bahrain");
    }

    @When("open Kuwait country page")
    public void openHomePageInKW(){
        homePage.clickOnCountryName();
        homePage.selectKuwaitCountry();
        Assert.assertEquals(homePage.getCurrentCountryName(), "Kuwait");
    }


    @Then("check Kuwait Currency {string} {string}")
    public void checkKuwaitCurrency(String price, String id) {
        List<String> prices = homePage.getPrices();
        Assert.assertEquals(prices.get(Integer.parseInt(id)), price);
    }

    @Then("check KSA Currency {string} {string}")
    public void checkKSACurrency(String price, String id) {
        List<String> prices = homePage.getPrices();
        Assert.assertEquals(prices.get(Integer.parseInt(id)), price);
    }

    @Then("check Bahrain Currency {string} {string}")
    public void checkBahrainCurrency(String price, String id) {
        List<String> prices = homePage.getPrices();
        Assert.assertEquals(prices.get(Integer.parseInt(id)), price);
    }


    @And("get plans names {string} {string}")
    public void getPlansNames(String name, String id) {
        List<String> plans = homePage.getPlans();
        Assert.assertEquals(plans.get(Integer.parseInt(id)), name);

        System.out.println(plans.get(0));
        System.out.println(plans.get(1));
        System.out.println(plans.get(2));
    }

    @And("open gift code page")
    public void openGiftCodePage() {
        homePage.openGiftCardPage();
    }

    @Then("enter gift code {string} {string}")
    public void enterGiftCode(String code, String status) {
        homePage.enterGiftCode(code);
        if (status == "invalid"){
            Assert.assertEquals(homePage.getErrorMsg(), "This code is invalid");
        }
    }

    @And("choose {string} package")
    public void choosePackage(String plan) {
        homePage.startTrial(plan);
    }


    @Then("payment details are correct {string}")
    public void paymentDetailsAreCorrect(String price) {
        Assert.assertEquals(homePage.getTotalPrice(), price);
    }
}
