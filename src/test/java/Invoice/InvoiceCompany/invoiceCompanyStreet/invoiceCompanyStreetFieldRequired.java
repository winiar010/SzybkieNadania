package Invoice.InvoiceCompany.invoiceCompanyStreet;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceCompanyStreetFieldRequired extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnFieldRequired() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.clickZaznaczFakture();
        formPage.clickFirmaWPolsce();
        formPageValidation.inputInvoiceCompanyZipCode();
        formPageValidation.inputInvoiceCompanyTown();
        formPageValidation.clickInvoiceCompanyStreet();
        formPageValidation.clickZgoda();
        Assert.assertEquals("POLE WYMAGANE", formPageValidation.getError());
    }
}
