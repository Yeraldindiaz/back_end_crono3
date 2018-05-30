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
@XmlRootElement(name = "AsistenciaDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class AsistenciaDTO {

    private int ID_Asistencia;
    private String fecha;
    private String jornada;
    private EntrenadorDTO entrenadorDTO;
    private DeportistaDTO deportistaDTO;

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

    public EntrenadorDTO getEntrenadorDTO() {
        return entrenadorDTO;
    }

    public void setEntrenadorDTO(EntrenadorDTO entrenadorDTO) {
        this.entrenadorDTO = entrenadorDTO;
    }

    public DeportistaDTO getDeportistaDTO() {
        return deportistaDTO;
    }

    public void setDeportistaDTO(DeportistaDTO deportistaDTO) {
        this.deportistaDTO = deportistaDTO;
    }

}
