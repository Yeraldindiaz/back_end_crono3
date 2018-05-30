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
@Table(name = "TIEMPOCOM")
public class TiempoCompetencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_tiempos;

    private String prueba;
    private int distancia;
    private String tiempo;
    private String categoria;

    public TiempoCompetencia() {
    }

    public TiempoCompetencia(String prueba, int distancia, String tiempo, String categoria) {
        this.prueba = prueba;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.categoria = categoria;
    }

    public int getID_tiempos() {
        return ID_tiempos;
    }

    public void setID_tiempos(int ID_tiempos) {
        this.ID_tiempos = ID_tiempos;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tiempo_Competencia{" + "ID_tiempos=" + ID_tiempos + ", prueba=" + prueba + ", distancia=" + distancia + ", tiempo=" + tiempo + ", categoria=" + categoria + '}';
    }

    //Realacoin de 0-1----1 entrew (Tiempo Com -- Evento)
    @ManyToOne
    @JoinColumn(name = "eventoFK")
    private Evento EventoFK;

    public Evento getEventoFK() {
        return EventoFK;
    }

    public void setEventoFK(Evento EventoFK) {
        this.EventoFK = EventoFK;
    }

    //Realacoin de 0-1----1 entrew (Tiempo Com -- Deportista)
    @ManyToOne
    @JoinColumn(name = "deportistaFK")
    private Deportista deportistaFK;

    public Deportista getDeportistaFK() {
        return deportistaFK;
    }

    public void setDeportistaFK(Deportista deportistaFK) {
        this.deportistaFK = deportistaFK;
    }
}
