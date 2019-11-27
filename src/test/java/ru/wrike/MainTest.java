package ru.wrike;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {
    MainPageLogic logic;
    QAPageLogic qaLogic;
    WebDriver driver;

    @Before
    public void before() {
        System.getProperty("webdriver.chrome.driver", "TestTaskProject/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.wrike.com");
    }

    @Test
    public void openFirstPageThanTitleSame () {
        logic = new MainPageLogic(driver);
        Assert.assertEquals("Your online project management software - Wrike", logic.checkMainTitle());
    }

    @Test
    public void putTheButtonAndMoveToAnotherPage () throws InterruptedException {
        logic = new MainPageLogic(driver);
        logic.pushGreenButton();
        logic.fillEmailField("asdasdwpt@wriketask.qaa");
        logic.pushBlueSubmitButton();
        Thread.sleep(2000);
        Assert.assertEquals("https://www.wrike.com/resend/", logic.getUrl());
    }

    @Test
    public void putTheButtonAndFillIncorrectEmail () {
        logic = new MainPageLogic(driver);
        logic.pushGreenButton();
        logic.fillEmailField("lhasflkh");
        logic.pushBlueSubmitButton();
        Assert.assertEquals("https://www.wrike.com/", logic.getUrl());
    }



    @Test
    public void doAllAndMoveToTwitter () throws InterruptedException {
        qaLogic = new QAPageLogic(driver);
        qaLogic.goToQAPage();
        qaLogic.chooseInterest("interested");
        qaLogic.chooseTeamMembers("1-6");
        qaLogic.chooseFollow("yes");
        qaLogic.pushSubmitButton();
        qaLogic.goToTwitter();
        Thread.sleep(2000);
        qaLogic.goToTwitterPage();
        Assert.assertEquals("https://twitter.com/wrike", qaLogic.getUrl());
    }

    @Test
    public void moveToTwitterWithoutForm () throws InterruptedException {
        qaLogic = new QAPageLogic(driver);
        qaLogic.goToQAPage();
        qaLogic.goToTwitter();
        Thread.sleep(2000);
        qaLogic.goToTwitterPage();
        Assert.assertEquals("https://twitter.com/wrike", qaLogic.getUrl());
    }

    @After
    public void after() {
        driver.quit();
    }
}
