package Invoice.InvoiceCompany;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class shouldCreateBox2AddressParcelSizeAWithInvoiceCompany extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCreateBox2AddressParcelSizeAWithInvoiceCompany() throws InterruptedException {
        formPage.closeCookies();
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

        formPage.clickZaznaczFakture();
        formPage.clickFirmaWPolsce();
        formPage.setInvoiceCompanyNip();
        formPage.setInvoiceCompanyCompanyName();
        formPage.setInvoiceCompanyZipCode();
        formPage.setInvoiceCompanyTown();
        formPage.setInvoiceCompanyStreet();
        formPage.setInvoiceCompanyBuildingNo();
        formPage.setInvoiceCompanyFlatNo();
        formPage.setInvoiceCompanyEmail();

        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        summaryPage.clickZaplac();
        Assert.assertEquals("WYBIERZ SPOSÓB PŁATNOŚCI", paymentPage.getPaymentType());
    }

}
