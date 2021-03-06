// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;


public class ActitimetryfreeTest {
    private WebDriver driver;

    private Map<String, Object> vars;

    JavascriptExecutor js;

    @Before
    public void setUp() {
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor)this.driver;
        this.vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void actitimetryfree() {
        this.driver.get("https://www.actitime.com/");
        this.driver.manage()
                   .window()
                   .setSize(new Dimension(1258, 711));
        this.driver.findElement(By.id("cookie-button--got-it"))
                   .click();
        this.driver.findElement(By.linkText("Try Free"))
                   .click();
        this.driver.findElement(By.id("first-name"))
                   .click();
        this.driver.findElement(By.id("first-name"))
                   .sendKeys("test");
        this.driver.findElement(By.id("last-name"))
                   .sendKeys("test");
        this.driver.findElement(By.id("email"))
                   .sendKeys("test");
        this.driver.findElement(By.id("company"))
                   .sendKeys("test");
    }
}
