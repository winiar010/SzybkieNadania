package FormPageFunctions;

import Helper.ActionPage;
import Pages.*;
import org.junit.Test;

public class shouldCorrectData extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCorrectData() throws InterruptedException {
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
        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        summaryPage.clickPoprawDane();

    }
}