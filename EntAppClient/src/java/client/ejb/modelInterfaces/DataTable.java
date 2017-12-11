package client.ejb.modelInterfaces;

/**
 *
 * @author Rafael Landa 
 */
public interface DataTable<T> {
    
    void insertRow(T t);
    void deleteRow(T t);

}
