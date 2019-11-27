package ru.wrike;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageLogic {
    private WebDriver driver;
    private MainPage page;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
        page = new MainPage(driver);
    }

    public String checkMainTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void pushGreenButton() {
        page.getGreenButton().submit();
    }

    public void fillEmailField(String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "';", page.getEmailField());
    }

    public void pushBlueSubmitButton() {
        page.getBlueSubmitButton().submit();
    }
    public void closeSession() {
        driver.quit();
    }
}
