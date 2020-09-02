import java.util.ArrayList;
import java.util.List;

public class ScoreTable {
    private List<Score> scores;

    public ScoreTable(){
        scores  = new ArrayList<>();
    }

    public void addScore(Score score) {
        scores.add(score);
    }
}
