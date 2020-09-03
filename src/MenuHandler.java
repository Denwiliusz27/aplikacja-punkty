import java.util.List;

public class MenuHandler {
    private Displayer displayer;
    private InputTaker inputTaker;
    private ScoreTable scoreTable;
    //private MenuOption menuOption;

    public MenuHandler(){
        displayer = new Displayer();
        inputTaker = new InputTaker();
        scoreTable = new ScoreTable();
    }

    void getResponse(){
        //int answer = 0;
        MenuOption answer;
        //answer = MenuOption.DEFAULT;

        do{
            displayer.displayMenu(List.of("dodaj wynik", "wyswietl wynik", "wyjdz"));

            displayer.displayInputMessage("numer");
            //System.out.println("Wybierz punkt: ");

            answer = inputTaker.getOptionByInt();

            displayer.displayChoseNumber(answer);
            //System.out.println("Wybrano: " + answer + " \n");

            switch (answer) {
                case ADD_SCORE:
                    addScore();
                    break;

                case PRINT_SCORE:
                    //print(scoreArray);
                    break;

                case EXIT:
                    displayer.displayExitMessage("wyjscia");
                    break;

                default:
                    displayer.displayExitMessage("niedozwolona");
                    break;
            }
            System.out.println("\n");
        } while(answer != MenuOption.EXIT && answer != MenuOption.ERROR);
    }

    private void addScore() {
        Score score = new ScoreCreator().create();
        scoreTable.addScore(score);
    }
}
