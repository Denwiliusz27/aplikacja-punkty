import java.util.List;

public interface DAO<T> {
       void save(List<T> scoreArray);

       ScoreTable getAll();
}