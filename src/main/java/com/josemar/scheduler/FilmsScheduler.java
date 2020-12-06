package com.josemar.scheduler;

import com.josemar.service.FilmService;
import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FilmsScheduler {

    @Inject
    private FilmService filmService;

    @Scheduled(every = "10s")
    public void carregarFilmes(){
        filmService.carregarFilmes();
    }
}
