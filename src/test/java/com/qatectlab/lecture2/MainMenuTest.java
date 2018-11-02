package com.qatectlab.lecture2;

import com.qatectlab.lecture2.drivers.ChromeWebDriverSettings;
import com.qatectlab.lecture2.utils.Properties;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainMenuTest extends ChromeWebDriverSettings {

    //Script B.
    //Checking the main menu of the admin panel.
    @Test
    public void mainMenuCheck() {
        System.out.println("Запущен скрипт Б - Проверка работоспособности главного меню Админ панели.");

        //login to admin panel
        driver.get(Properties.getDefaultBaseAdminUrl());
        driver.findElement(By.id("email")).sendKeys(Properties.getAdminEmail());
        driver.findElement(By.id("passwd")).sendKeys(Properties.getAdminPassword());
        driver.findElement(By.name("submitLogin")).click();

        //main menu checking
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-sidebar")));
        menuItemCheckById("tab-AdminDashboard", "Dashboard • prestashop-automation");
        menuItemCheckById("subtab-AdminParentOrders", "Заказы • prestashop-automation");
        menuItemCheckById("subtab-AdminCatalog", "товары • prestashop-automation");
        menuItemCheckById("subtab-AdminParentCustomer", "Управление клиентами • prestashop-automation");
        menuItemCheckById("subtab-AdminParentCustomerThreads", "Customer Service • prestashop-automation");
        menuItemCheckById("subtab-AdminStats", "Статистика • prestashop-automation");
        menuItemCheckById("subtab-AdminParentModulesSf", "prestashop-automation");
        menuItemCheckById("subtab-AdminParentThemes", "Шаблоны • prestashop-automation");
        menuItemCheckById("subtab-AdminParentShipping", "Курьеры • prestashop-automation");
        menuItemCheckById("subtab-AdminParentPayment", "Payment Methods • prestashop-automation");
        menuItemCheckById("subtab-AdminInternational", "Локализация • prestashop-automation");
        menuItemCheckById("subtab-ShopParameters", "General • prestashop-automation");
        menuItemCheckById("subtab-AdminAdvancedParameters", "Information • prestashop-automation");

        System.out.println("Проверка пунктов главного меню успешно завершена.");
    }

    //Menu item checking
    public void menuItemCheckById(String itemId, String itemTitleMetaTag) {
        driver.findElement(By.id(itemId)).click();
        String pageTitle = driver.findElement(By.cssSelector("h2")).getText();
        System.out.println("Открыт раздел с заголовком - " + pageTitle);
        String title = driver.getTitle();
        Assert.assertTrue(title.equals(itemTitleMetaTag));
        driver.navigate().refresh();
        title = driver.getTitle();
        Assert.assertTrue(title.equals(itemTitleMetaTag));
        String pageTitleAfterReload = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertTrue(pageTitle.equals(pageTitleAfterReload));
        driver.get(Properties.getDefaultBaseAdminDashboardUrl());
    }
}
