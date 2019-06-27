package com.wix.interview.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void before() {
        String pathToDriver;

        if(System.getProperty("os.name").contains("Windows")) {
            pathToDriver = "chromedriver.exe";
        } else {
            pathToDriver = "chromedriver";
        }

        System.setProperty("webdriver.chrome.driver", pathToDriver);

        driver = new ChromeDriver();
    }

    @After
    public void after() {
        driver.quit();
    }

}
