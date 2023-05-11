package pl.coderslab.ddgpageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.coderslab.seleniumcourseonlteaw36.SearchWithDuckDuckGo;

import java.util.ArrayList;
import java.util.List;

public class SearchWithDdgMainPage {
    private final WebDriver driver;

    public SearchWithDdgMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillSearch(String searchPhrase) {
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys(searchPhrase);
    }

    public void clicksearchButton() {
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
    }

    public List<String> getFirstThreeSearchResults() {
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div#links article h2 a span"));

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            WebElement oneSearchResult = searchResults.get(i);
          resultList.add(oneSearchResult.getText());
        }
        return resultList;
    }
}
