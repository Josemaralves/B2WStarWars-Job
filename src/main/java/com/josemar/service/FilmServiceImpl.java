package com.josemar.service;

import com.josemar.rest.client.FilmRestClient;
import dev.swapi.model.FilmSwapi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FilmServiceImpl implements  FilmService{

    @Inject
    @RestClient
    private FilmRestClient filmRestClient;

    @Override
    public void carregarFilmes() {
        Boolean continua = true;
        Long id = 1L;

        while(continua == true){
            try{
                FilmSwapi film = filmRestClient.getFilm(id);
            }catch(Exception e){
                continua = false;
            }
        }
    }
}
