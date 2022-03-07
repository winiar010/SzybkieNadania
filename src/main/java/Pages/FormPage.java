package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FormPage {

    private static Base base = new Base();

    @FindBy(css = "#onetrust-accept-btn-handler")
    private WebElement closeCookies;

    @FindBy(className = "btn-cookie-trigger")
    private WebElement cookieButton;

    //sposób dostawy
    @FindBy(css = "[for = deliveryTypeboxmachine]")
    private WebElement deliveryTypeBoxmachine;

    @FindBy(css = "[for = deliveryTypeaddress]")
    private WebElement deliveryTypeAddress;

    //rozmiar paczki
    @FindBy(css = "[for = parcelSizeA]>span")
    private WebElement parcelSizeA;

    @FindBy(css = "[for = parcelSizeB]>span")
    private WebElement parcelSizeB;

    @FindBy(css = "[for = parcelSizeC]>span")
    private WebElement parcelSizeC;

    //sekcja odbiorcy
    @FindBy(name = "targetAddress.name")
    private WebElement receiverName;

    @FindBy(name = "addresseeEmail")
    private WebElement addresseeEmail;

    @FindBy(name = "phoneNumber")
    private WebElement receiverPhoneNumber;

    @FindBy(name = "targetAddress.zipCode")
    private WebElement receiverZipCode;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    private WebElement receiverTown;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    private WebElement receiverStreet;

    @FindBy(name = "targetAddress.buildingNo")
    private WebElement receiverBuildingNo;

    @FindBy(name = "targetAddress.flatNo")
    private WebElement receiverFlatNo;

    @FindBy(css = ".ng-input > input")
    private WebElement receiverBoxMachineName;

    //sekcja nadawcy
    @FindBy(name = "senderAddress.name")
    private WebElement senderName;

    @FindBy(name = "senderAddress.email")
    private WebElement senderEmail;

    @FindBy(name = "senderAddress.phoneNum")
    private WebElement senderPhone;

    //sekcja faktury
    @FindBy(css = ".flex-nowrap .checkbox-label > span")
    private WebElement zaznaczFakture;

    //firma w Polsce
    @FindBy(css = "[for = legalStatuscompany]")
    private WebElement invoiceCompany;

    @FindBy(name = "invoice.company.nip")
    private WebElement invoiceCompanyNip;

    @FindBy(name = "invoice.company.companyName")
    private WebElement invoiceCompanyName;

    @FindBy(name = "invoice.company.zipCode")
    private WebElement invoiceCompanyZipCode;

    @FindBy(css = "#parcelForm > div > div.col-md-6.col-lg-7.col-xl-8 > app-dynamic-form > form > app-section:nth-child(25) > div > app-input > div > div > div > app-selectpicker > ng-select > div > div > div.ng-input > input[type=text]")
    private WebElement invoiceCompanyTown;

    @FindBy(css = "#parcelForm > div > div.col-md-6.col-lg-7.col-xl-8 > app-dynamic-form > form > app-section:nth-child(26) > div > app-input > div > div > div > app-selectpicker > ng-select > div > div > div.ng-input > input[type=text]")
    private WebElement invoiceCompanyStreet;

    @FindBy(name = "invoice.company.buildingNo")
    private WebElement invoiceCompanyBuildingNo;

    @FindBy(name = "invoice.company.flatNo")
    private WebElement invoiceCompanyFlatNo;

    @FindBy(name = "invoice.company.email")
    private WebElement invoiceCompanyEmail;

    //Osoba prywatna
    @FindBy(css = "[for = legalStatusindividual]")
    private WebElement invoiceIndividual;

    @FindBy(name = "invoice.individual.companyName")
    private WebElement invoiceIndividualNameSurname;

    @FindBy(name = "invoice.individual.email")
    private WebElement invoiceIndividualEmail;

    @FindBy(name = "invoice.individual.zipCode")
    private WebElement invoiceIndividualZipCode;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[27]/div/app-input/div/div/div/app-selectpicker/ng-select/div/div/div[2]/input")
    private WebElement invoiceIndividualTown;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[28]/div/app-input/div/div/div/app-selectpicker/ng-select/div/div/div[2]/input")
    private WebElement invoiceIndividualStreet;

    @FindBy(name = "invoice.individual.buildingNo")
    private WebElement invoiceIndividualBuildingNo;

    @FindBy(name = "invoice.individual.flatNo")
    private WebElement invoiceIndividualFlatNo;

    //firma za granicą
    @FindBy(css = "[for = legalStatusforeignCompany]")
    private WebElement foreignCompany;

    @FindBy(css = "#parcelForm > div > div.col-md-6.col-lg-7.col-xl-8 > app-dynamic-form > form > app-section.col-12.col-lg-6.custom-section-margin-select.left.sections-combined > div > app-input > div > div > div > app-complex-select > ng-select > div > div > div.ng-input > input[type=text]")
    private WebElement invoiceForeignTaxIdPrefix;

    @FindBy(name = "invoice.foreignCompany.nip")
    private WebElement invoiceForeignCompanyTaxId;

    @FindBy(name = "invoice.foreignCompany.companyName")
    private WebElement invoiceForeignCompanyName;

    @FindBy(css = "#parcelForm > div > div.col-md-6.col-lg-7.col-xl-8 > app-dynamic-form > form > app-section:nth-child(27) > div > app-input > div > div > div > app-complex-select > ng-select > div > div > div.ng-input > input[type=text]")
    private WebElement invoiceForeignSelectCountry;

    @FindBy(name = "invoice.foreignCompany.zipCode")
    private WebElement invoiceForeignZipCode;

    @FindBy(name = "invoice.foreignCompany.town")
    private WebElement invoiceForeignTown;

    @FindBy(name = "invoice.foreignCompany.street")
    private WebElement invoiceForeignStreet;

    @FindBy(name = "invoice.foreignCompany.buildingNo")
    private WebElement invoiceForeignBuildingNumber;

    @FindBy(name = "invoice.foreignCompany.flatNo")
    private WebElement invoiceForeignFlatNo;

    @FindBy(name = "invoice.foreignCompany.email")
    private WebElement invoiceForeignEmail;

    @FindBy(css = ".col-12:nth-child(1) > .form-section .custom-action-in-title")
    private WebElement howToSendParcel;

    @FindBy(css = ".font-weight-bold.font-size-16.font-color-dark.font-dinamit")
    private WebElement labelReady;

    //    @FindBy(xpath = "//app-section[2]/div/app-input[2]/div/span/span[2]")
    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[2]/div/app-input[2]/div/span/span[2]")
    private WebElement howToPackParcel;

    @FindBy(xpath = "//h4[contains(.,'Jak spakować paczkę?')]")
    private WebElement packInstructions;

    @FindBy(css = ".input-element > .input-group.input-group--no-hint > app-form-button")
    private WebElement copySenderData;

    @FindBy(css = ".section-input .form-checkbox .input-checkmark")
    private WebElement zgodaRegulamin;

    @FindBy(css = ".newsletter-field .input-checkmark")
    private WebElement zgodaMarketing;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[2]/div[2]/app-parcel-form-summary/div/div[1]/ul/li[3]/div/div/div/div/div/app-input-checkbox/div/label")
    private WebElement kodRabatowy;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[2]/div[2]/app-parcel-form-summary/div/div[1]/ul/li[3]/div/div/div/div/div[2]/input")
    private WebElement kodRabatowyInput;

    @FindBy(css = "app-error > small > ul > li")
    private WebElement zgodaRegulaminWalidacja;

    @FindBy(xpath = "//*[@id='parcelFormButton']/button")
    private WebElement submit;

    Boolean isCookies = Base.driver.findElements(By.cssSelector("#onetrust-accept-btn-handler")).size() > 0;

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    public FormPage() {
        PageFactory.initElements(Base.driver, this);
    }

    public void closeCookies() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        if (isCookies) {
            closeCookies.click();
        }
    }

    public void cookieButton() {
        cookieButton.click();
    }

    public void deliveryTypeBoxmachine() {
        waitPage.waitUntilElement(deliveryTypeBoxmachine);
        deliveryTypeBoxmachine.click();
    }

    public void deliveryTypeAddress() {
        waitPage.waitUntilElement(deliveryTypeAddress);
        deliveryTypeAddress.click();
    }

    public void clickA() {
        actionPage.moveToElement(parcelSizeA);
        parcelSizeA.click();
    }

    public void clickB() {
        actionPage.moveToElement(parcelSizeA);
        parcelSizeB.click();
    }

    public void clickC() {
        actionPage.moveToElement(parcelSizeA);
        parcelSizeC.click();
    }

    public void setReceiverName() {
        actionPage.moveToElement(addresseeEmail);
        receiverName.click();
        receiverName.sendKeys("Mikołaj Win");
    }

    public void setAddresseeEmail() {
        actionPage.moveToElement(addresseeEmail);
        addresseeEmail.click();
        addresseeEmail.sendKeys("odbiorca@test.pl");
    }

    public void setReceiverPhoneNumber() {
        actionPage.moveToElement(receiverPhoneNumber);
        receiverPhoneNumber.click();
        receiverPhoneNumber.sendKeys("888000888");
    }

    public void setBoxMachineName() throws InterruptedException {
        actionPage.moveToElement(senderName);
        receiverBoxMachineName.click();
        receiverBoxMachineName.sendKeys("KRA04N");
        TimeUnit.SECONDS.sleep(1);
        receiverBoxMachineName.sendKeys(Keys.ENTER);
    }

    public void setReceiverZipCode() throws InterruptedException {
        actionPage.moveToElement(receiverZipCode);
        TimeUnit.MILLISECONDS.sleep(500);
        receiverZipCode.sendKeys("30653");
        TimeUnit.SECONDS.sleep(1);
        receiverZipCode.sendKeys(Keys.ENTER);
    }

    public void setReceiverTown() throws InterruptedException {
        actionPage.moveToElement(receiverTown);
        TimeUnit.MILLISECONDS.sleep(500);
        receiverTown.sendKeys("Kraków");
        TimeUnit.SECONDS.sleep(1);
        receiverTown.sendKeys(Keys.ENTER);
    }

    public void setReceiverStreet() throws InterruptedException {
        actionPage.moveToElement(receiverStreet);
        TimeUnit.MILLISECONDS.sleep(500);
        receiverStreet.sendKeys("Zabawa");
        TimeUnit.SECONDS.sleep(1);
        receiverStreet.sendKeys(Keys.ENTER);
    }

    public void setReceiverBuildingNo() {
        actionPage.moveToElement(receiverBuildingNo);
        receiverBuildingNo.click();
        receiverBuildingNo.sendKeys("55");
    }

    public void setReceiverFlatNo() {
        actionPage.moveToElement(receiverFlatNo);
        receiverFlatNo.click();
        receiverFlatNo.sendKeys("3");
    }

    public void setSenderName() {
        actionPage.moveToElement(senderName);
        senderName.click();
        senderName.sendKeys("Mik Test");
    }

    public void setSenderEmail() {
        actionPage.moveToElement(senderEmail);
        senderEmail.click();
        senderEmail.sendKeys("nadawca@test.pl");
    }

    public void setSenderPhone() {
        actionPage.moveToElement(senderPhone);
        senderPhone.click();
        senderPhone.sendKeys("123123123");
    }

    public void clickZaznaczFakture() {
        zaznaczFakture.click();
    }

    public void clickFirmaWPolsce() {
        invoiceCompany.click();
    }

    public void setInvoiceCompanyNip() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyNip);
        invoiceCompanyNip.click();
        invoiceCompanyNip.sendKeys("1234567819");
        TimeUnit.SECONDS.sleep(1);
    }

    public void setInvoiceCompanyCompanyName() {
        actionPage.moveToElement(invoiceCompanyName);
        invoiceCompanyName.click();
        invoiceCompanyName.sendKeys("Firma testowa");
    }

    public void setInvoiceCompanyZipCode() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyZipCode);
        TimeUnit.MILLISECONDS.sleep(500);
        invoiceCompanyZipCode.sendKeys("30653");
        TimeUnit.SECONDS.sleep(1);
        invoiceCompanyZipCode.sendKeys(Keys.ENTER);

    }

    public void setInvoiceCompanyTown() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyTown);
        TimeUnit.MILLISECONDS.sleep(500);
        invoiceCompanyTown.sendKeys("Kraków");
        TimeUnit.SECONDS.sleep(1);
        invoiceCompanyTown.sendKeys(Keys.ENTER);
    }

    public void setInvoiceCompanyStreet() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyStreet);
        TimeUnit.MILLISECONDS.sleep(500);
        invoiceCompanyStreet.sendKeys("Zabawa");
        TimeUnit.SECONDS.sleep(1);
        invoiceCompanyStreet.sendKeys(Keys.ENTER);
    }

    public void setInvoiceCompanyBuildingNo() {
        actionPage.moveToElement(invoiceCompanyBuildingNo);
        invoiceCompanyBuildingNo.click();
        invoiceCompanyBuildingNo.sendKeys("55");
    }

    public void setInvoiceCompanyFlatNo() {
        actionPage.moveToElement(invoiceCompanyFlatNo);
        invoiceCompanyFlatNo.click();
        invoiceCompanyFlatNo.sendKeys("3");
    }

    public void setInvoiceCompanyEmail() {
        actionPage.moveToElement(invoiceCompanyEmail);
        invoiceCompanyEmail.click();
        invoiceCompanyEmail.sendKeys("firma@test.pl");
    }

    public void osobaPrywatna() {
        invoiceIndividual.click();
    }

    public void setInvoiceIndividualNameSurname() {
        actionPage.moveToElement(invoiceIndividualNameSurname);
        invoiceIndividualNameSurname.click();
        invoiceIndividualNameSurname.sendKeys("Mikołaj Win");
    }

    public void setInvoiceIndividualEmail() {
        actionPage.moveToElement(invoiceIndividualEmail);
        invoiceIndividualEmail.click();
        invoiceIndividualEmail.sendKeys("mw@test.pl");
    }

    public void setInvoiceIndividualZipCode() throws InterruptedException {
        actionPage.moveToElement(invoiceIndividualZipCode);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceIndividualZipCode.sendKeys("30653");
        TimeUnit.SECONDS.sleep(1);
        invoiceIndividualZipCode.sendKeys(Keys.ENTER);
    }

    public void setInvoiceIndividualTown() throws InterruptedException {
        actionPage.moveToElement(invoiceIndividualTown);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceIndividualTown.sendKeys("Kraków");
        TimeUnit.SECONDS.sleep(1);
        invoiceIndividualTown.sendKeys(Keys.ENTER);
    }

    public void setInvoiceIndividualStreet() throws InterruptedException {
        actionPage.moveToElement(invoiceIndividualStreet);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceIndividualStreet.sendKeys("Zabawa");
        TimeUnit.SECONDS.sleep(1);
        invoiceIndividualStreet.sendKeys(Keys.ENTER);
    }

    public void setInvoiceIndividualBuildingNo() {
        actionPage.moveToElement(invoiceIndividualBuildingNo);
        invoiceIndividualBuildingNo.click();
        invoiceIndividualBuildingNo.sendKeys("55");
    }

    public void setInvoiceIndividualFlatNo() {
        actionPage.moveToElement(invoiceIndividualFlatNo);
        invoiceIndividualFlatNo.click();
        invoiceIndividualFlatNo.sendKeys("3");
    }

    public void firmaZaGranica() {
        foreignCompany.click();
    }

    public void setInvoiceForeignTaxIdPrefix() throws InterruptedException {
        actionPage.moveToElement(invoiceForeignTaxIdPrefix);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceForeignTaxIdPrefix.sendKeys("BE");
        TimeUnit.SECONDS.sleep(1);
        invoiceForeignTaxIdPrefix.sendKeys(Keys.ENTER);
    }

    public void setInvoiceForeignCompanyTaxId() throws InterruptedException {
        actionPage.moveToElement(invoiceForeignCompanyTaxId);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceForeignCompanyTaxId.sendKeys("9999999999");
        TimeUnit.SECONDS.sleep(1);
    }

    public void setInvoiceForeignCompanyName() {
        actionPage.moveToElement(invoiceForeignEmail);
        invoiceForeignCompanyName.click();
        invoiceForeignCompanyName.sendKeys("InPost test company");
    }

    public void setInvoiceForeignSelectCountry() throws InterruptedException {
        actionPage.moveToElement(invoiceForeignSelectCountry);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceForeignSelectCountry.sendKeys("Belgia");
        TimeUnit.SECONDS.sleep(1);
        invoiceForeignSelectCountry.sendKeys(Keys.ENTER);
    }

    public void setInvoiceForeignZipCode() {
        actionPage.moveToElement(invoiceForeignZipCode);
        invoiceForeignZipCode.sendKeys("1000");
    }

    public void setInvoiceForeignTown() {
        actionPage.moveToElement(invoiceForeignTown);
        invoiceForeignTown.sendKeys("Bruksela");
    }

    public void setInvoiceForeignStreet() {
        actionPage.moveToElement(invoiceForeignStreet);
        invoiceForeignStreet.sendKeys("Rue Stevin");
    }

    public void setInvoiceForeignBuildingNo() {
        actionPage.moveToElement(invoiceForeignBuildingNumber);
        invoiceForeignBuildingNumber.sendKeys("139");
    }

    public void setInvoiceForeignFlatNo() {
        actionPage.moveToElement(invoiceForeignFlatNo);
        invoiceForeignFlatNo.sendKeys("A");
    }

    public void setInvoiceForeignEmail() {
        actionPage.moveToElement(invoiceForeignEmail);
        invoiceForeignEmail.sendKeys("test@company.be");
    }

    public void clickZgodaRegulamin() {
        actionPage.moveToElement(zgodaRegulamin);
        zgodaRegulamin.click();
    }

    public void clickZgodaMarketing() {
        actionPage.moveToElement(zgodaMarketing);
        zgodaMarketing.click();
    }

    public void clickSubmit() {
        actionPage.moveToElement(submit);
        submit.click();
    }

    public void clickHowToSendParcel() {
        actionPage.moveToElement(howToSendParcel);
        howToSendParcel.click();
    }

    public String getLabelReady() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return labelReady.getAttribute("innerText");
    }

    public void clickHowToPackParcel() {
        actionPage.moveToElement(receiverName);
        howToPackParcel.click();
    }

    public String getPackInstructions() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return packInstructions.getAttribute("innerText");
    }

    public void clickCopySenderData() throws InterruptedException {
        actionPage.moveToElement(invoiceIndividualNameSurname);
        TimeUnit.MILLISECONDS.sleep(500);
        copySenderData.click();
    }

    public String checkRegulationsValidation() throws InterruptedException {
        actionPage.moveToElement(zgodaRegulaminWalidacja);
        TimeUnit.MILLISECONDS.sleep(500);
        return zgodaRegulaminWalidacja.getText();
    }

    public void clickPromoCode() throws InterruptedException {
        actionPage.moveToElement(howToPackParcel);
        TimeUnit.MILLISECONDS.sleep(500);
        kodRabatowy.click();
    }

    public void putPromoCodeInput() throws InterruptedException {
        actionPage.moveToElement(kodRabatowy);
        TimeUnit.MILLISECONDS.sleep(500);
        kodRabatowyInput.sendKeys("1234567890");
    }

}

