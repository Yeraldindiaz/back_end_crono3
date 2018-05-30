package com.mycompany.holamuntorest;

import com.mycompany.jpa.Asistencia;
import com.mycompany.jpa.Chequeo;
import com.mycompany.jpa.Deporte;
import com.mycompany.jpa.Deportista;
import com.mycompany.jpa.Entrenador;
import com.mycompany.jpa.Evento;
import com.mycompany.jpa.Rutina;
import com.mycompany.jpa.TiempoCompetencia;
import com.mycompany.jpa.TiempoEntreno;
import org.o7planning.restfulcrud.model.AsistenciaDTO;
import org.o7planning.restfulcrud.model.ChequeoDTO;
import org.o7planning.restfulcrud.model.DeporteDTO;
import org.o7planning.restfulcrud.model.DeportistaDTO;
import org.o7planning.restfulcrud.model.EntrenadorDTO;
import org.o7planning.restfulcrud.model.EventoDTO;
import org.o7planning.restfulcrud.model.RutinaDTO;
import org.o7planning.restfulcrud.model.TiempoCompetenciaDTO;
import org.o7planning.restfulcrud.model.TiempoEntrenoDTO;

public class ConversorDTO {

    public AsistenciaDTO asistenciaToDTO(Asistencia a) {
        AsistenciaDTO asistenciaDTO = new AsistenciaDTO();
        asistenciaDTO.setJornada(a.getJornada());
        asistenciaDTO.setFecha(a.getFecha());
        asistenciaDTO.setID_Asistencia(a.getID_Asistencia());
        asistenciaDTO.setEntrenadorDTO(entrenadorToDTO(a.getEntrenadorFK()));
        asistenciaDTO.setDeportistaDTO(deportistaToDTO(a.getDeportistaFK()));
        return asistenciaDTO;
    }

    public ChequeoDTO chequeoToDTO(Chequeo a) {
        ChequeoDTO ChequeoDTO = new ChequeoDTO();
        ChequeoDTO.setID_Chequeo(a.getID_Chequeo());
        ChequeoDTO.setPrueba(a.getPrueba());
        ChequeoDTO.setDistancia(a.getDistancia());
        ChequeoDTO.setTiempo(a.getTiempo());
        ChequeoDTO.setDeportistaDTO(deportistaToDTO(a.getDeportistaFK()));
        return ChequeoDTO;
    }

    public DeportistaDTO deportistaToDTO(Deportista a) {
        DeportistaDTO deportistaDTO = new DeportistaDTO();
        deportistaDTO.setID_Deportista(a.getID_Deportista());
        deportistaDTO.setNombre(a.getNombre());
        deportistaDTO.setApellido(a.getApellido());
        deportistaDTO.setFechaNacimiento(a.getFechaNacimiento());
        deportistaDTO.setCedula(a.getCedula());
        deportistaDTO.setCiudad(a.getCiudad());
        deportistaDTO.setCategoria(a.getCategoria());
        deportistaDTO.setContraseña(a.getContraseña());
        deportistaDTO.setDeporteFK(deportesToDTO(a.getDeporteFK()));
        deportistaDTO.setEntrenadorFK(entrenadorToDTO(a.getEntrenadorFK()));
        return deportistaDTO;
    }

    public RutinaDTO rutinaToDTO(Rutina a) {
        RutinaDTO rutinaDTO = new RutinaDTO();
        rutinaDTO.setID_Rutina(a.getID_Rutina());
        rutinaDTO.setJornada(a.getJornada());
        rutinaDTO.setFecha(a.getFecha());
        rutinaDTO.setEstilo(a.getEstilo());
        rutinaDTO.setDistancia(a.getDistancia());
        rutinaDTO.setRepeticiones(a.getRepeticiones());
        rutinaDTO.setEntrenadorDTO(entrenadorToDTO(a.getEntrenadorFK()));
        return rutinaDTO;
    }

    public EventoDTO eventoToDTO(Evento a) {
        EventoDTO eventoDTO = new EventoDTO();
        eventoDTO.setID_Evento(a.getID_Evento());
        eventoDTO.setFecha(a.getFecha());
        eventoDTO.setNombre(a.getNombre());
        eventoDTO.setLugar(a.getLugar());
        eventoDTO.setTipo(a.getTipo());
        eventoDTO.setDeporteFK(deportesToDTO(a.getDeport_FK()));
        return eventoDTO;
    }

    public TiempoEntrenoDTO tiempoEntrenoToDTO(TiempoEntreno a) {
        TiempoEntrenoDTO tiempoEntrenoDTO = new TiempoEntrenoDTO();
        tiempoEntrenoDTO.setID_tiempos(a.getID_tiempos());
        tiempoEntrenoDTO.setSerie(a.getSerie());
        tiempoEntrenoDTO.setTiempo(a.getTiempo());
        tiempoEntrenoDTO.setTiempodescanso(a.getTiempodescanso());
        tiempoEntrenoDTO.setTiempoexigencia(a.getTiempoexigencia());
        tiempoEntrenoDTO.setDeportistaDTO(deportistaToDTO(a.getDeportistaFK()));
        tiempoEntrenoDTO.setRutinaDTO(rutinaToDTO(a.getRutinaFK()));
        return tiempoEntrenoDTO;
    }

    public EntrenadorDTO entrenadorToDTO(Entrenador a) {
        EntrenadorDTO entrenadorDTO = new EntrenadorDTO();
        entrenadorDTO.setID_Entrenador(a.getID_Entrenador());
        entrenadorDTO.setNombre(a.getNombre());
        entrenadorDTO.setApellido(a.getApellido());
        entrenadorDTO.setCedula(a.getCedula());
        entrenadorDTO.setCiudad(a.getCiudad());
        entrenadorDTO.setContraseña(a.getContraseña());
        entrenadorDTO.setFechaNacimiento(a.getFechaNacimiento());
        entrenadorDTO.setDeporteFK(deportesToDTO(a.getDeporteFK()));
        return entrenadorDTO;
    }

    public DeporteDTO deportesToDTO(Deporte a) {
        DeporteDTO deportesDTO = new DeporteDTO();
        deportesDTO.setID_Deporte(a.getID_Deporte());
        deportesDTO.setNombre(a.getNombre());
        deportesDTO.setDescripcion(a.getDescripcion());
        return deportesDTO;
    }

    public TiempoCompetenciaDTO tiempoCompetenciaToDTO(TiempoCompetencia a) {
        TiempoCompetenciaDTO competenciaDTO = new TiempoCompetenciaDTO();
        competenciaDTO.setID_tiempos(a.getID_tiempos());
        competenciaDTO.setPrueba(a.getPrueba());
        competenciaDTO.setDistancia(a.getDistancia());
        competenciaDTO.setTiempo(a.getTiempo());
        competenciaDTO.setCategoria(a.getCategoria());
        competenciaDTO.setEventoDTO(eventoToDTO(a.getEventoFK()));
        competenciaDTO.setDeportistaDTO(deportistaToDTO(a.getDeportistaFK()));
        return competenciaDTO;
    }
}
