package FormPageFunctions;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import org.junit.Assert;
import org.junit.Test;

public class shouldOpenPopupHowToPackParcel extends Base {

    private static FormPage formPage = new FormPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldOpenPopupHowToPackParcel() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.clickHowToPackParcel();
        Assert.assertEquals("Jak spakować paczkę?", formPage.getPackInstructions());
    }
}