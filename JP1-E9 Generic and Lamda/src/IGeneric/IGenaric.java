package IGeneric;

import java.util.List;

public interface IGenaric<T> {
    void update(T obj);
    void sort(List<T> list);
    T findById(List<T> list, int id);
    T findByName(List<T> list, String name);
}



