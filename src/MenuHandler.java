import java.util.List;

public class MenuHandler {
    private Displayer displayer;
    private InputTaker inputTaker;
    private ScoreTable scoreTable;

    public MenuHandler(){
        displayer = new Displayer();
        inputTaker = new InputTaker();
        scoreTable = new ScoreTable();
    }

    void getResponse(){
        int answer = 0;

        while(answer != 3) {
            displayer.displayMenu(List.of("dodaj wynik", "wyswietl wynik", "wyjdz"));

            displayer.displayInputMessage("numer");
            //System.out.println("Wybierz punkt: ");

            answer = inputTaker.getIntValue();

            displayer.displayChoseNumber(answer);
            //System.out.println("Wybrano: " + answer + " \n");

            switch (answer) {
                case 1:   //MenuOption.ADD_SCORE.getvalue():
                    addScore();

                    break;

                case 2:
                   // print(scoreArray);
                    break;

                default:
                    break;
            }

            System.out.println("\n");
        }
    }

    private void addScore() {
        Score score = new ScoreCreator().create();
        scoreTable.addScore(score);
    }
}
