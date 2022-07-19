import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TableData {
    public TableData(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final String url = "https://demo.seleniumeasy.com/table-data-download-demo.html";
    By names = By.xpath("//tbody/tr");

    public void navigate (){
        driver.get(url);
    }

    public List<String> getnamedatas() {
        List<String> result = new ArrayList<>();
        List<WebElement> elements = driver.findElements(names);
        for (WebElement element : elements) {
            String name = element.findElement(By.xpath(".//td")).getText();
            result.add(name);
        }
        return result;
    }

}
