/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MARIO
 */
@XmlRootElement(name = "TiempoCompDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class TiempoCompetenciaDTO {

    private int ID_tiempos;
    private String prueba;
    private int distancia;
    private String tiempo;
    private String categoria;
    private EventoDTO eventoFK;
    private DeportistaDTO deportistaFK;

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

    public EventoDTO getEventoFK() {
        return eventoFK;
    }

    public void setEventoFK(EventoDTO eventoFK) {
        this.eventoFK = eventoFK;
    }

    public DeportistaDTO getDeportistaFK() {
        return deportistaFK;
    }

    public void setDeportistaFK(DeportistaDTO deportistaFK) {
        this.deportistaFK = deportistaFK;
    }

}
