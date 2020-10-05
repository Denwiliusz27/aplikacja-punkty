import java.util.ArrayList;
import java.util.List;

public class ScoreTwiceTable implements Table {
    private List<Score> scores;

    public ScoreTwiceTable(){
        scores = new ArrayList<>();
    }

    public Score addScore(Score score) {
        Score doublescore = new Score(score.getName(), score.getPoints()*2);
        scores.add(doublescore);
        return doublescore;
    }

    public List<Score> getScores() {
        return scores;
    }

    @Override
    public void addToTable(Score score) {
        scores.add(score);
    }

    @Override
    public void clearTable() {
        scores.clear();
    }
}
