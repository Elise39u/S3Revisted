package com.example;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;

public class MusicResourceTest {

    @Test
    public void testMusicIdEndPoint() {
        given()
                .when().get("/Music/id/1")
                .then()
                .statusCode(404);
    }

    @Test
    public void testMusicIdAsyncEndPoint() {
        given()
                .when().get("/Music/id-async/1")
                .then()
                .statusCode(404);
    }
}
