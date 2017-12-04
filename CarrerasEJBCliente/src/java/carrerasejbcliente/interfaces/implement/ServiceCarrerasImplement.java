package carrerasejbcliente.interfaces.implement;

import carrerasejbcliente.model.beans.Carrera;

import java.util.ArrayList;
import java.util.List;
import carrerasejbcliente.interfaces.ServiceCarreras;

/**
 *
 * @author Rafael Landa
 */
public class ServiceCarrerasImplement implements ServiceCarreras {

    public static List<Carrera> carreras = new ArrayList<>();
    
    static {
        carreras.add(new Carrera("Ing. en sistemas 1", "Carrera de "
                + "ingenieria 1", null));
        carreras.add(new Carrera("Ing. en sistemas 2", "Carrera de "
                + "ingenieria 2", null));
        carreras.add(new Carrera("Ing. en sistemas 3", "Carrera de "
                + "ingenieria 3", null));
        carreras.add(new Carrera("Ing. en sistemas 4", "Carrera de "
                + "ingenieria 4", null));
        carreras.add(new Carrera("Ing. en sistemas 5", "Carrera de "
                + "ingenieria 5", null));
        carreras.add(new Carrera("Ing. en sistemas 6", "Carrera de "
                + "ingenieria 6", null));
    }

    @Override
    public void create(Carrera carrera) {
        ServiceCarrerasImplement.carreras.add(carrera);
    }

    @Override
    public List<Carrera> read(Carrera carrera) {
        List<Carrera> carreers = new ArrayList<>();
        for (Carrera readCarrera : carreras) {
            if (readCarrera.equals(carrera)) {
                carreers.add(readCarrera);
            }
        }
        return carreers;
    }

    @Override
    public List<Carrera> findAll() {
        return carreras;
    }

    @Override
    public void update(Carrera carrera) {
        int index = this.carreras.indexOf(carrera);
        Carrera toUpdateCarrera  = 
            this.carreras.get(index);
        toUpdateCarrera.setNombreCarrera(carrera.getNombreCarrera());
        toUpdateCarrera.setDescripcion(carrera.getDescripcion());
        this.carreras.set(index, toUpdateCarrera);
    }

    @Override
    public void delete(Carrera carrera) {
        this.carreras.remove(this.carreras.indexOf(carrera));
    }
    
}
