package IGeneric;

import java.util.List;

public interface IGenericService<T> {
    void add(T entity);
    T getById(int id);
    List<T> getAll();
    void update(T entity);
    void deleteById(int id);
}



