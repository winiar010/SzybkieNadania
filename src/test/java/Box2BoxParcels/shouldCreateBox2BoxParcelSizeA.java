package Box2BoxParcels;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class shouldCreateBox2BoxParcelSizeA extends Base {

    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCreateBox2BoxParcelSizeA() throws InterruptedException {
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
        Assert.assertEquals("WYBIERZ SPOSÓB PŁATNOŚCI", paymentPage.getPaymentType());

    }
}
