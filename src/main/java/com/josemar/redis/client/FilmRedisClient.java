package com.josemar.redis.client;

import dev.swapi.model.FilmSwapi;
import io.quarkus.redis.client.RedisClient;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FilmRedisClient {

    @Inject
    RedisClient redisClient;

    FilmSwapi set ()


}
