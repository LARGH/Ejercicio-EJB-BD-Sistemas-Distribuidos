package com.ipn.mx.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", 
        query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByMatricula", 
        query = "SELECT a FROM Alumno a WHERE a.matricula = :matricula"),
    @NamedQuery(name = "Alumno.findByNombre", 
        query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumno.findByApellidoPaterno", 
        query = 
        "SELECT a FROM Alumno a WHERE a.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Alumno.findByApellidoMaterno", 
        query = 
        "SELECT a FROM Alumno a WHERE a.apellidoMaterno = :apellidoMaterno")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricula")
    private String matricula;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @JoinTable(name = "inscritos", 
        joinColumns = {
            @JoinColumn(name = "matricula", 
            referencedColumnName = "matricula")}, 
        inverseJoinColumns = {
            @JoinColumn(name = "id_carrera", 
            referencedColumnName = "id_carrera")})
    @ManyToMany(fetch = FetchType.LAZY, 
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Carrera> carreraList;

    public Alumno() {
    }

    public Alumno(String matricula) {
        this.matricula = matricula;
    }

    public Alumno(String matricula, 
                  String nombre, 
                  String apellidoPaterno, 
                  String apellidoMaterno,
                  String email) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.mx.model.Alumno[ matricula=" + matricula + " ]";
    }
    
}
