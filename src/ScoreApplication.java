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
        System.out.println("dziala");

        int answer = 0;
        List<Score> scoreArray = new ArrayList<>();

        while(answer != 3) {
            displayer.displayMenu(List.of("dodaj wynik", "wyswietl wynik", "wyjdz"));

            System.out.println("Wybierz punkt: ");
           // Scanner scanner = new Scanner(System.in);

            //scanner = isInt(scanner);

            answer = inputTaker.getIntValue();
            System.out.println("Wybrano: " + answer + " \n");

            switch (answer) {
                case 1:
                    System.out.println("Podaj imie: ");

                   // scanner = isString(scanner);
                    String name = inputTaker.getStringValue();

                    System.out.println("Podaj wynik: ");

                   // scanner = isInt(scanner);
                    int points = inputTaker.getIntValue();

                    scoreArray.add(new Score(name, points));
                    break;

                case 2:
                    print(scoreArray);
                    break;

                default:
                    break;
            }

            System.out.println("\n");
        }

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
