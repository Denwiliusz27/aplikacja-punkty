import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Klasa służąca do zapisywania i odczytywania z pliku
 */
public class FileHandlerDAO implements DAO<Score> {

    Displayer displayer;

    public FileHandlerDAO(){
        displayer = new Displayer();
    }

    /**
     * Służy do zapisywania do pliku.
     *
     * Na początku zostaje utworzony obiekt typu {@link FileWriter} za pomocą możemy zapisywać do pliku. W sekwencji try
     * zostaje utworzony nowy plik o podnej nazwie. Następnie w pętli za pomocą metody {@link FileWriter#write(int)}
     * wyniki z przekazanej w parametrze listy wyników zostają zapisane w pliku. W sekwencji catch wyłapywane są wyjątki,
     * a w sekcji finally wykonywana jest próba zamknięcia pliku za pomocą {@link FileWriter#close()}
     *
     * @param scoreArray lista wyników
     */

    @Override
    public void save(List<Score> scoreArray) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("files/Scores.txt");
            for (Score score: scoreArray) {
                fileWriter.write(score.toString() + "\n");
            }
        } catch (FileNotFoundException e) {
            displayer.displayException(e);
        } catch (IOException e) {
            displayer.displayException(e);
        } finally {
            try {
                if(fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                displayer.displayException(e);
                e.printStackTrace();
            }
        }
    }

    /**
     * Metoda służąca do pobierania danych z pliku, zapisywania ich w liście i zwracania jej
     *
     * W sekwencji try zostaje utworzony obiekt typu {@link FileReader} służący do odczytu danych z pliku. Następnie za
     * pomocą metody {@link FileReader#read()} odczytywany jest pojedynczy znak. Następnie sprawdzane jest kolejno czy
     * jest on znakiem końca pliku, znakiem końca linii, dwukropkiem czy spracją. Następnie w zależności czy znak ten
     * jest liczbą czy literą, jest on dodawany do stałej będącej kolejno wynikiem punktowym lub imieniem uczestnika.
     * Po odczycie całej linii odczytana ilość punktów zostaje zamieniona na int, po czym za jej pomocą i stałej name
     * zostaje utworzony obiekt typu {@link Score} i dodany do listy w {@link ScoreTable} za pomocą
     * {@link ScoreTable#addScore(Score)}. Stałe dla imienia i wyniku punktowego zostają wyzerowane, po czym zostaje
     * odczytana kolejna linijka pliku. W segmencie catch są wyłapywane wyjątki, natomiast w finally jest podejmowana
     * próba zamknięcia pliku.
     *
     * @return stworzona lista wyników z danych zapisanych w pliku
     */
    @Override
    public ScoreTable getAll() {

        ScoreTable scoreTable = new ScoreTable();
        FileReader fileReader = null;
        String name = "";
        String points = "";
        int newline = 10;
        int dots = 58;
        int space = 32;
        int zeroInAscii = 48;
        int nineInAscii = 57;
        int readed;

        try {
            fileReader = new FileReader("files/Scores.txt");
            while ((readed = fileReader.read()) != -1) {
                if (readed != newline) {
                    if (readed != dots && readed != space) {
                        if (readed >= zeroInAscii && readed <= nineInAscii) {
                            points += (char) readed;
                        } else {
                            name += (char) readed;
                        }
                    }
                } else {
                    int intPoints = Integer.parseInt(points);

                    Score score = new Score(name, intPoints);
                    scoreTable.addScore(score);

                    name = "";
                    points = "";
                }
            }
        } catch (FileNotFoundException e) {
            displayer.displayException(e);
        } catch (IOException e){
            displayer.displayException(e);
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                displayer.displayException(e);
            }
        }
        return scoreTable;
    }
}