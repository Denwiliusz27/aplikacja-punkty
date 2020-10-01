import java.util.ArrayList;

public class MemoryHandlerDAO implements DAO<Score>{
    Table scoreTable;

    public MemoryHandlerDAO(Table scoreTable){
        this.scoreTable = scoreTable;
    }

    @Override
    public void saveScore(Score score) {
        scoreTable.addScore(score);
    }

    @Override
    public Table loadTable() {
        return this.scoreTable;
    }
}