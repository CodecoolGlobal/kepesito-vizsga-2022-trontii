import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputFieldTest extends BaseTest{

    /*
    Tölts be a böngészőbe az alábbi oldalt: https://demo.seleniumeasy.com/basic-first-form-demo.html
    Írj tesztesetet két szám összegének ellenőrzésére a mellékelt dokumentumban, majd a
    tesztlépések alapján írj automatizált tesztet. Az oldalon, a "Two Input Fields” szekcióban két
    beviteli mezőjét töltsd ki tetszőleges számokkal, majd végezd el a számok összeadásának ellenőrzését
    kiolvasva az oldalon megjelenő összeget.
    Használj tetszőleges tesztadatot
     */


    @Test
    public void TestInput(){
        InputFields inputfields = new InputFields(driver);
        inputfields.navigate();
        inputfields.close();
        int a = 5;
        int b = 5;

        inputfields.senddatas(a, b);
        inputfields.gettotalbutton();

        int actual = inputfields.total();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}
