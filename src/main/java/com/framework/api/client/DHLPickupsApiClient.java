package com.framework.api.client;

import io.restassured.response.Response;

import java.util.Map;

public class DHLPickupsApiClient extends DHLBaseClient {

    public Response createPickup(String requestBody) {

        return requestSpec()
                .body(requestBody)
                .when()
                .post("/pickups")
                .then()
                .extract()
                .response();
    }

    public Response cancelPickup(String dispatchConfirmationNumber) {

        return cancelPickup(
                dispatchConfirmationNumber,
                "Fred Brent",
                "Unplanned leave"
        );
    }

    public Response cancelPickup(String dispatchConfirmationNumber,
                                 String requestorName,
                                 String reason) {

        return requestSpec()
                .pathParam("dispatchConfirmationNumber", dispatchConfirmationNumber)
                .queryParams(Map.of(
                        "requestorName", requestorName,
                        "reason", reason
                ))
                .when()
                .delete("/pickups/{dispatchConfirmationNumber}")
                .then()
                .extract()
                .response();
    }
}