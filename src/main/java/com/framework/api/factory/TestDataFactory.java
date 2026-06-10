package com.framework.api.factory;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestDataFactory {

    public static String getCreatePickupPayload() {
        return read("src/test/resources/testdata/dhl/create-pickup.json");
    }

    public static String getCreateShipmentPayload() {
        return read("src/test/resources/testdata/dhl/create-shipment.json");
    }

    public static String getUploadInvoicePayload() {
        return read("src/test/resources/testdata/dhl/upload-invoice-data.json");
    }

    private static String read(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}