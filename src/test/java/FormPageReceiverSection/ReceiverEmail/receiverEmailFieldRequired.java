package FormPageReceiverSection.ReceiverEmail;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class receiverEmailFieldRequired extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnFieldRequired() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPageValidation.clickReceiverEmail();
        formPageValidation.clickReceiverName();
        Assert.assertEquals("POLE WYMAGANE", formPageValidation.getReceiverEmailError());
    }
}
