import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hello {

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

    public static void main(String[] args) {

        int answer = 0;
        List<Score> scoreArray = new ArrayList<>();

        while(answer != 3) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Dostepne opcje: ");
            System.out.println("1. Dodaj wynik");
            System.out.println("2. Wyswietl tabele wynikow");
            System.out.println("3. Wyjdz z aplikacji");
            System.out.println("\n");

            System.out.println("Wybierz punkt: ");
            Scanner scanner = new Scanner(System.in);

            scanner = isInt(scanner);
            answer = scanner.nextInt();
            System.out.println("Wybrano: " + answer + " \n");

            switch (answer) {
                case 1:
                    System.out.println("Podaj imie: ");
                    scanner = new Scanner(System.in);

                    scanner = isString(scanner);
                    String name = scanner.next();

                    System.out.println("Podaj wynik: ");
                    scanner = new Scanner(System.in);

                    scanner = isInt(scanner);
                    int points = scanner.nextInt();

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
}