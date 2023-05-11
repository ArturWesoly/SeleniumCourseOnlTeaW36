package pl.coderslab.seleniumcourseonlteaw36;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchWithDuckDuckGo {
    @Test
    public void searchWithDuckDuckGo() {
        System.setProperty("webdrive.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage")); // .var
        searchInput.sendKeys("W pustyni i w puszczy");
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
        driver.findElements(By.cssSelector("div#links article a"));
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div#links article h2 a span"));
        for(int i = 0; i < 3; i++) {
            WebElement oneSearchResult = searchResults.get(i);
            String text = oneSearchResult.getText();
            System.out.println(text);
        }
       // driver.quit();
    }
}