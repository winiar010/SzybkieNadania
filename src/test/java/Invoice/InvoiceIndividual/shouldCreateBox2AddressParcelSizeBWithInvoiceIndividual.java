package Invoice.InvoiceIndividual;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class shouldCreateBox2AddressParcelSizeBWithInvoiceIndividual extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCreateBox2AddressParcelSizeBWithInvoiceIndividual() throws InterruptedException {
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
        formPage.setInvoiceIndividualNameSurname();
        formPage.setInvoiceIndividualEmail();
        formPage.setInvoiceIndividualZipCode();
        formPage.setInvoiceIndividualTown();
        formPage.setInvoiceIndividualStreet();
        formPage.setInvoiceIndividualBuildingNo();
        formPage.setInvoiceIndividualFlatNo();

        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        Assert.assertEquals("WYBIERZ SPOSÓB PŁATNOŚCI", paymentPage.getPaymentType());
    }
}
