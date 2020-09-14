public class MemoryHandlerDAO implements DAO<Score>{
    ScoreTable scoreTable;

    public MemoryHandlerDAO(){
        scoreTable = new ScoreTable();
    }

    @Override
    public void saveScore(Score score) {
        scoreTable.addScore(score);
    }

    @Override
    public ScoreTable getScores() {
        return this.scoreTable;
    }
}