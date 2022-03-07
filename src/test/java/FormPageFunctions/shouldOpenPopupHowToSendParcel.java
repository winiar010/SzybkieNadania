package FormPageFunctions;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import org.junit.Assert;
import org.junit.Test;

public class shouldOpenPopupHowToSendParcel extends Base {
    private static FormPage formPage = new FormPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldOpenPopupHowToSendParcel() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.clickHowToSendParcel();
        Assert.assertEquals("Gotowe!", formPage.getLabelReady());
    }
}
