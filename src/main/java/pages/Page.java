package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends BasePage {
    @FindBy(xpath = ".//input[@name='userName']")
    WebElement loginField;

    @FindBy(xpath = ".//input[@name='password']")
    WebElement passwordField;

    @FindBy(xpath = ".//input[@name='login']")
    WebElement signInField;

    @FindBy(xpath = ".//input[@name='tripType'][@value='roundtrip']")
    WebElement radioType;

    @FindBy(xpath = ".//select[@name='passCount']")
    WebElement selectPassengers;

    @FindBy(xpath = ".//select[@name='passCount']//option[@value='2']")
    WebElement selectPassengersValue;

    @FindBy(xpath = ".//select[@name='fromPort']")
    WebElement selectDepartingFrom;

    @FindBy(xpath = ".//select[@name='fromPort']//option[@value='Paris']")
    WebElement selectDepartingFromValue;

    @FindBy(xpath = ".//select[@name='fromMonth']")
    WebElement selectOnMonth;

    @FindBy(xpath = ".//select[@name='fromMonth']//option[@value='4']")
    WebElement selectOnMonthValue;

    @FindBy(xpath = ".//select[@name='fromDay']")
    WebElement selectOnDay;

    @FindBy(xpath = ".//select[@name='fromDay']//option[@value='5']")
    WebElement selectOnDayValue;

    @FindBy(xpath = ".//select[@name='toPort']")
    WebElement selectArrivingIn;

    @FindBy(xpath = ".//select[@name='toPort']//option[@value='Sydney']")
    WebElement selectArrivingInValue;

    @FindBy(xpath = ".//select[@name='toMonth']")
    WebElement selectReturnMonth;

    @FindBy(xpath = ".//select[@name='toMonth']//option[@value='5']")
    WebElement selectReturnMonthValue;

    @FindBy(xpath = ".//select[@name='toDay']")
    WebElement selectReturnDay;

    @FindBy(xpath = ".//select[@name='toDay']//option[@value='5']")
    WebElement selectReturnDayValue;

    @FindBy(xpath = ".//input[@name='servClass'][@value='First']")
    WebElement radioServiceClass;

    @FindBy(xpath = ".//select[@name='airline']")
    WebElement selectAirline;

    @FindBy(xpath = ".//select[@name='airline']//option[text()='Blue Skies Airlines']")
    WebElement selectAirlineValue;

    @FindBy(xpath = ".//input[@name='findFlights']")
    WebElement detailsContinue;

    @FindBy(xpath = ".//input[@name='reserveFlights']")
    WebElement selectFlightsContinue;

    @FindBy(xpath = ".//input[@name='passFirst0']")
    WebElement firstName1Field;

    @FindBy(xpath = ".//input[@name='passLast0']")
    WebElement lastName1Field;

    @FindBy(xpath = ".//select[@name='pass.0.meal']")
    WebElement selectMeal1;

    @FindBy(xpath = ".//select[@name='pass.0.meal']//option[@value='VGML']")
    WebElement selectMeal1Value;

    @FindBy(xpath = ".//input[@name='passFirst1']")
    WebElement firstName2Field;

    @FindBy(xpath = ".//input[@name='passLast1']")
    WebElement lastName2Field;

    @FindBy(xpath = ".//select[@name='pass.1.meal']")
    WebElement selectMeal2;

    @FindBy(xpath = ".//select[@name='pass.1.meal']//option[@value='KSML']")
    WebElement selectMeal2Value;

    @FindBy(xpath = ".//select[@name='creditCard']")
    WebElement selectCreditType;

    @FindBy(xpath = ".//select[@name='creditCard']//option[@value='BA']")
    WebElement selectCreditTypeValue;

    @FindBy(xpath = ".//input[@name='creditnumber']")
    WebElement numberField;

    @FindBy(xpath = ".//select[@name='cc_exp_dt_mn']")
    WebElement selectExpirationMonth;

    @FindBy(xpath = ".//select[@name='cc_exp_dt_mn']//option[text()='01 \n" +
            "                      ']")
    WebElement selectExpirationMonthValue;

    @FindBy(xpath = ".//select[@name='cc_exp_dt_yr']")
    WebElement selectExpirationYear;

    @FindBy(xpath = ".//select[@name='cc_exp_dt_yr']//option[@value='2001']")
    WebElement selectExpirationYearValue;

    @FindBy(xpath = ".//input[@name='cc_frst_name']")
    WebElement firstNameCreditCardField;

    @FindBy(xpath = ".//input[@name='cc_mid_name']")
    WebElement middleNameCreditCardField;

    @FindBy(xpath = ".//input[@name='cc_last_name']")
    WebElement lastNameCreditCardField;

    @FindBy(xpath = ".//input[@name='billAddress1']")
    WebElement billAddress1Field;

    @FindBy(xpath = ".//input[@name='billCity']")
    WebElement billCity1Field;

    @FindBy(xpath = ".//input[@name='billState']")
    WebElement billState1Field;

    @FindBy(xpath = ".//input[@name='billZip']")
    WebElement billZipField;

    @FindBy(xpath = ".//select[@name='billCountry']")
    WebElement selectBillCountry;

    @FindBy(xpath = ".//select[@name='billCountry']//option[@value='256']")
    WebElement selectBillCountryValue;

    @FindBy(xpath = ".//input[@name='delAddress1']")
    WebElement delAddress1Field;

    @FindBy(xpath = ".//input[@name='delCity']")
    WebElement delCityField;

    @FindBy(xpath = ".//input[@name='delState']")
    WebElement delStateField;

    @FindBy(xpath = ".//input[@name='delZip']")
    WebElement delZipField;

    @FindBy(xpath = ".//select[@name='delCountry']")
    WebElement selectDelCountry;

    @FindBy(xpath = ".//select[@name='delCountry']//option[@value='256']")
    WebElement selectDelCountryValue;

    @FindBy(xpath = ".//input[@name='buyFlights']")
    WebElement buyFlights;

    @FindBy(xpath = "./html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody"
            + "/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")
    WebElement totalPrice;

    @FindBy(xpath = "./html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"
            + "/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font")
    WebElement departing;

    @FindBy(xpath = "./html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"
            + "/table/tbody/tr[5]/td/table/tbody/tr[5]/td/font")
    WebElement returning;

    @FindBy(xpath = "./html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"
            + "/table/tbody/tr[5]/td/table/tbody/tr[7]/td/font")
    WebElement passengers;

    @FindBy(xpath = "./html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"
            + "/table/tbody/tr[5]/td/table/tbody/tr[9]/td/p")
    WebElement billedTo;

    @FindBy(xpath = "./html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"
            + "/table/tbody/tr[5]/td/table/tbody/tr[11]/td/p")
    WebElement deliveryAddress;

    public Page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void login(final String login, final String pass){
        waitClickable(signInField);
        loginField.sendKeys(login);
        passwordField.sendKeys(pass);
        signInField.click();
    }
    public void setDetails(){
        waitClickable(radioType);
        radioType.click();
        selectPassengers.click();
        selectPassengersValue.click();
        selectDepartingFrom.click();
        selectDepartingFromValue.click();
        selectOnMonth.click();
        selectOnMonthValue.click();
        selectOnDay.click();
        selectOnDayValue.click();
        selectArrivingIn.click();
        selectArrivingInValue.click();
        selectReturnMonth.click();
        selectReturnMonthValue.click();
        selectReturnDay.click();
        selectReturnDayValue.click();
        radioServiceClass.click();
        selectAirline.click();
        selectAirlineValue.click();
        detailsContinue.click();
    }

    public void setFlights(){
        waitClickable(selectFlightsContinue);
        selectFlightsContinue.click();
    }

    public void setBookFlight(final String firstName1, final String lastName1,
                              final String firstName2, final String lastName2,
                              final String number, final String middleName,
                              final String billAddress1, final String billCity1,
                              final String billState1, final String billZip) {
        waitClickable(firstName1Field);
        firstName1Field.sendKeys(firstName1);
        lastName1Field.sendKeys(lastName1);
        selectMeal1.click();
        selectMeal1Value.click();
        firstName2Field.sendKeys(firstName2);
        lastName2Field.sendKeys(lastName2);
        selectMeal2.click();
        selectMeal2Value.click();
        selectCreditType.click();
        selectCreditTypeValue.click();
        numberField.sendKeys(number);
        selectExpirationMonth.click();
        selectExpirationMonthValue.click();
        selectExpirationYear.click();
        selectExpirationYearValue.click();
        firstNameCreditCardField.sendKeys(firstName2);
        middleNameCreditCardField.sendKeys(middleName);
        lastNameCreditCardField.sendKeys(lastName2);
        billAddress1Field.clear();
        billAddress1Field.sendKeys(billAddress1);
        billCity1Field.clear();
        billCity1Field.sendKeys(billCity1);
        billState1Field.clear();
        billState1Field.sendKeys(billState1);
        billZipField.clear();
        billZipField.sendKeys(billZip);
        selectBillCountry.click();
        selectBillCountryValue.click();
        delAddress1Field.clear();
        delAddress1Field.sendKeys(billAddress1);
        delCityField.clear();
        delCityField.sendKeys(billCity1);
        delStateField.clear();
        delStateField.sendKeys(billState1);
        delZipField.clear();
        delZipField.sendKeys(billZip);
        selectDelCountry.click();
        selectDelCountryValue.click();
        clickOnOk();
        buyFlights.click();
    }

    public String getTotalPrice() {
        waitClickable(totalPrice);
        return totalPrice.getText();
    }

    public String getDeparting() {
        waitClickable(departing);
        return departing.getText();
    }

    public String getReturning() {
        waitClickable(returning);
        return returning.getText();
    }

    public String getPassengers() {
        waitClickable(passengers);
        return passengers.getText();
    }

    public String getBilledTo() {
        waitClickable(billedTo);
        return billedTo.getText();
    }

    public String getDeliveryAddress() {
        waitClickable(deliveryAddress);
        return deliveryAddress.getText();
    }
}
