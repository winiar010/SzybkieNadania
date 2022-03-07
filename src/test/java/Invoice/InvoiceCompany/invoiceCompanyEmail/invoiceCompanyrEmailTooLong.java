package Invoice.InvoiceCompany.invoiceCompanyEmail;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceCompanyrEmailTooLong extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnTooLongSyntax() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.clickZaznaczFakture();
        formPage.clickFirmaWPolsce();
        formPageValidation.inputInvoiceCompanyEmailTooLongSyntax();
        formPageValidation.clickZgoda();
        Assert.assertEquals("TA WARTOŚĆ JEST ZBYT DŁUGA. POWINNA MIEĆ 256 ZNAKÓW LUB MNIEJ\n" +
                "NIEPRAWIDŁOWY ADRES EMAIL", formPageValidation.getError());
    }
}
