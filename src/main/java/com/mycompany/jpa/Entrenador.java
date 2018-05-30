/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author MARIO
 */
@Entity
@Table(name = "ENTRENADOR")
public class Entrenador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Entrenador;

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int cedula;
    private String ciudad;
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "deporteFK")
    private Deporte deporteFK;

    @OneToMany(mappedBy = "entrenadorFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Asistencia> list_Asistencias;

    @OneToMany(mappedBy = "entrenadorFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rutina> list_Rutinas;

    public Entrenador() {
        list_Asistencias = new ArrayList<>();
        list_Rutinas = new ArrayList<>();
    }

    public int getID_Entrenador() {
        return ID_Entrenador;
    }

    public void setID_Entrenador(int ID_Entrenador) {
        this.ID_Entrenador = ID_Entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Deporte getDeporteFK() {
        return deporteFK;
    }

    public void setDeporteFK(Deporte deporteFK) {
        this.deporteFK = deporteFK;
    }

    public List<Asistencia> getList_Asistencias() {
        return list_Asistencias;
    }

    public void setList_Asistencias(List<Asistencia> list_Asistencias) {
        this.list_Asistencias = list_Asistencias;
    }

    public List<Rutina> getList_Rutinas() {
        return list_Rutinas;
    }

    public void setList_Rutinas(List<Rutina> list_Rutinas) {
        this.list_Rutinas = list_Rutinas;
    }

}
