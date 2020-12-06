package com.josemar.rest.client;

import dev.swapi.model.FilmSwapi;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/films")
@RegisterRestClient
public interface FilmRestClient {

    @GET
    @Path("/{id}")
    FilmSwapi getFilm(@PathParam Long id);

}
