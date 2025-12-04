package ma.ws.jaxrs.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import ma.ws.jaxrs.repositories.CompteRepository;
import ma.ws.jaxrs.entities.CompteListWrapper;

import org.springframework.beans.factory.annotation.Autowired;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {

    @Autowired
    private CompteRepository repo;

    @GET @Path("/comptes")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CompteListWrapper getComptes() {
        return new CompteListWrapper(repo.findAll());
    }
}

