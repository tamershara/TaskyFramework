package com.qacart.tasky.clients;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static com.qacart.tasky.config.ConfigFactory.getConfig;
import static io.restassured.RestAssured.given;

public final class BaseClient {
    private BaseClient() {}

    public static RequestSpecification getRequestSpecification() {
        return given()
                .baseUri(getConfig().url())
                .contentType(ContentType.JSON);
    }

    public static RequestSpecification getRequestSpecificationWithAuth(String accessToken) {
        return getRequestSpecification()
                .auth().oauth2(accessToken);
    }
}
