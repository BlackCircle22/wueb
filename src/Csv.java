
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csv {

    private String[][] konten;

    public Boolean pruefenVorhandenCsvBuch(Csv csvBuch)throws FileNotFoundException {
        return false;
    }

    public int naechsteBuchungLesen(int letzteZeile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int neueBuchungSchreiben(String datum , double betrag , Buchungsart buchungsart , String buchungstext , Steuerschluessel steuerschluessel ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean buchungenCsvErstellen(Csv csvBuch ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double summeEinnahmen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double summeAusgaben() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getBuchungstext(int zeilenNummer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getKontonummer(int zeilenNummer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getBruttoBetrag(int zeilenNummer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean pruefenVorhandenCsvKonten(Csv csvKonten) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[][] lesenCsvKonten_ktonr_bez() throws FileNotFoundException {
        File file = new File("skr03x.csv");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(";");
        //return ;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[][] lesenCsvEinnamen_ktonr_dat_text_betrag_steuer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[][] lesenCsvAusgaben_ktonr_dat_text_betrag_steuer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
