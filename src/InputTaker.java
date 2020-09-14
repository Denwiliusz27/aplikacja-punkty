import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Klasa służąca do pobierania od użytkownika wprowadzanych przez niego danych
 */
public class InputTaker {
    private Scanner scanner;
    private Displayer displayer;

    public InputTaker(){
        scanner = new Scanner(System.in);
        displayer = new Displayer();
    }

    /**
     * Metoda pobiera wprowadzoną przez użytkownika wartość liczbową i następnie ją zwraca.
     *
     * W przypadku błędnej wartości lub wprowadzenia ciągu liter zostaje wyrzucony wyjątek, po czym ponownie pobierana
     * jest wartość liczbowa
     *
     * @return wpisana wartość liczbowa
     */
    public int getIntValue(){
        int value;
        scanner.reset();

        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            displayer.displayException(e);
            scanner.next();
            displayer.displayInputMessage("liczbe punktow");
            return this.getIntValue();
        }
        return value;
    }

    /**
     * Metoda służy do pobrania wartości licznowej i zwrócenia odpowiadającej jej stałej wyliczeniowej.
     *
     * Metoda pobiera od użytkownika liczbę, a następnie w pętli przegląda wszystkie stałe wyliczeniowe w celu
     * porównania przypisanych im wartości liczbowych z tą wprowadzoną przez użytkownika. Jeśli porównywana stała
     * wyliczniowa posiada wartość równą wprowadzonej liczbie, zostaje zwrócona przez metodę. Jeśli w programie nie
     * wystepuje taka stała, zostaje zwrócona stała {@link MenuOption#ERROR}. Jeśli podana wartość nie jest liczbą,
     * wyrzucany jest wyjątek, a metoda zostaje wywołana ponownie.
     *
     * @return stała wyliczeniowa posiadająca wartość równą wprowadzonej przez użytkownika liczbie
     */
    public MenuOption getOptionByInt(){
        int inputInt;

        try{
            inputInt = scanner.nextInt();
        } catch (InputMismatchException e){
            displayer.displayException(e);
            scanner.next();
            displayer.displayInputMessage("numer");
            return this.getOptionByInt();
        }

        for (MenuOption option: MenuOption.values()) {
            if(inputInt == option.getvalue()){
                return option;
            }
        }

        return MenuOption.ERROR;
    }

    /**
     * Metoda pobiera od użytkownika tekst, a nastepnie go zwraca.
     *
     * Jeśli użytkownik podał liczbę, wyrzucany jest wyjątek, a metoda uruchamiana jest ponownie.
     *
     * @return wprowadzony przez użytkownika tekst
     */
    public String getStringValue(){
        if(scanner.hasNextInt()){
            displayer.displayException(new InputMismatchException(""));
            scanner.next();
            displayer.displayInputMessage("imie");
            return getStringValue();
        } else {
            String scan = scanner.next();
            if(!scan.matches("^[a-zA-Z]*$")){
                displayer.displayException(new InputMismatchException(""));
                displayer.displayInputMessage("imie");
                return getStringValue();
            }
            else {
                return scan;
            }
        }

    }
}