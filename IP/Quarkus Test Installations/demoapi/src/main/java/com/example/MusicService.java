package com.example;

import Models.Music;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/Music")
@RegisterRestClient
public interface MusicService {

    @GET
    Set<Music> getById(@QueryParam("id") String id);

    @GET
    CompletionStage<Set<Music>> getIdByAsync(@QueryParam("id") String id);

    //@ClientExceptionMapper
    static RuntimeException toExpection(Response response) {
        if(response.getStatus() == 500) {
            return new RuntimeException("Oh oh the Monkeys broke something and gave you a 500");
        }
        return null;
    }
}
