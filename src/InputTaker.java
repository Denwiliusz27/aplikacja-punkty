import java.util.Scanner;

/**
 * Klasa służąca do pobierania od użytkownika wprowadzanych przez niego danych
 */
public class InputTaker {
    private Scanner scanner;

    /**
     * Konstruktor tworzący nowy Scanner i przypisujący go do pola scanner
     */
    public InputTaker(){
        scanner = new Scanner(System.in);
    }

    /**
     * Metoda pobiera wprowadzoną przez użytkownika wartość liczbową i następnie ją zwraca
     *
     * @return wpisana wartość liczbowa
     */
    public int getIntValue(){
        return scanner.nextInt();
    }

    /**
     * Metoda służy do pobrania wartości licznowej i zwrócenia odpowiadającej jej stałej wyliczeniowej
     *
     * Metoda pobiera od użytkownika liczbę, a następnie w pętli przegląda wszystkie stałe wyliczeniowe w celu
     * porównania przypisanych im wartości liczbowych z tą wprowadzoną przez użytkownika. Jeśli porównywana stała
     * wyliczniowa posiada wartość równą wprowadzonej liczbie, zostaje zwrócona przez metodę. Jeśli w programie nie
     * wystepuje taka stała, zostaje zwrócona stała {@link MenuOption#ERROR}
     *
     * @return stała wyliczeniowa posiadająca wartość równą wprowadzonej przez użytkownika liczbie
     */
    public MenuOption getOptionByInt(){
        int inputInt = scanner.nextInt();

        for (MenuOption option: MenuOption.values()) {
            if(inputInt == option.getvalue()){
                return option;
            }
        }

        return MenuOption.ERROR;
    }

    /**
     * Metoda pobiera od użytkownika tekst, a nastepnie go zwraca
     *
     * @return wprowadzony przez użytkownika tekst
     */
    public String getStringValue(){
        return scanner.next();
    }
}