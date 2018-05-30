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
@Table(name = "EVENTOS")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Evento;

    private String nombre;
    private String Tipo;
    private String fecha;
    private String lugar;

    @ManyToOne
    @JoinColumn(name = "deport_FK")
    private Deporte deport_FK;

    @OneToMany(mappedBy = "EventoFK", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TiempoCompetencia> list_Tiempo_Competencias;

    public Evento() {
        list_Tiempo_Competencias = new ArrayList<>();
    }

    public int getID_Evento() {
        return ID_Evento;
    }

    public void setID_Evento(int ID_Evento) {
        this.ID_Evento = ID_Evento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Deporte getDeport_FK() {
        return deport_FK;
    }

    public void setDeport_FK(Deporte deport_FK) {
        this.deport_FK = deport_FK;
    }

    public List<TiempoCompetencia> getList_Tiempo_Competencias() {
        return list_Tiempo_Competencias;
    }

    public void setList_Tiempo_Competencias(List<TiempoCompetencia> list_Tiempo_Competencias) {
        this.list_Tiempo_Competencias = list_Tiempo_Competencias;
    }
    
}
