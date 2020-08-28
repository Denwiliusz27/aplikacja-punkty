import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreApplication {
    private Displayer displayer;
    private InputTaker inputTaker;

    public ScoreApplication(){
        displayer = new Displayer();
        inputTaker = new InputTaker();
    }

    public void run(){
        List<Score> scoreArray = new ArrayList<>();

        MenuHandler menuHandler = new MenuHandler();
        menuHandler.getResponse();

    }

    public static Scanner isInt(Scanner scanner){

        if (!scanner.hasNextInt()) {
            System.out.println("!!! To nie jest liczba, wpisz ponownie: ");
            scanner = new Scanner(System.in);
            scanner = isInt(scanner);
        }

        return scanner;
    }

    public static Scanner isString(Scanner scanner){
        if (scanner.hasNextInt()) {
            System.out.println("!!! To nie jest nazwa, wpisz ponownie: ");
            scanner = new Scanner(System.in);
            scanner = isString(scanner);
        }

        return scanner;
    }

    public static void print(List<Score> scoreArray){
        if(!scoreArray.isEmpty()) {
            System.out.println("Wprowadzone wyniki: ");

            for (Score score : scoreArray) {
                System.out.println("- " + score.toString());
            }
        }
        else {
            System.out.println(" Brak wynikow ");
        }
    }
}
