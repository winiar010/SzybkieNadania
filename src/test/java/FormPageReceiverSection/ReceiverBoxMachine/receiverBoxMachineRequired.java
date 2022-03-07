package FormPageReceiverSection.ReceiverBoxMachine;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class receiverBoxMachineRequired extends Base {
    private static FormPage formPage = new FormPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnFieldRequired() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        formPageValidation.clickReceiverBoxMachineName();
        formPageValidation.clickReceiverEmail();
//        actionPage.moveToElement(driver.findElement(By.cssSelector(".app-input.form-group > .input-group > div > h3")));
        Assert.assertEquals("POLE WYMAGANE", formPageValidation.getReceiverBoxMachineError());
    }
}
