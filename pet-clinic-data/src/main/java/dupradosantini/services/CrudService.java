package dupradosantini.services;

import java.util.Set;

public interface CrudService<T, ID>{
                            // Java generics Type and ID, will be specified in each service
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
