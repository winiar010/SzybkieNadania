package Invoice.InvoiceIndividual;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class shouldCopyDataFromSenderSenderToInvoiceIndividual extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCopyDataFromSenderSenderToInvoiceIndividual() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();

        formPage.deliveryTypeAddress();
        formPage.clickB();
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

        formPage.clickZaznaczFakture();
        formPage.osobaPrywatna();

        formPage.clickCopySenderData();
        formPage.setInvoiceIndividualZipCode();
        formPage.setInvoiceIndividualTown();
        formPage.setInvoiceIndividualStreet();
        formPage.setInvoiceIndividualBuildingNo();
        formPage.setInvoiceIndividualFlatNo();

        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        summaryPage.clickZaplac();
        Assert.assertEquals("WYBIERZ SPOSÓB PŁATNOŚCI", paymentPage.getPaymentType());
    }
}
