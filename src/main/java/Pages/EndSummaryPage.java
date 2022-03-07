package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class EndSummaryPage {

    @FindBy(css = ".btn > span")
    private WebElement odswiez;

    @FindBy(xpath = "//*[@id=\"publicPage\"]/div[2]/app-summary/section[1]/div[1]/div/lib-mat-with-text/div/div[2]/span")
//    @FindBy(tagName = "Twoja płatność została potwierdzona")
    private WebElement potwierdzeniePlatnosci;

    @FindBy(css = ".wrapper > .mat-wrapper > div ")
    private WebElement problemPlatnosc;


    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    public EndSummaryPage() {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickOdswiez() throws InterruptedException {
        TimeUnit.SECONDS.sleep(9);
//        odswiez.click();
    }

    public String getPotwierdzeniePlatnosci() {
        return potwierdzeniePlatnosci.getText();
    }

    public String getProblemPlatnosc() {
        return problemPlatnosc.getAttribute("class");
    }
}
