package ru.wrike;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wrike.logic.MainPageLogic;
import ru.wrike.logic.QAPageLogic;
import ru.wrike.pages.MainPage;


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
    public void putTheButtonAndMoveToAnotherPage () {
        MainPageLogic.pushGreenButton(driver);
        MainPageLogic.fillEmailField("asdasdwpt@wriketask.qaa", driver);
        MainPageLogic.pushBlueSubmitButton(driver);
    }

    @Test
    public void putTheButtonAndFillIncorrectEmail () {
        MainPageLogic.pushGreenButton(driver);
        MainPageLogic.fillEmailField("lhasflkh", driver);
        MainPageLogic.pushBlueSubmitButton(driver);
    }

    @Test
    public void doAllAndMoveToTwitter () {
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
