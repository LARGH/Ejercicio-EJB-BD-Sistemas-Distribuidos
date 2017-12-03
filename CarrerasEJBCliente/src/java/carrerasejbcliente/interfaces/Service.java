package carrerasejbcliente.interfaces;

import carrerasejbcliente.model.beans.Carrera;

import java.util.List;

/**
 *
 * @author Rafael Landa
 */
public interface Service {
    
    public void create(Carrera carrera);
    
    public List<Carrera> read(Carrera carrera);
    
    public List<Carrera> findAll();
    
    public void update(Carrera carrera);
    
    public void delete(Carrera carrera);
    
}
