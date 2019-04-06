package testSite;

import logger.MyEventListener;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseBuyTickets {
    EventFiringWebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DNS\\IdeaProjects\\ChromeDriver\\chromedriver.exe");

        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new MyEventListener());
        driver.get("http://newtours.demoaut.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
