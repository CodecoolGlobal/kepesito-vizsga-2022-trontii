import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final String url = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    By selectList = By.id("select-demo");


    public void navigate() {
        driver.get(url);
    }

    public void Selectlist(String p) {
        Select select = new Select(driver.findElement(selectList));
        select.selectByValue(p);
    }
}
