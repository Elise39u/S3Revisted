package com.example;

import Models.Music;
import io.smallrye.common.annotation.Blocking;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/Music")
public class MusicResource {

    @RestClient
    MusicService musicService;

    @GET
    @Path("/id/{id}")
    @Blocking
    public Set<Music> id(String id) {
        return musicService.getById(id);
    }

    @GET
    @Path("/id-async/{id}")
    public CompletionStage<Set<Music>> idAsync(String id) {
        return musicService.getIdByAsync(id);
    }
}
