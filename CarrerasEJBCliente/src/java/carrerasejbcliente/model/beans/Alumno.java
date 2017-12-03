package carrerasejbcliente.model.beans;

import java.util.Objects;

/**
 *
 * @author Rafael Landa
 */
public class Alumno {
    private String matricula;
    private String nombreAlumno;
    private Carrera carrera;

    public Alumno() {
    }

    public Alumno(String matricula, String nombreAlumno, Carrera carrera) {
        this.matricula = matricula;
        this.nombreAlumno = nombreAlumno;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula="
                + matricula + ", nombreAlumno=" + 
                  nombreAlumno + '}';
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
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
    
}
