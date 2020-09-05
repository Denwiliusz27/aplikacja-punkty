import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klasa odpowiedzialna za uruchomienie głównej aplikacji
 */
public class ScoreApplication {
    private Displayer displayer;
    private InputTaker inputTaker;

    /**
     * Konstruktor, który tworzy nowe obiekty typu {@link Displayer} i {@link InputTaker} oraz przypisuje je do pól
     * displayer i inputTaker
     */
    public ScoreApplication(){
        displayer = new Displayer();
        inputTaker = new InputTaker();
    }

    /**
     * Metoda odpowiadająca za uruchomienie programu.
     *
     * Na początku zostaje utworzony obiekt typu {@link MenuHandler}, a następnie na nim zostaje wywołana metoda
     * {@link MenuHandler#getResponse()}
     */
    public void run(){
        List<Score> scoreArray = new ArrayList<>();

        MenuHandler menuHandler = new MenuHandler();
        menuHandler.getResponse();
    }

    /*
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
    */
}