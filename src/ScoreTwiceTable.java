import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca tabelę wyników z podwojoną liczbą punktów
 *
 * Składa się z listy której elementy są typu {@link Score} z dwójną liczbą punktów
 */
public class ScoreTwiceTable extends ScoreTable {
    /**
     * Tworzy nową listę typu {@link ArrayList} i przypisuje ją do pola scores
     */
    public ScoreTwiceTable(){
        scores = new ArrayList<>();
    }

    /**
     * Metoda dodaje wynik typu {@link Score} do listy.
     *
     * Na podstawie otrzymanego w parametrze wyniku zostaje uttworzony nowy, z podwojoną liczbą punktów, a następnie
     * zostaje on dodany do listy przy użyciu metody {@link List#add(Object)}}
     *
     * @param score wynik który podlega modyfikaci
     */
    public Score addScore(Score score) {
        Score doubleScore = new Score(score.getName(), score.getPoints()*2);
        scores.add(doubleScore);
        return new Score(score.getName(), score.getPoints()*2);
    }
}
