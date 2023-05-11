package StepDefinitions;

import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

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

    @And("get plans names")
    public void checkPlansNames(){
        List<String> plans = homePage.getPlans();
        Assert.assertEquals(plans.get(0), "LITE");
        Assert.assertEquals(plans.get(1), "CLASSIC");
        Assert.assertEquals(plans.get(2), "PREMIUM");
    }

    @Then("check Kuwait Currency")
    public void checkKuwaitCurrency() {
        List<String> prices = homePage.getPrices();
        Assert.assertEquals(prices.get(0), "KWD/month");
        Assert.assertEquals(prices.get(1), "KWD/month");
        Assert.assertEquals(prices.get(2), "KWD/month");
    }

    @Then("check KSA Currency")
    public void checkKSACurrency() {
        List<String> prices = homePage.getPrices();
        Assert.assertEquals(prices.get(0), "SAR/month");
        Assert.assertEquals(prices.get(1), "SAR/month");
        Assert.assertEquals(prices.get(2), "SAR/month");
    }

    @Then("check Bahrain Currency")
    public void checkBahrainCurrency() {
        List<String> prices = homePage.getPrices();
        Assert.assertEquals(prices.get(0), "BHD/month");
        Assert.assertEquals(prices.get(1), "BHD/month");
        Assert.assertEquals(prices.get(2), "BHD/month");
    }
}
