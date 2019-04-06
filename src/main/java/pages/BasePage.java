package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitClickable(final WebElement element) {
        Function waitClickable = (Function<WebDriver, Boolean>) driver -> {
            return element.isEnabled() && element.isDisplayed();
        };
        WebDriverWait wait = new WebDriverWait(driver, 10, 100);
        wait.until(waitClickable);

    }

    public void waitTitle(final WebElement element) {
        Function waitClickable = (Function<WebDriver, Boolean>) driver -> {
            return element.isEnabled();
        };
        WebDriverWait wait = new WebDriverWait(driver, 10, 100);
        wait.until(waitClickable);

    }

    public void clickOnOk(){
        driver.switchTo().alert().accept();
    }
}