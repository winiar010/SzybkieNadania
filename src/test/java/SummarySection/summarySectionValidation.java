package SummarySection;

import Helper.ActionPage;
import Pages.Base;
import Pages.FormPage;
import Pages.FormPageValidation;
import Pages.SummarySection;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class summarySectionValidation extends Base {
    private static FormPage formPage = new FormPage();
    private static SummarySection summarySection = new SummarySection();
    private static ActionPage actionPage = new ActionPage();

    @Test
    public void shouldReturnCostOfBox2BoxParcelSizeA() throws InterruptedException {
        formPage.deliveryTypeBoxmachine();
        formPage.clickA();
        Assert.assertEquals("12,99 zł", summarySection.getDoZaplaty());
    }

    @Test
    public void shouldReturnCostOfBox2BoxParcelSizeB() {
        formPage.deliveryTypeBoxmachine();
        formPage.clickB();
        Assert.assertEquals("13,99 zł", summarySection.getDoZaplaty());
    }

    @Test
    public void shouldReturnCostOfBox2BoxParcelSizeC() {
        formPage.deliveryTypeBoxmachine();
        formPage.clickC();
        Assert.assertEquals("15,49 zł", summarySection.getDoZaplaty());
    }

    @Test
    public void shouldReturnCostOfBox2AddressParcelSizeA() throws InterruptedException {
        formPage.closeCookies();
        formPage.cookieButton();
        formPage.deliveryTypeAddress();
        formPage.clickA();
        Assert.assertEquals("14,99 zł", summarySection.getDoZaplaty());
    }

    @Test
    public void shouldReturnCostOfBox2AddressParcelSizeB() {
        formPage.deliveryTypeAddress();
        formPage.clickB();
        Assert.assertEquals("16,49 zł", summarySection.getDoZaplaty());
    }

    @Test
    public void shouldReturnCostOfBox2AddressParcelSizeC() {
        formPage.deliveryTypeAddress();
        formPage.clickC();
        Assert.assertEquals("19,99 zł", summarySection.getDoZaplaty());
    }
}
