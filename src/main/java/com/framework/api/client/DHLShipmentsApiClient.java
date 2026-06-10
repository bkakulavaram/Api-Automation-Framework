package com.framework.api.client;

import io.restassured.response.Response;

public class DHLShipmentsApiClient extends DHLBaseClient {

    public Response createShipment(String requestBody) {

        return requestSpec()
                .queryParam("strictValidation", false)
                .queryParam("bypassPLTError", false)
                .queryParam("validateDataOnly", false)
                .body(requestBody)
                .when()
                .post("/shipments")
                .then()
                .extract()
                .response();
    }

    public Response uploadInvoiceData(String shipmentTrackingNumber,
                                      String requestBody) {

        return requestSpec()
                .pathParam("shipmentTrackingNumber", shipmentTrackingNumber)
                .body(requestBody)
                .when()
                .patch("/shipments/{shipmentTrackingNumber}/upload-invoice-data")
                .then()
                .extract()
                .response();
    }
}