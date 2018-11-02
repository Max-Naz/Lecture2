package com.qatectlab.lecture2.drivers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeWebDriverSettings {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void beforeStart() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
    }

    @After
    public void onClose() {
        driver.quit();
    }
}
