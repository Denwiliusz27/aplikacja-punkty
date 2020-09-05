import java.util.List;

/**
 * Klasa reprezentująca menu z możliwymi do wybrania przez użytkownika opcjami
 */
public class MenuHandler {

    private Displayer displayer;
    private InputTaker inputTaker;
    private ScoreTable scoreTable;

    /**
     * Konstruktor, który tworzy nowe obiekty typu {@link Displayer}, {@link InputTaker} oraz {@link ScoreTable}, oraz
     * przypisuje je do pól displayer, inputTaker i scoreTable 
     */
    public MenuHandler(){
        displayer = new Displayer();
        inputTaker = new InputTaker();
        scoreTable = new ScoreTable();
    }

    /**
     * Metoda obsługująca menu.
     * 
     * Na początku zostaje wyświetlone menu dostępnych opcji za pomocą metody {@link Displayer#displayMenu(List)}, 
     * następnie za pomocą {@link Displayer#displayInputMessage(String)} wyświetlony zostaje komunikat o konieczności 
     * wybrania opcji przez wpisanie przez użytkownika liczby. Zostaje ona pobrana za pomocą {@link InputTaker#getOptionByInt()},
     * zamieniona na stałą wyliczeniową i wyświetlona przez {@link Displayer#displayChoseNumber(MenuOption)}. Następnie 
     * w switchu w zależności od wybranej opcji zostaje wywołana odpowiednia metoda: przy wyborze opcji dodania wyniku 
     * zostaje wywołana metoda {@link MenuHandler#addScore()}, przy wyborze opcji wyświetlenia wyników zostaje wywołana
     * metoda (...), przy wyborze opcji wyjścia z programu za pomocą {@link Displayer#displayOutMessage(String)}
     * zostaje wyświetlony komunikat o wyjściu z programu. Jeśli podany przez użytkownika numer nie odpowiada żadnej
     * opcji z menu, zostaje wyświetlony komunikat o niepoprawnej wprowadzonej liczbie. Na końcu za pomocą 
     * {@link Displayer#displayEmptyLine()} zostaje wyświetlona pusta linia. Jeśli użytkownik nie wybrał opcji wyjścia
     * z programu, program uruchamia się ponownie i wyświetla menu na ekranie.
     */
    void getResponse(){
        MenuOption answer;

        do{
            displayer.displayMenu(List.of("dodaj wynik", "wyswietl wynik", "wyjdz"));

            displayer.displayInputMessage("numer");

            answer = inputTaker.getOptionByInt();

            displayer.displayChoseNumber(answer);

            switch (answer) {
                case ADD_SCORE:
                    addScore();
                    break;

                case PRINT_SCORES:
                    //print(scoreArray);
                    break;

                case EXIT:
                    displayer.displayOutMessage("wyjscia");
                    break;

                default:
                    displayer.displayOutMessage("niedozwolona");
                    break;
            }

            displayer.displayEmptyLine();

        } while(answer != MenuOption.EXIT);
    }

    /**
     * Metoda, która tworzy nowy wynik i dodaje go do tabeli wyników
     * 
     * Na początku nowy wynik zostaje stworzony za pomocą metody {@link ScoreCreator#create()}, a następnie jest on
     * dodawany do listy z wynikami za pomocą {@link ScoreTable#addScore(Score)}
     */
    private void addScore() {
        Score score = new ScoreCreator().create();
        scoreTable.addScore(score);
    }
}