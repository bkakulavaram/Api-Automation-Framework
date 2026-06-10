package com.framework.tests.dhl;

import com.framework.api.client.DHLAddressValidationApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DHLAddressValidationApiTests {

    private final DHLAddressValidationApiClient client =
            new DHLAddressValidationApiClient();

    @Test
    public void testValidateAddress() {

        Response response = client.validateAddress();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}