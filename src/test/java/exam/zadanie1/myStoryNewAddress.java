package exam.zadanie1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class myStoryNewAddress {
    public String logInAccount;
    private WebDriver driver;

    @Given("Page https:\\/\\/mystore-testlab.coderslab.pl opened in browser")
    public void myStoreNewAddress() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("Login account")
    public void loginAccount() {

        WebElement searchButton = driver.findElement(By.cssSelector("#_desktop_user_info > div > a"));
        searchButton.click();

//        WebElement searchButton = driver.findElement(By.cssSelector("span.hidden-sm-down"));
//        searchButton.click();

        WebElement searchInputEmail = driver.findElement(By.id("field-email"));
        searchInputEmail.sendKeys("arturwesoly@onet.eu");

        WebElement searchInputPassword = driver.findElement(By.id("field-password"));
        searchInputPassword.sendKeys("CoderslabA9876!");

        WebElement searchButtonSignIn = driver.findElement(By.id("submit-login"));
        searchButtonSignIn.click();

    }

}


