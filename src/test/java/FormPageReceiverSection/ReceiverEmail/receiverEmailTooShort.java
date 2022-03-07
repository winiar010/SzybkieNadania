package FormPageReceiverSection.ReceiverEmail;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class receiverEmailTooShort extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnTooShortSyntax() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPageValidation.inputReceiverEmailTooShort();
        formPageValidation.clickReceiverName();
        Assert.assertEquals("WARTOŚĆ JEST ZA KRÓTKA. POWINNA MIEĆ 4 ZNAKI LUB WIĘCEJ\n" +
                "NIEPRAWIDŁOWY ADRES EMAIL", formPageValidation.getReceiverEmailError());
    }
}
