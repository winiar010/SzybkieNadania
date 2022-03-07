package Box2AddressParcels;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class shouldCreateBox2AddressParcelSizeA extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();

    @Test
    public void shouldCreateBox2AddressParcelSizeA() throws InterruptedException {
//        formPage.closeCookies();
        formPage.cookieButton();

        formPage.deliveryTypeAddress();
        formPage.clickA();
        formPage.setReceiverName();
        formPage.setAddresseeEmail();
        formPage.setReceiverPhoneNumber();
        formPage.setReceiverZipCode();
        formPage.setReceiverTown();
        formPage.setReceiverStreet();
        formPage.setReceiverBuildingNo();
        formPage.setReceiverFlatNo();

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
