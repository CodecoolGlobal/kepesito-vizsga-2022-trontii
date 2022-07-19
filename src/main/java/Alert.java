import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert {

    public Alert(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final String url= "https://demo.seleniumeasy.com/bootstrap-modal-demo.html";
    By singleModalButton= By.xpath("//div[@class=\"panel-body\"]/a[@href=\"#myModal0\"]");
    By closewindowbutton = By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[1]");
    By contentbody= By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]");

    public void navigate(){
        driver.get(url);
    }

    public void clickmodalbutton(){
        driver.findElement(singleModalButton).click();
    }

    public String gettextfromwindow(){
        String p = driver.findElement(contentbody).getText();
        return p;
    }

    public void close(){
        driver.findElement(closewindowbutton).click();
    }

}
