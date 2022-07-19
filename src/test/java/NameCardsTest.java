import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NameCardsTest extends BaseTest{
    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/data-list-filter-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet.
    A teszteset ellenőrizze a névjegykártyák tartalmát.Olvasd ki a neveket a megjelenő névjegykártyákról
    és ellenőrzésként hasonlítsd össze egy elvárt eredményként megadott listával.
    Használj relatív útvonalat a névjegykártya név elemeinek kiolvasásához.
     */
    @Test
    public void NamecardTest() {
        NameCards namecards = new NameCards(driver);
        namecards.navigate();
        List<String> actual = namecards.getnamecards();
        List<String> expected = new ArrayList<>();
        expected.add("Name: Tyreese Burn");
        expected.add("Name: Brenda Tree");
        expected.add("Name: Glenn Pho shizzle");
        expected.add("Name: Brian Hoyies");
        expected.add("Name: Glenn Pho shizzle");
        expected.add("Name: Arman Cheyia");


        Assertions.assertEquals(expected,actual);
    }
}
