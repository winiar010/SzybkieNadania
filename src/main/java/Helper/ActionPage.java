package Helper;

import Pages.Base;
import Pages.FormPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionPage {

    private Actions actions = new Actions(Base.driver);
    public static WebDriver driver;

    public void moveToElement(WebElement webElement) {
        actions.moveToElement(webElement).build().perform();
    }

}
