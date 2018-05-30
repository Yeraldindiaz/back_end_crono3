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
@XmlRootElement(name = "RutinaDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class RutinaDTO {

    private int ID_Rutina;

    private int repeticiones;
    private int distancia;
    private String estilo;
    private String fecha;
    private String jornada;
    private EntrenadorDTO entrenadorFK;

    public int getID_Rutina() {
        return ID_Rutina;
    }

    public void setID_Rutina(int ID_Rutina) {
        this.ID_Rutina = ID_Rutina;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
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

    public EntrenadorDTO getEntrenadorFK() {
        return entrenadorFK;
    }

    public void setEntrenadorFK(EntrenadorDTO entrenadorFK) {
        this.entrenadorFK = entrenadorFK;
    }

}
