package com.ipn.mx.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael Landa
 */
@Entity
@Table(name = "carrera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", 
        query = "SELECT c FROM Carrera c"),
    @NamedQuery(name = "Carrera.findByIdCarrera", 
        query = "SELECT c FROM Carrera c WHERE c.idCarrera = :idCarrera"),
    @NamedQuery(name = "Carrera.findByNombre", 
        query = "SELECT c FROM Carrera c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Carrera.findByDescripcion", 
        query = "SELECT c FROM Carrera c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Carrera.findByStatus", 
        query = "SELECT c FROM Carrera c WHERE c.status = :status")})
public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carrera")
    private Integer idCarrera;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @JoinTable(name = "inscritos", 
        joinColumns = {
            @JoinColumn(name = "id_carrera", 
            referencedColumnName = "id_carrera")}, 
        inverseJoinColumns = {
            @JoinColumn(name = "matricula", 
            referencedColumnName = "matricula")})
    @ManyToMany(fetch = FetchType.LAZY, 
        mappedBy = "carreraList", 
        cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Alumno> alumnoList;

    public Carrera() {
    }

    public Carrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Carrera(String nombre, 
                   String descripcion, 
                   boolean status) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status = status;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @XmlTransient
    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrera != null ? idCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        return !((this.idCarrera == null && other.idCarrera != null) || 
                    (this.idCarrera != null && 
                        !this.idCarrera.equals(other.idCarrera))
                 );
    }

    @Override
    public String toString() {
        return "com.ipn.mx.model.Carrera[ idCarrera=" + idCarrera + " ]";
    }
    
}
