package FormPageReceiverSection.ReceiverPhone;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class receiverPhoneNonNumeric extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnFieldRequired() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPageValidation.inputReceiverPhoneNonNumeric();
        formPageValidation.clickReceiverEmail();
        Assert.assertEquals("POLE WYMAGANE", formPageValidation.getReceiverPhoneError());
    }
}
