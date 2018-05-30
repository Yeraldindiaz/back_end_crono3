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
@Table(name = "DEPORTES")
public class Deporte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Deporte;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "deporteFK", cascade = CascadeType.ALL)
    private List<Evento> list_Eventos;

    @OneToMany(mappedBy = "deporteFK", cascade = CascadeType.ALL)
    private List<Entrenador> list_Entrenadores;

    @OneToMany(mappedBy = "deporteFK", cascade = CascadeType.ALL)
    private List<Deportista> list_Deportistas;

    public Deporte() {
        list_Eventos = new ArrayList<>();
        list_Entrenadores = new ArrayList<>();
        list_Deportistas = new ArrayList<>();
    }

    public int getID_Deporte() {
        return ID_Deporte;
    }

    public void setID_Deporte(int ID_Deporte) {
        this.ID_Deporte = ID_Deporte;
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

    public List<Evento> getList_Eventos() {
        return list_Eventos;
    }

    public void setList_Eventos(List<Evento> list_Eventos) {
        this.list_Eventos = list_Eventos;
    }

    public List<Entrenador> getList_Entrenadores() {
        return list_Entrenadores;
    }

    public void setList_Entrenadores(List<Entrenador> list_Entrenadores) {
        this.list_Entrenadores = list_Entrenadores;
    }

    public List<Deportista> getList_Deportistas() {
        return list_Deportistas;
    }

    public void setList_Deportistas(List<Deportista> list_Deportistas) {
        this.list_Deportistas = list_Deportistas;
    }

}
