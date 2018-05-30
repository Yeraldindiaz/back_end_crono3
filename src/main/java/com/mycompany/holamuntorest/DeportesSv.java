package com.mycompany.holamuntorest;

import edu.sergioArboleda.facade.DeportesFachada;
import com.mycompany.jpa.Deportes;
import org.o7planning.restfulcrud.model.DeportesDTO;
import edu.sergioArboleda.exception.ConexionException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/deportes")
public class DeportesSv {

    DeportesFachada DeportesFachada;
    ConversorDTO conversor;

    public DeportesSv() throws ConexionException {
        DeportesFachada = new DeportesFachada();
        conversor = new ConversorDTO();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<DeportesDTO> getDeportess_JSON() {
        List<Deportes> listaDeportess = DeportesFachada.findAll();
        List<DeportesDTO> DeportesDTOs = new ArrayList<>();
        for (Deportes listaDeportes : listaDeportess) {
            DeportesDTOs.add(conversor.deportesToDTO(listaDeportes));
        }
        return DeportesDTOs;
    }

    @GET
    @Path("/{usrNo}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public DeportesDTO getDeportes(@PathParam("usrNo") int usrNo) {
        return conversor.deportesToDTO(DeportesFachada.get(usrNo));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public boolean crearDeportes(Deportes usr) {
        try {
            DeportesFachada.save(usr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Deportes updateDeportes(Deportes usr) {
        return DeportesFachada.update(usr);
    }

    @DELETE
    @Path("/{usrNo}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteDeportes(@PathParam("usrNo") int usrNo) {
        Deportes u = DeportesFachada.get(usrNo);
        DeportesFachada.delete(u);
    }

}
