package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SummarySection {

    @FindBy(css = ".sticky-element .to-pay-amount")
    private WebElement doZaplaty;

    ActionPage actionPage = new ActionPage();

    public SummarySection() {
        PageFactory.initElements(Base.driver, this);
    }

    public String getDoZaplaty() {
        actionPage.moveToElement(doZaplaty);
        return doZaplaty.getAttribute("innerText");
    }



}
