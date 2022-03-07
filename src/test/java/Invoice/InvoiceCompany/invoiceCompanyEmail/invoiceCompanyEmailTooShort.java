package Invoice.InvoiceCompany.invoiceCompanyEmail;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceCompanyEmailTooShort extends Base {
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
        formPageValidation.inputInvoiceCompanyEmailTooShort();
        formPageValidation.clickZgoda();
        Assert.assertEquals("WARTOŚĆ JEST ZA KRÓTKA. POWINNA MIEĆ 4 ZNAKI LUB WIĘCEJ\n" +
                "NIEPRAWIDŁOWY ADRES EMAIL", formPageValidation.getError());
    }
}
