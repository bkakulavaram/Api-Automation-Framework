package com.framework.api.client;

import com.framework.api.constants.DHLApiConstants;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;

import java.util.UUID;

public class DHLBaseClient {

    protected RequestSpecification requestSpec() {
        return RestAssured
                .given()
                .baseUri(DHLApiConstants.BASE_URL)
                .headers(defaultHeaders());
    }

    private Headers defaultHeaders() {
        return new Headers(
                new Header("Message-Reference", UUID.randomUUID().toString()),
                new Header("Message-Reference-Date", DHLApiConstants.MESSAGE_REFERENCE_DATE),
                new Header("Plugin-Name", "AutomationFramework"),
                new Header("Plugin-Version", "1.0"),
                new Header("Shipping-System-Platform-Name", "Windows"),
                new Header("Shipping-System-Platform-Version", "11"),
                new Header("Webstore-Platform-Name", "Framework"),
                new Header("Webstore-Platform-Version", "1.0"),
                new Header("x-version", "1"),
                new Header("Accept", "application/json"),
                new Header("Content-Type", "application/json")
        );
    }
}