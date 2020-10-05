import java.util.List;

public interface Table {
    Score addScore(Score score);
    List<Score> getScores();
    void addToTable(Score score);
    void clearTable();
}
