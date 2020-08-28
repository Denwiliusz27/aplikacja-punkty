public class ScoreCreator {
    private InputTaker inputTaker;
    private Displayer displayer;

    public ScoreCreator(){
        inputTaker = new InputTaker();
        displayer = new Displayer();
    }

    public Score create(){
        return new Score(createName(), createScore());
    }

    public String createName(){
        displayer.displayInputMessage("imie");
        return inputTaker.getStringValue();
    }

    public int createScore(){
        displayer.displayInputMessage("wynik");

        return  inputTaker.getIntValue();
    }

}
