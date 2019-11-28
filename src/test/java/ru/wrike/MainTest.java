package ru.wrike;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wrike.logic.MainPageLogic;
import ru.wrike.logic.QAPageLogic;



public class MainTest {
    WebDriver driver;

    @Before
    public void before() {
        System.getProperty("webdriver.chrome.driver", "TestTaskProject/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.wrike.com");
    }

    @After
    public void after() {
        driver.quit();
    }

    @Test
    public void goToTwitterAfterRegistration () {
        MainPageLogic.pushGreenButton(driver);
        MainPageLogic.fillEmailField("asdasdwpt@wriketask.qaa", driver);
        MainPageLogic.pushBlueSubmitButton(driver);
        QAPageLogic.chooseInterest("interested", driver);
        QAPageLogic.chooseTeamMembers("1-6", driver);
        QAPageLogic.chooseFollow("yes", driver);
        QAPageLogic.pushSubmitButton(driver);
        QAPageLogic.goToTwitter(driver);
        QAPageLogic.goToTwitterPage(driver);
    }

}
