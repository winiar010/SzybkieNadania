package Invoice.InvoiceCompany.invoiceCompanyBuildingNo;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class invoiceCompanyrBuildingNoTooLong extends Base {
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
        formPageValidation.inputInvoiceCompanyBuildingNoTooLongSyntax();
        formPageValidation.clickZgoda();
        Assert.assertEquals("TA WARTOŚĆ JEST ZBYT DŁUGA. POWINNA MIEĆ 10 ZNAKÓW LUB MNIEJ", formPageValidation.getError());
    }
}
