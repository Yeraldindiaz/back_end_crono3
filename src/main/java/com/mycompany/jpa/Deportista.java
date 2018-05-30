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
@Table(name = "DEPORTISTA")
public class Deportista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Deportista;

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int cedula;
    private String ciudad;
    private String categoria;
    private String Contraseña;

    @ManyToOne
    @JoinColumn(name = "deporteFK")
    private Deporte deporteFK;

    @ManyToOne
    @JoinColumn(name = "entrenadorFK")
    private Entrenador entrenadorFK;

    @OneToMany(mappedBy = "deportistaFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TiempoCompetencia> list_Tiempo_Competencias;

    @OneToMany(mappedBy = "deportistaFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Chequeo> list_Chequeos;

    @OneToMany(mappedBy = "deportistaFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Asistencia> list_Asistencias;

    @OneToMany(mappedBy = "deportistaFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TiempoEntreno> list_Tiempo_Entrenamientos;

    public Deportista() {
        this.list_Tiempo_Competencias = new ArrayList<>();
        this.list_Chequeos = new ArrayList<>();
        this.list_Asistencias = new ArrayList<>();
        this.list_Tiempo_Entrenamientos = new ArrayList<>();
    }

    public int getID_Deportista() {
        return ID_Deportista;
    }

    public void setID_Deportista(int ID_Deportista) {
        this.ID_Deportista = ID_Deportista;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Deporte getDeporteFK() {
        return deporteFK;
    }

    public void setDeporteFK(Deporte deporteFK) {
        this.deporteFK = deporteFK;
    }

    public Entrenador getEntrenadorFK() {
        return entrenadorFK;
    }

    public void setEntrenadorFK(Entrenador entrenadorFK) {
        this.entrenadorFK = entrenadorFK;
    }

    public List<TiempoCompetencia> getList_Tiempo_Competencias() {
        return list_Tiempo_Competencias;
    }

    public void setList_Tiempo_Competencias(List<TiempoCompetencia> list_Tiempo_Competencias) {
        this.list_Tiempo_Competencias = list_Tiempo_Competencias;
    }

    public List<Chequeo> getList_Chequeos() {
        return list_Chequeos;
    }

    public void setList_Chequeos(List<Chequeo> list_Chequeos) {
        this.list_Chequeos = list_Chequeos;
    }

    public List<Asistencia> getList_Asistencias() {
        return list_Asistencias;
    }

    public void setList_Asistencias(List<Asistencia> list_Asistencias) {
        this.list_Asistencias = list_Asistencias;
    }

    public List<TiempoEntreno> getList_Tiempo_Entrenamientos() {
        return list_Tiempo_Entrenamientos;
    }

    public void setList_Tiempo_Entrenamientos(List<TiempoEntreno> list_Tiempo_Entrenamientos) {
        this.list_Tiempo_Entrenamientos = list_Tiempo_Entrenamientos;
    }

}
