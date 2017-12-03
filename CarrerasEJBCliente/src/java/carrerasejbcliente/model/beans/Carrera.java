package carrerasejbcliente.model.beans;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Rafael Landa
 */
public class Carrera {
    
    private String nombreCarrera;
    private String descripcion;
    private List<Alumno> alumnos;
    
    public Carrera() {
    }
    
    public Carrera(String nombreCarrera, String descripcion, 
            List<Alumno> alumnos) {
        this.nombreCarrera = nombreCarrera;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }
    
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
        public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
        
    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + 
                nombreCarrera + ", descripcion=" +
                descripcion + '}';
    }    

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrera other = (Carrera) obj;
        if (!Objects.equals(this.nombreCarrera, other.nombreCarrera)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.alumnos, other.alumnos);
    } 
    
}
