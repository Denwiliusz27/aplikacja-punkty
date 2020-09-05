/**
 * Klasa reprezentująca opcje z menu, które mogą zostać wybrane przez użytkownika
 */
public enum MenuOption {
    /**
     * Reprezentuje dodanie wyniku
     */
    ADD_SCORE(1),

    /**
     * Reprezentuje wypisanie wszystkich wyników
     */
    PRINT_SCORES(2),

    /**
     * Reprezentuje wyjście z programu
     */
    EXIT(3),

    /**
     * Reprezentuje niewystepującą w programie opcję
     */
    ERROR;

    int value;

    /**
     * Domyślny konstruktor, który każdej stałej wyliczeniowej przypisuje wartość liczbową równą -1
     */
    MenuOption(){
        value = -1;
    }

    /**
     * Konstruktor, który każdej stałej wyliczeniowej przypisuje wartość liczbową podaną jako parametr.
     *
     * Przypisana wartość odpowiada numerowi do jakiego przypisana jest dana akcja w menu.
     *
     * @param value numer opcji w menu
     */
    MenuOption(int value){
        this.value = value;
    }

    /**
     * Metoda, która dla danej stałej wyliczeniowej zwraca odpowiadającą jej wartość liczbową.
     *
     * @return wartość przypisa do stałej wyliczeniowej
     */
    public int getvalue() {
        return value;
    }
}