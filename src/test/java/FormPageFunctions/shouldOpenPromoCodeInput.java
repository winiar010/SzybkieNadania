package FormPageFunctions;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import org.junit.Test;

public class shouldOpenPromoCodeInput extends Base {
    private static FormPage formPage = new FormPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldOpenPromoCodeInput() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.clickPromoCode();
        formPage.putPromoCodeInput();
    }
}