package com.qacart.tasky.clients;

import com.qacart.tasky.model.User;
import io.restassured.response.Response;

import static com.qacart.tasky.clients.BaseClient.getRequestSpecification;

public final class UserClient {
    private UserClient() {}
    public static Response loginApi(User user) {
        return getRequestSpecification()
                .body(user)
                .when()
                .post("/auth/login")
                .then()
                .extract().response();
    }
}
