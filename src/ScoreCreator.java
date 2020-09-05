/**
 * Klasa odpowiadająca za tworzenie wyników
 */
public class ScoreCreator {
    private InputTaker inputTaker;
    private Displayer displayer;

    /**
     * Konstruktor klasy, który tworzy nowe obiekty typu {@link Displayer} i {@link InputTaker} oraz przypisuje je
     * odpowiednio do pól inputTaker i displayer
     */
    public ScoreCreator(){
        inputTaker = new InputTaker();
        displayer = new Displayer();
    }

    /**
     * Metoda służąca do tworzenia wyniku.
     *
     * Tworzony wynik jest typu {@link Score}, a do jego stworzenia wywoływany zostaje konstruktor
     * {@link Score#Score(String, int)}, któremu jako parametry zostają podane metody {@link ScoreCreator#createName()}
     * oraz {@link ScoreCreator#createScore()} służące do stworzenia imienia i liczby uzyskanych punktów. Stworzony
     * wynik zostaje zwrócony.
     *
     * @return stworzony wynik
     */
    public Score create(){
        return new Score(createName(), createScore());
    }

    /**
     * Metoda służąca do stworzenia imienia.
     *
     * Początkowo wywoływana jest metoda {@link Displayer#displayInputMessage(String)}, która prosi o podanie imienia.
     * Następnie wywołanie metody {@link InputTaker#getStringValue()} pobiera od użytkownika imie, po czym zostaje ono
     * zwrócone.
     *
     * @return stworzone imie
     */
    public String createName(){
        displayer.displayInputMessage("imie");
        return inputTaker.getStringValue();
    }

    /**
     * Metoda służąca do stworzenia wartości punktowej.
     *
     * Początkowo wywoływana jest metoda {@link Displayer#displayInputMessage(String)}, która prosi o podanie liczby
     * punktów. Następnie wywołanie metody {@link InputTaker#getIntValue()} pobiera od użytkownika liczbę, po czym
     * zostaje ona zwrócona.
     *
     * @return ilość punktów
     */
    public int createScore(){
        displayer.displayInputMessage("liczbe punktow");
        return inputTaker.getIntValue();
    }
}