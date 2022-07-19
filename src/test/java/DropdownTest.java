import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class DropdownTest extends BaseTest{

     /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/basic-select-dropdown-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet a
    következők szerint: a Select List Demo szekció lenyíló mezőjében válaszd ki a hét utolsó napját és
    ellenőrizd, hogy az oldalon helyesen jelenik meg a kiválasztott érték
    Tesztadatként használd az hét utolsó napját
     */
    @Test
    public void SelectDay()
    {
        DropDown dropdown = new DropDown(driver);
        dropdown.navigate();
        dropdown.Selectlist("Sunday");
        String expected = "Day selected :- Sunday";
        String actual = driver.findElement(By.xpath("//*[@class= \"selected-value\"]")).getText();

        Assertions.assertEquals(expected, actual);
    }
}
