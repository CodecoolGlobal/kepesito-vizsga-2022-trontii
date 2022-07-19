import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NameCards {
    public NameCards(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final String url = "https://demo.seleniumeasy.com/data-list-filter-demo.html";
    By names = By.xpath("//div[@class=\"info-block block-info clearfix\"]");

    public void navigate(){
        driver.get(url);
    }

    public List<String> getnamecards() {
        List<String> result = new ArrayList<>();
        List<WebElement> elements = driver.findElements(names);
        for (WebElement element : elements) {
            String name = element.findElement(By.xpath(".//h4")).getText();
            result.add(name);
        }
        return result;
    }
}
