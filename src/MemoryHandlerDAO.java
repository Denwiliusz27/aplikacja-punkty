import java.util.ArrayList;

/**
 * Klasa służąca do zapisywania wyników do pamięci
 */
public class MemoryHandlerDAO implements DAO<Score>{
    Table scoreTable;

    public MemoryHandlerDAO(Table scoreTable){
        this.scoreTable = scoreTable;
    }

    /**
     * etoda dodaje wynik typu {@link Score} do pamięci.
     *
     * Wynik podany w parametrze metody zostaje dodany do tabeli wyników typu {@link Table}
     *
     * @param score dodawany wynik
     */
    @Override
    public void saveScore(Score score) {
        scoreTable.addScore(score);
    }

    /**
     * Metoda zwraca tabelę typu {@link Table} z zapisanymi w niej wynikami
     *
     * @returntabela wyników
     */
    @Override
    public Table loadTable() {
        return this.scoreTable;
    }
}