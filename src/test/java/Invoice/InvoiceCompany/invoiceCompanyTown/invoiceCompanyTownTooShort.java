package Invoice.InvoiceCompany.invoiceCompanyTown;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceCompanyTownTooShort extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnTooShortSyntax() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.clickZaznaczFakture();
        formPage.clickFirmaWPolsce();
        formPageValidation.inputInvoiceCompanyZipCode();
        formPageValidation.inputInvoiceCompanyTownTooShort();
        formPageValidation.clickZgoda();
        Assert.assertEquals("WARTOŚĆ JEST ZA KRÓTKA. POWINNA MIEĆ 3 ZNAKI LUB WIĘCEJ", formPageValidation.getError());
    }
}
