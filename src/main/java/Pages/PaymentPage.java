package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PaymentPage {

    @FindBy(css = "#paymenttypeMain > .payment-method:nth-child(1)")
    private WebElement paymentForm;

    @FindBy(css = ".button-container .finish-button")
    private WebElement paymentButton;

    @FindBy(css = "button:nth-child(1)")
    private WebElement paymentSuccess;

    @FindBy(css = "#nifty > p > button[value = '2']")
    private WebElement paymentFail;

    @FindBy(css = "#blik-section > .choice-header")
    private WebElement paymentType;

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    public PaymentPage() {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickPaymentForm() throws InterruptedException {
        actionPage.moveToElement(paymentForm);
        paymentForm.click();
        TimeUnit.SECONDS.sleep(1);
    }

    public void clickPaymentButton() throws InterruptedException {
        waitPage.waitUntilElement(paymentButton);
        actionPage.moveToElement(paymentButton);
        TimeUnit.SECONDS.sleep(2);
        paymentButton.click();
    }

    public void clickPaymentSuccess() {
        waitPage.waitUntilElement(paymentSuccess);
        paymentSuccess.click();
    }

    public void clickPaymentFail() {
        waitPage.waitUntilElement(paymentFail);
        paymentFail.click();
    }

    public String getPaymentType() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return paymentType.getText();
    }

}
