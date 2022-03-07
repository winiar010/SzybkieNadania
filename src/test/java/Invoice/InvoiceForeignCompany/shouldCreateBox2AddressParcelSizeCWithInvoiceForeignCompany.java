package Invoice.InvoiceForeignCompany;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class shouldCreateBox2AddressParcelSizeCWithInvoiceForeignCompany extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCreateBox2AddressParcelSizeCWithInvoiceForeignCompany () throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();

        formPage.deliveryTypeAddress();
        formPage.clickC();
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
        formPage.firmaZaGranica();
        formPage.setInvoiceForeignCompanyName();
        formPage.setInvoiceForeignTaxIdPrefix();
        formPage.setInvoiceForeignCompanyTaxId();
        formPage.setInvoiceForeignCompanyName();
        formPage.setInvoiceForeignSelectCountry();
        formPage.setInvoiceForeignZipCode();
        formPage.setInvoiceForeignTown();
        formPage.setInvoiceForeignStreet();
        formPage.setInvoiceForeignBuildingNo();
        formPage.setInvoiceForeignFlatNo();
        formPage.setInvoiceForeignEmail();

        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        summaryPage.clickZaplac();
        Assert.assertEquals("WYBIERZ SPOSÓB PŁATNOŚCI", paymentPage.getPaymentType());
    }
}
