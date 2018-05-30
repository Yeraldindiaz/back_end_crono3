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
@XmlRootElement(name = "DeportistaDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeportistaDTO {

    private int ID_Deportista;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int cedula;
    private String ciudad;
    private String categoria;
    private String contrasena;
    private DeporteDTO deporteFK;
    private EntrenadorDTO entrenadorFK;

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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public DeporteDTO getDeporteFK() {
        return deporteFK;
    }

    public void setDeporteFK(DeporteDTO deporteFK) {
        this.deporteFK = deporteFK;
    }

    public EntrenadorDTO getEntrenadorFK() {
        return entrenadorFK;
    }

    public void setEntrenadorFK(EntrenadorDTO entrenadorFK) {
        this.entrenadorFK = entrenadorFK;
    }

}
