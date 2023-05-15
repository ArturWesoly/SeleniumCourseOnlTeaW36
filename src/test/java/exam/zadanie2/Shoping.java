package exam.zadanie2;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

public class Shoping {

    @Test
    public void shopingMyStory() throws IOException {
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

        WebElement searchInputQuantity = driver.findElement(By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.qty > div > span.input-group-btn-vertical > button.btn.btn-touchspin.js-touchspin.bootstrap-touchspin-up > i"));
        searchInputQuantity.click();
        searchInputQuantity.click();
        searchInputQuantity.click();
        searchInputQuantity.click();
        searchInputQuantity.click();
        searchInputQuantity.click();


//        WebElement searchInputQuantity = driver.findElement(By.cssSelector("#quantity_wanted"));
//        searchInputQuantity.clear();
//
//        WebElement searchInputQuantityTwo = driver.findElement(By.id("#quantity_wanted"));
//        searchInputQuantityTwo.sendKeys("5");


//        WebElement searchButtonProductUp = driver.findElement(By.cssSelector("i.touchspin-up"));
//        searchButtonProductUp.click();
//        searchButtonProductUp.click();
//        searchButtonProductUp.click();
//        searchButtonProductUp.click();

        WebElement searchButtonAddToCart = driver.findElement(By.cssSelector("button.add-to-cart"));
        searchButtonAddToCart.click();

        WebElement searchButtonCart = driver.findElement(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"));
        searchButtonCart.click();

        WebElement buttonCheckout = driver.findElement(By.cssSelector("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.js-cart-detailed-actions.card-block > div > a"));
        buttonCheckout.click();

        WebElement buttonContinue = driver.findElement(By.cssSelector("#checkout-addresses-step > div > div > form > div.clearfix > button"));
        buttonContinue.click();

        WebElement buttonContinueTwo = driver.findElement(By.cssSelector("#js-delivery > button"));
        buttonContinueTwo.click();

        WebElement payByCheck = driver.findElement(By.cssSelector("#payment-option-1"));
        payByCheck.click();

        WebElement check = driver.findElement(By.cssSelector("#conditions_to_approve\\[terms-and-conditions\\]"));
        check.click();

        WebElement placeOrder = driver.findElement(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button"));
        placeOrder.click();

//            File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
//            Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "User", "Artur",  "test-evidence", "Prestashop-"+currentDateTime+".png"));
//        }

        TakesScreenshot scrshot=(TakesScreenshot) driver;
        File src=scrshot.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:");
        FileHandler.copy(src, dest);
        driver.quit();



//        WebElement searchButtonSize = driver.findElement(By.xpath("div/form/div/div/span/select[@title='M']"));
//        searchButtonSize.click();
    }
}