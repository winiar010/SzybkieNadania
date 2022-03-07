package Invoice.InvoiceCompany.invoiceCompanyNip;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceNipInvalidSyntax extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void invoiceNipInvalidSyntax() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.clickZaznaczFakture();
        formPage.clickFirmaWPolsce();
        formPageValidation.inputInvoiceCompanyNip();
        formPageValidation.clickZgoda();
        Assert.assertEquals("PODANY NUMER NIP JEST NIEPRAWIDŁOWY", formPageValidation.getError());
    }
}