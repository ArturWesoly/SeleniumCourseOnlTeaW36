package pl.coderslab.pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pl.coderslab.seleniumcourseonlteaw36.Tools.assertVisibleAndEnabled;

public class MyBookingHotelTest {
//    @Test
//    public void searchWithDuckDuckGo() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
//        driver.get("https://hotel-testlab.coderslab.pl/en/");
//        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
//        assertNotNull(hotelLocationInput);
//        hotelLocationInput.sendKeys("Warsaw");
//        WebElement hotelLocationSubmitButton = driver.findElement(By.id("search_room_submit"));
//        assertNotNull(hotelLocationSubmitButton);
//        WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
//        assertNotNull(newsletterInput);
//        newsletterInput.sendKeys("test@test.com");
//    }

    @Test
    public void navigateToAndFillRegistrationForm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInBtn = driver.findElement(By.cssSelector("span.hide_xs"));
        signInBtn.click();
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);


    }
}