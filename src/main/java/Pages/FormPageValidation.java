package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FormPageValidation extends FormPage {

    @FindBy(name = "targetAddress.name")
    private WebElement receiverName;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[4]/div/app-input/div/div/app-error/small/ul/li")
    private WebElement receiverNameError;

    @FindBy(name = "addresseeEmail")
    private WebElement receiverEmail;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[5]/div/app-input/div/div/app-error/small/ul")
    private static WebElement receiverEmailError;

    @FindBy(name = "phoneNumber")
    private WebElement receiverPhoneNumber;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[6]/div/app-input/div/div/app-error/small/ul")
    private WebElement receiverPhoneNumberError;

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

    @FindBy(css = "div.ng-input > input[type=text]")
    private WebElement receiverBoxMachineName;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[7]/div/app-input/div[1]/div/app-error/small/ul")
    private WebElement receiverBoxMachineNameError;

    @FindBy(css = ".app-input.form-group > .input-group > div > h3")
    private WebElement nadawca;

    @FindBy(name = "senderAddress.name")
    private WebElement senderName;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[9]/div/app-input/div/div/app-error/small/ul")
    private WebElement senderNameError;

    @FindBy(name = "senderAddress.email")
    private WebElement senderEmail;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[10]/div/app-input/div/div/app-error/small/ul")
    private WebElement senderEmailError;

    @FindBy(name = "senderAddress.phoneNum")
    private WebElement senderPhone;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[11]/div/app-input/div/div/app-error/small/ul")
    private WebElement senderPhoneNumberError;

    @FindBy(css = "[for = courier_comment_changer]")
    private WebElement additionalInformation;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[12]/div/app-input[2]/div/div/app-error/small/ul")
    private WebElement additionalInformationError;

    @FindBy(css = "div.third-column > div > .description")
    private WebElement additionalInformationSummaryPage;

    @FindBy(css = "input[name = 'customerReference']")
    private WebElement customerReference;

    @FindBy(css = "app-input.title.app-input.form-group > div > div > h3")
    private WebElement zgoda;

    //firma w Polsce
    @FindBy(name = "invoice.company.nip")
    private WebElement invoiceCompanyNip;

    @FindBy(css = "app-error > small > ul")
    private WebElement invoiceCompanyError;

    @FindBy(name = "invoice.company.companyName")
    private WebElement invoiceCompanyName;

    @FindBy(name = "invoice.company.zipCode")
    private WebElement invoiceCompanyZipCode;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[20]/div/app-input/div/div/div/app-selectpicker/ng-select/div/div/div[2]/input")
    private WebElement invoiceCompanyTown;

    @FindBy(xpath = "//*[@id='parcelForm']/div/div[1]/app-dynamic-form/form/app-section[21]/div/app-input/div/div/div/app-selectpicker/ng-select/div/div/div[2]/input")
    private WebElement invoiceCompanyStreet;

    @FindBy(name = "invoice.company.buildingNo")
    private WebElement invoiceCompanyBuildingNo;

    @FindBy(name = "invoice.company.flatNo")
    private WebElement invoiceCompanyFlatNo;

    @FindBy(name = "invoice.company.email")
    private WebElement invoiceCompanyEmail;


    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    public FormPageValidation() {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickZgoda() throws InterruptedException {
        actionPage.moveToElement(zgoda);
        TimeUnit.MILLISECONDS.sleep(200);
        zgoda.click();
    }

    public void clickReceiverName() throws InterruptedException {
        actionPage.moveToElement(receiverName);
        TimeUnit.MILLISECONDS.sleep(200);
//        receiverName.clear();
        receiverName.click();
    }

    public void inputReceiverNameInvalidSyntax() throws InterruptedException {
        actionPage.moveToElement(receiverName);
        TimeUnit.MILLISECONDS.sleep(200);
        receiverName.sendKeys("test/");
    }

    public void inputReceiverNameTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(receiverName);
        TimeUnit.MILLISECONDS.sleep(200);
        receiverName.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public String getReceiverNameError() throws InterruptedException {
        actionPage.moveToElement(receiverName);
        TimeUnit.MILLISECONDS.sleep(800);
        return receiverNameError.getText();
    }

    public void clickReceiverEmail() throws InterruptedException {
        actionPage.moveToElement(nadawca);
        TimeUnit.MILLISECONDS.sleep(200);
        receiverEmail.click();
    }

    public void inputReceiverEmailTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(nadawca);
        TimeUnit.MILLISECONDS.sleep(200);
        receiverEmail.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void inputReceiverEmailTooShort() {
        actionPage.moveToElement(nadawca);
        receiverEmail.sendKeys("a");
    }

    public void inputReceiverEmailInvalid() {
        actionPage.moveToElement(nadawca);
        receiverEmail.sendKeys("test");
    }

    public static String getReceiverEmailError() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return receiverEmailError.getText();
    }

    public void clickReceiverPhoneNumber() throws InterruptedException {
        actionPage.moveToElement(nadawca);
        TimeUnit.MILLISECONDS.sleep(200);
        receiverPhoneNumber.click();
    }

    public void inputReceiverPhoneInvalid() {
        actionPage.moveToElement(nadawca);
        receiverPhoneNumber.sendKeys("11");
    }

    public void inputReceiverPhoneNonNumeric() {
        actionPage.moveToElement(nadawca);
        receiverPhoneNumber.sendKeys("tekst");
    }

    public String getReceiverPhoneError() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return receiverPhoneNumberError.getText();
    }

    public void clickReceiverBoxMachineName() throws InterruptedException {
        actionPage.moveToElement(nadawca);
        TimeUnit.MILLISECONDS.sleep(200);
        receiverBoxMachineName.click();
    }

    public String getReceiverBoxMachineError() throws InterruptedException {
        actionPage.moveToElement(nadawca);
        TimeUnit.MILLISECONDS.sleep(400);
        return receiverBoxMachineNameError.getText();
    }

    public void clickAdditionalInformation() throws InterruptedException {
        actionPage.moveToElement(additionalInformation);
        additionalInformation.click();
    }

    public void clickCustomerReference() throws InterruptedException {
        actionPage.moveToElement(customerReference);
        customerReference.click();
    }

    public void inputAdditionalInformation() throws InterruptedException {
        actionPage.moveToElement(senderName);
        customerReference.sendKeys("To jest testowe zamówienie");
    }

    public String getAdditionalInformation() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(400);
        return additionalInformationSummaryPage.getText();
    }

    public void inputAdditionalInformationTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(additionalInformation);
        additionalInformation.click();
        actionPage.moveToElement(senderName);
        customerReference.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public String getAdditionalInformationError() throws InterruptedException {
        actionPage.moveToElement(customerReference);
        TimeUnit.MILLISECONDS.sleep(400);
        return additionalInformationError.getText();
    }

    public void clickSenderName() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(200);
        senderName.click();
    }

    public void inputSenderNameTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(200);
        senderName.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void inputSenderNameInvalidSyntax() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(200);
        senderName.sendKeys("test/");
    }

    public String getSenderNameError() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(400);
        return senderNameError.getText();
    }

    public void clickSenderEmail() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(200);
        senderEmail.click();
    }

    public void inputSenderEmailTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(200);
        senderEmail.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void inputSenderEmailTooShort() {
        actionPage.moveToElement(senderPhone);
        senderEmail.sendKeys("a");
    }

    public void inputSenderEmailInvalid() {
        actionPage.moveToElement(senderPhone);
        senderEmail.sendKeys("test");
    }

    public String getSenderEmailError() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return senderEmailError.getText();
    }

    public void clickSenderPhoneNumber() throws InterruptedException {
        actionPage.moveToElement(senderPhone);
        TimeUnit.MILLISECONDS.sleep(200);
        senderPhone.click();
    }

    public void inputSenderPhoneInvalid() {
        actionPage.moveToElement(senderPhone);
        senderPhone.sendKeys("11");
    }

    public void inputSenderPhoneNonNumeric() {
        actionPage.moveToElement(senderPhone);
        senderPhone.sendKeys("tekst");
    }

    public String getSenderPhoneError() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return senderPhoneNumberError.getText();
    }

    public void clickInvoiceCompanyNip() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyNip.click();
    }

    public void inputInvoiceCompanyNip() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyNip.sendKeys("99999999999");
        invoiceCompanyNip.sendKeys("9");
    }

    public String getError() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return invoiceCompanyError.getText();
    }

    public void clickInvoiceCompanyName() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyName.click();
    }

    public void inputInvoiceCompanyNameTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyName.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void inputInvoiceCompanyNameInvalidSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyName.sendKeys("test/");
    }

    public void clickInvoiceCompanyZipCode() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyZipCode.click();
    }

    public void inputInvoiceCompanyZipCodeInvalidSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyZipCode.sendKeys("33");
    }

    public void inputInvoiceCompanyZipCode() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyZipCode.sendKeys("33-333");
    }

    public void clickInvoiceCompanyTown() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyTown.click();
    }

    public void inputInvoiceCompanyTownTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyTown.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        TimeUnit.SECONDS.sleep(2);
        invoiceCompanyTown.sendKeys(Keys.ENTER);
    }

    public void inputInvoiceCompanyTownTooShort() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyTown.sendKeys("a");
        TimeUnit.SECONDS.sleep(2);
        invoiceCompanyTown.sendKeys(Keys.ENTER);
    }

    public void clickInvoiceCompanyStreet() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyStreet.click();
    }

    public void inputInvoiceCompanyStreetTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyStreet.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        TimeUnit.SECONDS.sleep(2);
        invoiceCompanyStreet.sendKeys(Keys.ENTER);
    }

    public void inputInvoiceCompanyStreetTooShort() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyStreet.sendKeys("2");
        TimeUnit.SECONDS.sleep(3);
        invoiceCompanyStreet.sendKeys(Keys.ENTER);
    }

    public void inputInvoiceCompanyTown() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyTown.sendKeys("Ptaszkowa");
        TimeUnit.SECONDS.sleep(2);
        invoiceCompanyTown.sendKeys(Keys.ENTER);
    }

    public void clickInvoiceCompanyBuildingNo() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyBuildingNo.click();
    }

    public void inputInvoiceCompanyBuildingNoTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(400);
        invoiceCompanyBuildingNo.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void inputInvoiceCompanyFlatNoTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyFlatNo.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void clickInvoiceCompanyEmail() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyEmail.click();
    }

    public void inputInvoiceCompanyEmailTooLongSyntax() throws InterruptedException {
        actionPage.moveToElement(invoiceCompanyEmail);
        TimeUnit.MILLISECONDS.sleep(200);
        invoiceCompanyEmail.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void inputInvoiceCompanyEmailTooShort() {
        actionPage.moveToElement(invoiceCompanyEmail);
        invoiceCompanyEmail.sendKeys("a");
    }

    public void inputInvoiceCompanyEmailInvalid() {
        actionPage.moveToElement(invoiceCompanyEmail);
        invoiceCompanyEmail.sendKeys("test");
    }

}
