import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlertTest extends BaseTest{
    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/bootstrap-modal-demo.html#
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet.
    A tesztesetben ellenőrizd a modal alert ablak szöveges tartalmát összahasonlítva egy általad
    definiált elvárt eredménnyel. Nyisd meg a Single Modal ablakot, tárolt el az ablakon megjelenő
    szöveget egy változóba és zárd be az ablakot a bezárás gombbal
     */
    @Test
    public void AlertTest() throws InterruptedException {
        Alert alert = new Alert(driver);
        alert.navigate();
        alert.clickmodalbutton();
        Thread.sleep(2000);
        String expected= "This is the place where the content for the modal dialog displays";
        String actual = alert.gettextfromwindow();
        alert.close();

        Assertions.assertEquals(expected, actual);
    }
}
