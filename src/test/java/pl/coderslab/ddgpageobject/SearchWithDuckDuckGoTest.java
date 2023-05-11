package pl.coderslab.ddgpageobject;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SearchWithDuckDuckGoTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://duckduckgo.com/");
//        System.setProperty("webdrive.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://duckduckgo.com/");
//        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage")); // .var
//        searchInput.sendKeys("W pustyni i w puszczy");
//        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
//        searchButton.click();
//        driver.findElements(By.cssSelector("div#links article a"));
//       // driver.quit();
    }

    @Test
    public void navigateToDdg() throws InterruptedException {
        SearchWithDdgMainPage ddgMainPage = new SearchWithDdgMainPage(driver);
        ddgMainPage.fillSearch("W pustyni i w puszczy");
        ddgMainPage.clicksearchButton();


        List<String> searchResults = ddgMainPage.getFirstThreeSearchResults();
        for (String searchResult : searchResults){
            System.out.println(searchResult);
        }
    }
}