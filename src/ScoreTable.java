import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca tabelę wyników
 *
 * Składa się z listy której elementy są typu {@link Score}
 */
public class ScoreTable implements Table {
    protected List<Score> scores;

    /**
     * Tworzy nową listę typu {@link ArrayList} i przypisuje ją do pola scores
     */
    public ScoreTable(){
        scores  = new ArrayList<>();
    }

    /**
     * Metoda dodaje wynik typu {@link Score} do listy.
     *
     * Podany jako parametr wynik zostaje dodany do listy przy użyciu metody {@link List#add(Object)}}
     *
     * @param score wynik który zostaje dodany do listy
     */
    public Score addScore(Score score) {
        scores.add(score);
        return score;
    }

    /**
     * Zwraca tabelę wyników
     *
     * @return tabela wyników
     */
    public List<Score> getScores(){
        return scores;
    }

    /**
     * Dodaje wynik typu {@link Score} do listy wyników
     *
     * @param score wynik który dodaje się do listy
     */
    @Override
    public void addToTable(Score score) {
        scores.add(score);
    }

    /**
     * Usuwa wszystkie pozycje z listy
     */
    @Override
    public void clearTable() {
        scores.clear();
    }
}