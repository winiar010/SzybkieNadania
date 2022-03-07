package FormPageFunctions;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class shouldReturnAdditionalInformationTooLongSyntax extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnAdditionalInformationTooLongSyntax() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeAddress();
        formPage.clickA();
        formPageValidation.inputAdditionalInformationTooLongSyntax();
        formPageValidation.clickSenderName();
        Assert.assertEquals("TA WARTOŚĆ JEST ZBYT DŁUGA. POWINNA MIEĆ 36 ZNAKÓW LUB MNIEJ",formPageValidation.getAdditionalInformationError());
    }
}