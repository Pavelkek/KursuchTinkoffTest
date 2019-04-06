package logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class MyEventListener implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("beforeAlertAccept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("afterAlertAccept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("afterAlertDismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("beforeAlertDismiss");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Перехожу");
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Перешел");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Назад");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("Сзади");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Вперед");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("Впереди");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Сейчас обновлю");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("Обновил");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Ищу");
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Нашел");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("beforeClickOn");
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Кликнули в " + webElement.toString());
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("beforeChangeValueOf");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("afterChangeValueOf");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("beforeScript");
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("afterScript");
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("beforeSwitchToWindow");
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("afterSwitchToWindow");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("exception");
    }
}
