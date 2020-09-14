public interface DAO<T> {
       void saveScore(T score);
       ScoreTable getScores();
}