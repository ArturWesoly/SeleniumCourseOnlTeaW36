package exam.zadanie2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Shoping {
@Test
    public void shopingMyStory() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl");

        WebElement searchButton = driver.findElement(By.cssSelector("span.hidden-sm-down"));
        searchButton.click();
        WebElement searchInputEmail = driver.findElement(By.id("field-email"));
        searchInputEmail.sendKeys("arturwesoly@onet.eu");

        WebElement searchInputPassword = driver.findElement(By.id("field-password"));
        searchInputPassword.sendKeys("CoderslabA9876!");

        WebElement searchButtonSignIn = driver.findElement(By.id("submit-login"));
        searchButtonSignIn.click();


        WebElement searchInputSearch = driver.findElement(By.name("s"));
        searchInputSearch.sendKeys("Hummingbird Printed Sweater");
        WebElement textbox = driver.findElement(By.name("s"));
        textbox.sendKeys(Keys.ENTER);

        WebElement searchButtonProduct = driver.findElement(By.cssSelector("div.thumbnail-top"));
        searchButtonProduct.click();

        WebElement searchButtonSize = driver.findElement(By.cssSelector("#group_1 > option:nth-child(2)"));
        searchButtonSize.click();

        WebElement searchInputQuantity = driver.findElement(By.cssSelector("#quantity_wanted"));
        searchInputQuantity.clear();

        WebElement searchInputQuantityTwo = driver.findElement(By.id("#quantity_wanted"));
        searchInputQuantityTwo.sendKeys("5");


//        WebElement searchButtonProductUp = driver.findElement(By.cssSelector("i.touchspin-up"));
//        searchButtonProductUp.click();
//        searchButtonProductUp.click();
//        searchButtonProductUp.click();
//        searchButtonProductUp.click();

        WebElement searchButtonAddToCart = driver.findElement(By.cssSelector("button.add-to-cart"));
        searchButtonAddToCart.click();

        WebElement searchButtonCart = driver.findElement(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"));
        searchButtonCart.click();


//        WebElement searchButtonSize = driver.findElement(By.xpath("div/form/div/div/span/select[@title='M']"));
//        searchButtonSize.click();

    }
}
