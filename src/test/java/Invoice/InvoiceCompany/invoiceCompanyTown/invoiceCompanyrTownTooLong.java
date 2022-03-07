package Invoice.InvoiceCompany.invoiceCompanyTown;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class invoiceCompanyrTownTooLong extends Base {
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
        formPageValidation.inputInvoiceCompanyZipCode();
        formPageValidation.inputInvoiceCompanyTownTooLongSyntax();
        formPageValidation.clickZgoda();
        Assert.assertEquals("TA WARTOŚĆ JEST ZBYT DŁUGA. POWINNA MIEĆ 50 ZNAKÓW LUB MNIEJ", formPageValidation.getError());
    }
}
