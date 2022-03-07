package Payment;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class shouldDisplayPaymentSuccesslMessage extends Base {

    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldDisplayPaymentSuccesslMessage() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();

        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.setReceiverName();
        formPage.setAddresseeEmail();
        formPage.setReceiverPhoneNumber();
        formPage.setBoxMachineName();

        formPage.setSenderName();
        formPage.setSenderEmail();
        formPage.setSenderPhone();
        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        summaryPage.clickZaplac();
        paymentPage.clickPaymentForm();
        paymentPage.clickPaymentButton();
        paymentPage.clickPaymentSuccess();

        formPage.closeCookies();
        endSummaryPage.clickOdswiez();
        Assert.assertEquals("Twoja płatność została potwierdzona", endSummaryPage.getPotwierdzeniePlatnosci());
    }
}
