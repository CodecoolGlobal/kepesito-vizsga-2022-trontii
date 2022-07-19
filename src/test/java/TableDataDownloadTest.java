import com.google.common.collect.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TableDataDownloadTest extends BaseTest{

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/table-data-download-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet.
     A tesztesetet ellenőrizze a táblázatból a neveket, amelyeket a táblázat első oszlop tartalmaz.
     Gyűjtsd össze a neveket és tárold le a names.txt fájlba majd a tesztesetben a fájl tartalmát hasonlítsd
     össze egy elvárt eredménnyel.
     */
    @Test
    public void TableTest() {
        TableData tabledata = new TableData(driver);
        tabledata.navigate();
        try {
            FileWriter myWriter = new FileWriter("names.txt");
            List<String> text= tabledata.getnamedatas();
            myWriter.write(String.valueOf(text));
            myWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

       BufferedReader reader;
        List<String> list = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(
                    "names.txt"));
            String line = reader.readLine();
            while (line != null) {
                // read next line
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String expected = "[[Tiger Nixon, Garrett Winters, Ashton Cox, Cedric Kelly, Airi Satou, Brielle Williamson, Herrod Chandler, Rhona Davidson, Colleen Hurst, Sonya Frost, Jena Gaines, Quinn Flynn, Charde Marshall, Haley Kennedy, Tatyana Fitzpatrick, Michael Silva, Paul Byrd, Gloria Little, Bradley Greer, Dai Rios, Jenette Caldwell, Yuri Berry, Caesar Vance, Doris Wilder, Angelica Ramos, Gavin Joyce, Jennifer Chang, Brenden Wagner, Fiona Green, Shou Itou, Michelle House]]";

        String actual = list.toString();

        Assertions.assertEquals(expected, actual);
    }
}
