package FormPageFunctions;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class shouldValidateRegulationsCheckbox extends Base {

    private static FormPage formPage = new FormPage();
    private static ActionPage actionPage = new ActionPage();
    
    @Test
    public void shouldValidateRegulationsCheckbox() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        formPage.closeCookies();
        formPage.cookieButton();

        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPage.setReceiverName();
        formPage.setAddresseeEmail();
        formPage.setReceiverPhoneNumber();
        formPage.setBoxMachineName();

        formPage.setSenderName();
        formPage.setSenderEmail();
        formPage.setSenderPhone();
        formPage.clickSubmit();
        Assert.assertEquals("POLE WYMAGANE", formPage.checkRegulationsValidation());
    }
}
