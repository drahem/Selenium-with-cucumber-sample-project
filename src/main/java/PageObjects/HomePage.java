package PageObjects;

import Utilities.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomePage {

    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
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
    @FindBy(xpath = "//*[@id='currency-lite']/b")
    private WebElement litePrice;
    @FindBy(xpath = "//*[@id='currency-classic']/i")
    private WebElement clasicCurrency;
    @FindBy(xpath = "//*[@id='currency-classic']/b")
    private WebElement classicPrice;
    @FindBy(xpath = "//*[@id='currency-premium']/i")
    private WebElement premiumCurrency;
    @FindBy(xpath = "//*[@id='currency-premium']/b")
    private WebElement premiumPrice;

    @FindBy(id = "translation-btn")
    private WebElement translateBtn;


    public void clickOnCountryName(){
        countryBtn.click();
        Log.info("open choose country menu");
    }

    public String getCurrentCountryName(){
        return countryName.getText();
    }

    public void selectKSACountry(){
        KSA.click();
        Log.info("select KSA country page");
    }

    public void selectKuwaitCountry(){
        kuwait.click();
        Log.info("select Kuwait country page");
    }

    public void selectBahrainCountry(){
        bahrain.click();
        Log.info("select Bahrain country page");
    }

    public void changeLangToEng(){
        translateBtn.click();
        Log.info("set page language to english");
    }

    public void changeLangToAr(){
        translateBtn.click();
    }


    public List<String> getPlans(){
        List<String> plans = new ArrayList<>();
        plans.add(planLite.getText());
        plans.add(planClassic.getText());
        plans.add(planPremium.getText());
        Log.info("get list of plans names");
        return plans;
    }

    public List<String> getPrices(){
        List<String> prices = new ArrayList<>();
        prices.add(litePrice.getText() + " " + liteCurrency.getText());
        prices.add(classicPrice.getText() + " " + clasicCurrency.getText());
        prices.add(premiumPrice.getText() + " " + premiumCurrency.getText());
        Log.info("get list of prices of the packages");
        return prices;
    }

    @FindBy(xpath = "//button[text()='Click here']")
    WebElement giftCodeBtn;
    public void openGiftCardPage(){
        JavascriptExecutor executor = (JavascriptExecutor)webDriver;
        executor.executeScript("arguments[0].click();", giftCodeBtn);
        Log.info("open gift card page");
    }

    @FindBy(xpath = "//*[@class='signup-form__input']")
    WebElement giftCodeTextField;

    public void enterGiftCode(String code){
        giftCodeTextField.sendKeys(code);
        Log.info("enter code in the gift card code text box ");
    }

    @FindBy(className = "//*[@class='form-btn']")
    WebElement redeemBtn;
    public void clickRedeemBtn(){
        redeemBtn.click();
    }
    @FindBy(className = "//*[@class='error-msg']")
    WebElement errorMsg;
    public String getErrorMsg(){
        return errorMsg.getText();
    }

    @FindBy(className = "form-btn")
    private WebElement activateBtn;
    public void clickActivateBtn(){
        activateBtn.click();
    }

    @FindBy(id = "mobile")
    WebElement mobileNumberField;
    public void enterMobileNumber(String number){
        mobileNumberField.sendKeys(number);
    }

    @FindBy(xpath = "//*[text()='Subscribe Now']")
    WebElement subscribeBtn;
    public void clickSubscribe(){
        subscribeBtn.click();
    }

    @FindBy(id = "lite-selection")
    WebElement startTrialLite;
    @FindBy(id = "classic-selection")
    WebElement startTrialClassic;
    @FindBy(id = "premium-selection")
    WebElement startTrialPremium;

    public void startTrial(String plan){
        if (Objects.equals(plan, "LITE")){
            startTrialLite.click();
        }
        else if (Objects.equals(plan, "classic")){
            startTrialClassic.click();
        }
        else if (Objects.equals(plan, "PREMIUM")){
            startTrialPremium.click();
        }
        else {
            System.out.println("incorrect plan name");
        }
    }

    @FindBy(className = "total-price")
    WebElement totalPrice;
    public String getTotalPrice(){
        return totalPrice.getText();
    }



}
