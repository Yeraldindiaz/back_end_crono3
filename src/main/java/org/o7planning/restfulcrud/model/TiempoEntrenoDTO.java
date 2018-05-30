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
@XmlRootElement(name = "TiempoEntrenoDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class TiempoEntrenoDTO {

    private int ID_tiempos;
    private String tiempo;
    private String tiempoexigencia;
    private String tiempodescanso;
    private int serie;
    private DeportistaDTO deportistaDTO;
    private RutinaDTO rutinaDTO;

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

    public DeportistaDTO getDeportistaDTO() {
        return deportistaDTO;
    }

    public void setDeportistaDTO(DeportistaDTO deportistaDTO) {
        this.deportistaDTO = deportistaDTO;
    }

    public RutinaDTO getRutinaDTO() {
        return rutinaDTO;
    }

    public void setRutinaDTO(RutinaDTO rutinaDTO) {
        this.rutinaDTO = rutinaDTO;
    }

}
