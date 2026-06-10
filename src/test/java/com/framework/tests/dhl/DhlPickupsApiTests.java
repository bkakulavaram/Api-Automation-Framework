package com.framework.tests.dhl;

import com.framework.api.client.DHLPickupsApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DhlPickupsApiTests {

    private final DHLPickupsApiClient client =
            new DHLPickupsApiClient();

    @Test
    public void testCancelPickup() {

        Response response = client.cancelPickup("PRG296975175456");

        int status = response.getStatusCode();

        Assert.assertTrue(
                status == 200 || status == 202 || status == 204,
                "Unexpected status code: " + status
        );
    }
}