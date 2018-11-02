package com.qatectlab.lecture2;

import com.qatectlab.lecture2.drivers.ChromeWebDriverSettings;
import com.qatectlab.lecture2.utils.Properties;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginToAdminPanelTest extends ChromeWebDriverSettings {
    //Script A.
    //Login to the admin panel check.
    @Test
    public void loginToAdminPanelCheck() {
        System.out.println("Запущен скрипт А - Логин в Админ панель.");

        driver.get(Properties.getDefaultBaseAdminUrl());
        driver.findElement(By.id("email")).sendKeys(Properties.getAdminEmail());
        driver.findElement(By.id("passwd")).sendKeys(Properties.getAdminPassword());
        driver.findElement(By.name("submitLogin")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("employee_infos")));
        driver.findElement(By.id("employee_infos")).click();
        driver.findElement(By.id("header_logout")).click();

        System.out.println("Проверка входа в админ панель успешно завершена.");
    }
}
