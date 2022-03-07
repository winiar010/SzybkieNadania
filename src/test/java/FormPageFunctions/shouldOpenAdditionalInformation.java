package FormPageFunctions;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;

public class shouldOpenAdditionalInformation extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldOpenAdditionalInformation() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeAddress();
        formPage.clickA();
        formPageValidation.clickAdditionalInformation();
//        Assert.assertEquals();
    }
}