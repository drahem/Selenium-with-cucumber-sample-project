package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(id = "country-btn")
    private WebElement countryBtn;

    @FindBy(id = "country-name")
    private WebElement countryName;

    @FindBy(id = "bh")
    private WebElement bahrain;

    @FindBy(id = "sa")
    private WebElement KSA;

    @FindBy(id = "kw")
    private WebElement kuwait;

    @FindBy(id = "name-lite")
    private WebElement planLite;
    @FindBy(id = "name-classic")
    private WebElement planClassic;
    @FindBy(id = "name-premium")
    private WebElement planPremium;

    @FindBy(xpath = "//*[@id='currency-lite']/i")
    private WebElement liteCurrency;
    @FindBy(xpath = "//*[@id='currency-classic']/i")
    private WebElement clasicCurrency;
    @FindBy(xpath = "//*[@id='currency-premium']/i")
    private WebElement premiumCurrency;

    @FindBy(id = "translation-btn")
    private WebElement translateBtn;

    @FindBy(xpath = "//*[invalid locators]")
    private WebElement invalidLocators;


    public void clickOnCountryName(){
        countryBtn.click();
    }

    public String getCurrentCountryName(){
        return countryName.getText();
    }

    public void selectKSACountry(){
        KSA.click();
    }

    public void selectKuwaitCountry(){
        kuwait.click();
    }

    public void selectBahrainCountry(){
        bahrain.click();
    }

    public void changeLangToEng(){
        translateBtn.click();
    }

    public void changeLangToAr(){
        translateBtn.click();
    }


    public List<String> getPlans(){
        List<String> plans = new ArrayList<>();
        plans.add(planLite.getText());
        plans.add(planClassic.getText());
        plans.add(planPremium.getText());
        return plans;
    }

    public List<String> getPrices(){
        List<String> prices = new ArrayList<>();
        prices.add(liteCurrency.getText());
        prices.add(clasicCurrency.getText());
        prices.add(premiumCurrency.getText());
        return prices;
    }



}
