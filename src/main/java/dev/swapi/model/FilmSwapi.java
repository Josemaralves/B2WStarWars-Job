package dev.swapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmSwapi {

    private String title;
    private Long id;

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}
