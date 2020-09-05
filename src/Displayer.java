import java.util.List;

/**
 * Klasa służąca do wyświetlania komunikatów i wiadomości na ekranie
 */
public class Displayer {

    /**
     * Metoda służy do wypisania na ekranie dostępnych do wybrania opcji
     *
     * Metoda pobiera od użytkownika listę opcji które mogą zostać wybrane, a następnie wypisuje je w pętli for razem
     * z przyporządkowanymi im numerami. Na końcu za pomocą metody {@link #displayEmptyLine()} zostaje wyświetlona pusta
     * linia
     *
     * @param lista lista opcji które może wybrać użytkownik
     */
    public void displayMenu(List<String> lista){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Dostepne opcje: ");

        for(int i=0; i<lista.size(); i++) {
            System.out.printf("%d. %s \n", i+1, lista.get(i));
        }
        displayEmptyLine();
    }

    /**
     * Metoda wypisuje jakie dane powinny zostać podane przez użytkownika.
     *
     * Wyświetla na ekranie komunikat o konieczności wprowadzenia przez użytkownika informacji podanej jako parametr.
     * Zostaje ona dodana do wyświetlanego komunikatu
     *
     * @param message wiadomość dołączana do wyświetlanego komunikatu
     */
    public void displayInputMessage(String message){
        System.out.printf("Podaj %s: ", message);
    }

    /**
     * Metoda wypisuje jaka opcja została wybrana przez użytkownika.
     *
     * Podana w parametrze stała wyliczeniowa zostaje zamieniona na przypisaną jej wartość liczbową za pomocą metody
     * {@link MenuOption#getvalue()} a następnie dodana do wyświetlanej na ekranie wiadomości.
     *
     * @param answer stała wyliczeniowa posiadająca przypisaną do niej wartość liczbową odpowiadającą wprowadzonej przez
     *               użytkownika liczbie
     */
    public void displayChoseNumber(MenuOption answer){
        System.out.printf("Wybrano: %d \n\n", answer.getvalue());
    }

    /**
     * Metoda wypisuje na ekranie informacje o wybranej przez użytkownika opcji.
     *
     * Podana w parametrze wiadomość zostaje dodana do kominikatu wyświetlaniego na ekranie
     *
     * @param message wiadomość dodawana do wyświetlanego komunikatu
     */
    public void displayOutMessage(String message){
        System.out.printf("Wybrano opcje %s \n", message);
    }

    /**
     * Metoda służąca do wypisana na ekranie pustej linii
     */
    public void displayEmptyLine(){
        System.out.println();
    }
}