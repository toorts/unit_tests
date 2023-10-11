package seminars.five;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    public void testOpenSite() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Selenium");
        webElement.submit();

        List<WebElement> result = webDriver.findElements(By.cssSelector("div"));

        boolean found = false;
        for (WebElement element : result) {
            if (element.getText().contains("selenium.dev")) {
                found = true;
                break;
            }
        }

        assertTrue(found);
        webDriver.quit();

    }

    @Test
    public void test2() {

        // Создание экземпляра WebDriver
        WebDriver driver = new ChromeDriver();

        // Открытие страницы https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");

        // Ввод логина и пароля
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Отправка формы авторизации
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.submit();

        // Проверка успешной авторизации
        WebElement productsLabel = driver.findElement(By.className("title"));
        String label = productsLabel.getText();
        if (label.equals("Products")) {
            System.out.println("Авторизация прошла успешно. Отображаются товары.");
        } else {
            System.out.println("Ошибка авторизации. Товары не отображаются.");
        }
        // Закрытие браузера
        driver.quit();
    }
}


