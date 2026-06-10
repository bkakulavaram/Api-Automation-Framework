package com.framework.tests.dhl;

import com.framework.api.client.DHLShipmentsApiClient;
import com.framework.api.factory.TestDataFactory;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DHLShipmentsApiTests {

    private final DHLShipmentsApiClient client =
            new DHLShipmentsApiClient();

    @Test(priority = 1)
    public void testCreateShipment() {

        String payload = TestDataFactory.getCreateShipmentPayload();

        Response response = client.createShipment(payload);

        int status = response.getStatusCode();

        Assert.assertTrue(
                status == 200 || status == 201,
                "Unexpected status: " + status
        );
    }

    @Test(priority = 2)
    public void testUploadInvoiceData() {

        String payload = TestDataFactory.getUploadInvoicePayload();

        Response response = client.uploadInvoiceData(
                "8901234567",
                payload
        );

        int status = response.getStatusCode();

        Assert.assertTrue(
                status == 200 || status == 201,
                "Unexpected status: " + status
        );
    }
}