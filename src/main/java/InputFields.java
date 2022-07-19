import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFields {

    public InputFields(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final String url= "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    By inputfieldone = By.id("sum1");
    By inputfieldtwo = By.id("sum2");
    By closepopupwindow = By.id("at-cv-lightbox-close");
    By totalButton = By.xpath("//*[@onclick= \"return total()\"]");
    By total = By.id("displayvalue");

    public void navigate(){
        driver.get(url);
    }

    public void close(){
        driver.findElement(closepopupwindow).click();
    }

    public void senddatas(int a, int b){
        driver.findElement(inputfieldone).sendKeys(String.valueOf(a));
        driver.findElement(inputfieldtwo).sendKeys(String.valueOf(b));
    }

    public void gettotalbutton(){
        driver.findElement(totalButton).click();
    }

    public int total() {
        String s = driver.findElement(total).getText();
        return Integer.parseInt(s);
    }

}
