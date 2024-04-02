package CRUDServices;


public interface CRUDService {
    void save(Object entity);
    void delete(Object id);
    Object get(Object id);
}
