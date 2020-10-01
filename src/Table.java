import java.util.List;

public interface Table {
    void addScore(Score score);

    List<Score> getScores();
}
