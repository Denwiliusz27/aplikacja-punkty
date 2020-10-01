public interface DAO<T> {
       void saveScore(T score);
       Table loadTable();
}