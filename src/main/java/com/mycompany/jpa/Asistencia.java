/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author MARIO
 */
@Entity
@Table(name = "ASISTENCIA")
public class Asistencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Asistencia;

    private String fecha;
    private String jornada;

    @ManyToOne
    @JoinColumn(name = "entrenadorFK")
    private Entrenador entrenadorFK;
    
    @ManyToOne
    @JoinColumn(name = "deportistaFK")
    private Deportista deportistaFK;

    public int getID_Asistencia() {
        return ID_Asistencia;
    }

    public void setID_Asistencia(int ID_Asistencia) {
        this.ID_Asistencia = ID_Asistencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Entrenador getEntrenadorFK() {
        return entrenadorFK;
    }

    public void setEntrenadorFK(Entrenador entrenadorFK) {
        this.entrenadorFK = entrenadorFK;
    }

    public Deportista getDeportistaFK() {
        return deportistaFK;
    }

    public void setDeportistaFK(Deportista deportistaFK) {
        this.deportistaFK = deportistaFK;
    }
    
}
