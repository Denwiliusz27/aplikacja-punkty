
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileHandler2 {

    Displayer displayer;

    public FileHandler2(){
        displayer = new Displayer();
    }

    public void saveToFile(List<Score> scoreArray){
        ScoreTable scoreTable = new ScoreTable();
        String name = "";
        String points = "";
        int newline = 10;
        int dots = 58;
        int space = 32;
        int zeroInAscii = 48;
        int nineInAscii = 57;
        int readed;

        try {
            Scanner scanner = new Scanner(new File("files/Scores.txt"));

            while (scanner.hasNext()) {
                if (scanner.hasNext()) {
                    if (!scanner.next().equals(":") && !scanner.next().equals(" ")) {
                        if (scanner.nextInt() >= zeroInAscii && scanner.nextInt() <= nineInAscii) {
                            points += (char) scanner.nextInt();
                        } else {
                            name += scanner.next();
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
            e.printStackTrace();
        }

    }

}

