package Box2AddressParcels;

import Helper.ActionPage;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class shouldCreateBox2AddressParcelSizeAAdditionalInformation extends Base {
    private static FormPage formPage = new FormPage();
    private static SummaryPage summaryPage = new SummaryPage();
    private static PaymentPage paymentPage = new PaymentPage();
    private static FormPageValidation formPageValidation = new FormPageValidation();
    private static EndSummaryPage endSummaryPage = new EndSummaryPage();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldCreateBox2AddressParcelSizeAAdditionalInformation() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();

        formPage.deliveryTypeAddress();
        formPage.clickA();
        formPage.setReceiverName();
        formPage.setAddresseeEmail();
        formPage.setReceiverPhoneNumber();
        formPage.setReceiverZipCode();
        formPage.setReceiverTown();
        formPage.setReceiverStreet();
        formPage.setReceiverBuildingNo();
        formPage.setReceiverFlatNo();

        formPageValidation.clickAdditionalInformation();
        formPageValidation.inputAdditionalInformation();

        formPage.setSenderName();
        formPage.setSenderEmail();
        formPage.setSenderPhone();

        formPage.clickZgodaRegulamin();
        formPage.clickZgodaMarketing();
        formPage.clickSubmit();
        formPageValidation.getAdditionalInformation();
        Assert.assertEquals("To jest testowe zamówienie", formPageValidation.getAdditionalInformation());

    }

}
