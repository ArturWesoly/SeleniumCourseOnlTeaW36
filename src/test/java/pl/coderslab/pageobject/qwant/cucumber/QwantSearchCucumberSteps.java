//package pl.coderslab.pageobject.qwant.cucumber;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class QwantSearchCucumberSteps {
//    private WebDriver driver;
//
//    @Given("Page https:\\/\\/www.qwant.com\\/ opened in browser")
//    public void page_https_www_qwant_com_opened_in_browser() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        this.driver = new ChromeDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
//        this.driver.get("https://qwant.com/");
//
//
//    }
//
//    @When("Phrase 'Szkice piórkiem' entered in search input box")
//    public void phrase_entered_in_search_input_box() {
////        driver.findElement(By.name("q"))
//        WebElement searchInput = driver.findElement(By.name("q"));
//        searchInput.sendKeys("Szkice piórkiem");
//    }
//
//    @When("Search button clicked")
//    public void search_button_clicked() {
//        WebElement searchInput = driver.findElement(By.cssSelector("button._2idgX"));
//        searchInput.click();
//    }
//
//    @Then("First 3 results link texts contain phrase 'szkice piórkiem'")
//
//
//    public void first_results_link_texts_contain_phrase() {
////        QwantSearchResultPage resultPage = new QwantSearchResultPage(driver);
////        List<String> results = resultPage.getResultsLinkTexts();
////        String phraseToContain = "pogoda";
//
//        WebElement getResultsLinkTexts = driver.findElement(By.cssSelector("a.external._2-LMx._3LFrt.Ks7KS._34qCe"));
//    }
//
//    public List<String> getResultsLinkTexts() {
//        List<String> result = new ArrayList<>();
//
//        for (WebElement elem : this) {
//            result.add(elem.getText());
//        }
//
//        return result;
//    }
//}
