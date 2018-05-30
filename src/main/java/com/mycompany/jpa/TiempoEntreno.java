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
@Table(name = "TIEMPOENT")
public class TiempoEntreno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_tiempos;

    private String tiempo;
    private String tiempoexigencia;
    private String tiempodescanso;
    private int serie;

    @ManyToOne
    @JoinColumn(name = "deportistaFK")
    private Deportista deportistaFK;

    @ManyToOne
    @JoinColumn(name = "rutinaFK")
    private Rutina rutinaFK;

    public int getID_tiempos() {
        return ID_tiempos;
    }

    public void setID_tiempos(int ID_tiempos) {
        this.ID_tiempos = ID_tiempos;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempoexigencia() {
        return tiempoexigencia;
    }

    public void setTiempoexigencia(String tiempoexigencia) {
        this.tiempoexigencia = tiempoexigencia;
    }

    public String getTiempodescanso() {
        return tiempodescanso;
    }

    public void setTiempodescanso(String tiempodescanso) {
        this.tiempodescanso = tiempodescanso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Deportista getDeportistaFK() {
        return deportistaFK;
    }

    public void setDeportistaFK(Deportista deportistaFK) {
        this.deportistaFK = deportistaFK;
    }

    public Rutina getRutinaFK() {
        return rutinaFK;
    }

    public void setRutinaFK(Rutina rutinaFK) {
        this.rutinaFK = rutinaFK;
    }

}
