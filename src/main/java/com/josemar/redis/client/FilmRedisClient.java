package com.josemar.redis.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.swapi.model.FilmSwapi;
import io.quarkus.redis.client.RedisClient;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;

@Singleton
public class FilmRedisClient {

    @Inject
    RedisClient redisClient;

    void set(FilmSwapi film){
        try{
            String jsonFilm = new ObjectMapper().writeValueAsString(film);
            redisClient.set(Arrays.asList(film.getId().toString(), jsonFilm));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
