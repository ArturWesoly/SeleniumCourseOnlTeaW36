package exam.zadanie1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.PendingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class myStoryNewAddress {
    public String logInAccount;
    private WebDriver driver;

    public myStoryNewAddress() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @Given("Page https:\\/\\/mystore-testlab.coderslab.pl opened in browser")
    public void myStore() {
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

    @And("Click add new address")
    public void clickAddNewAddress() {
        WebElement searchButton = driver.findElement(By.cssSelector("#addresses-link > span > i"));
        searchButton.click();

    }

    @And("Click create new address")
    public void clickCreateNewAddress() {

        WebElement searchButton = driver.findElement(By.cssSelector("#content > div.addresses-footer > a"));
        searchButton.click();
    }

    @And("Fill {string} in form")
    public void fillAliasInForm(String alias) {
        WebElement inputAlias = driver.findElement(By.name("alias"));
        inputAlias.clear();
        inputAlias.sendKeys(alias);
    }

    @And("Fill in form {string}")
    public void fillAddressInForm(String address) {
        WebElement inputAddress = driver.findElement(By.cssSelector("#field-address1"));
        inputAddress.clear();
        inputAddress.sendKeys(address);
    }

    @And("Add {string} in form")
    public void addInForm(String city){

        WebElement inputCity = driver.findElement(By.cssSelector("#field-city"));
        inputCity.clear();
        inputCity.sendKeys(city);
    }

    @And("Add in form {string}")
    public void addInFormZip(String zippostalcode) {
        WebElement inputZip = driver.findElement(By.cssSelector("#field-postcode"));
        inputZip.clear();
        inputZip.sendKeys(zippostalcode);
    }

    @And("Fill form {string}")
    public void fillForm(String country) {
        WebElement inputCountry = driver.findElement(By.cssSelector("#field-id_country > option:nth-child(2)"));
        inputCountry.click();

    }

    @And("Add {string}")
    public void add(String phone) {

        WebElement inputPhone = driver.findElement(By.cssSelector("#field-phone"));
        inputPhone.clear();
        inputPhone.sendKeys(phone);
    }
}



