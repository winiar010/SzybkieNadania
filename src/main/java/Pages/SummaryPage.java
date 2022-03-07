package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SummaryPage {

    @FindBy(css = ".d-flex.justify-content-between.buttons > .d-block > .btn.btn-text")
    private WebElement poprawDane;

    @FindBy(css = ".d-block > .btn-primary")
    private WebElement zaplac;

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    public SummaryPage() {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickPoprawDane() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        poprawDane.click();
    }

    public void clickZaplac() {
        zaplac.click();
    }





}
