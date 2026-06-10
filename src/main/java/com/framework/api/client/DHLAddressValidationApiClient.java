package com.framework.api.client;

import io.restassured.response.Response;

import java.util.Map;

public class DHLAddressValidationApiClient extends DHLBaseClient {

    public Response validateAddress() {

        return validateAddress(Map.of(
                "type", "pickup",
                "countryCode", "CZ",
                "postalCode", "14800",
                "cityName", "Prague",
                "countyName", "praha",
                "strictValidation", true
        ));
    }

    public Response validateAddress(Map<String, Object> queryParams) {

        return requestSpec()
                .queryParams(queryParams)
                .when()
                .get("/address-validate")
                .then()
                .extract()
                .response();
    }
}