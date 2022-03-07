package FormPageSenderSection.SenderPhone;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class senderPhoneInvalid extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnFieldRequired() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPageValidation.inputSenderPhoneInvalid();
        formPageValidation.clickSenderEmail();
        Assert.assertEquals("NIEPRAWIDŁOWY NUMER TELEFONU", formPageValidation.getSenderPhoneError());
    }
}
