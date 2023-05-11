package pl.coderslab.seleniumcourseonlteaw36;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pl.coderslab.seleniumcourseonlteaw36.Tools.assertVisibleAndEnabled;

// ocą lokalizatora By.id:
//
//
//(pole tekstowe) Hotel Location
//(przycisk) Search Now
//(pole tekstowe) Enter your e-mail (pole na dole stron)
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//
//Hotel Location - Warsaw
//Enter your e-mail - test@test.com
//Użyj metody sendKeys np.

public class MyBookingHotel {
    @Test
    public void searchWithDuckDuckGo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        assertNotNull(hotelLocationInput);
        hotelLocationInput.sendKeys("Warsaw");
        WebElement hotelLocationSubmitButton = driver.findElement(By.id("search_room_submit"));
        assertNotNull(hotelLocationSubmitButton);
        WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
        assertNotNull(newsletterInput);
        newsletterInput.sendKeys("test@test.com");
    }

    @Test
    public void navigateToAndFillRegistrationForm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInBtn = driver.findElement(By.cssSelector("ul.navbar-nav li a.user_login"));
        signInBtn.click();
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);

        WebElement submitButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        submitButton.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("#customer_firstname"));
        assertVisibleAndEnabled(firstNameInput);
        firstNameInput.sendKeys("Ala");
        WebElement lastNameInput = driver.findElement(By.cssSelector("#customer_lastname"));
        assertVisibleAndEnabled(lastNameInput);
        lastNameInput.sendKeys("Makota");
        WebElement registrationEmailInput = driver.findElement(By.cssSelector("#email"));
        assertVisibleAndEnabled(registrationEmailInput);
        WebElement passwordInput = driver.findElement(By.cssSelector("#passwd"));
        assertVisibleAndEnabled(passwordInput);
        passwordInput.sendKeys("admin123");

        WebElement registrationSubmitButton = driver.findElement(By.cssSelector("#submitAccount"));
        assertVisibleAndEnabled(registrationSubmitButton);
        registrationSubmitButton.click();
        // todo assert account created
    }
}