package Invoice.InvoiceCompany.invoiceCompanyZipCode;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceCompanyZipCodeInvalidEmail extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnInvalidSyntax() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.clickZaznaczFakture();
        formPage.clickFirmaWPolsce();
        formPageValidation.inputInvoiceCompanyZipCodeInvalidSyntax();
        formPageValidation.clickZgoda();
        Assert.assertEquals("NIEPRAWIDŁOWY KOD POCZTOWY", formPageValidation.getError());
    }
}
