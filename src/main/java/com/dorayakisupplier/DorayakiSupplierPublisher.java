package com.dorayakisupplier;

import javax.xml.ws.Endpoint;

public class DorayakiSupplierPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8124/dorayakiservice", new DorayakiSupplierImpl());
    }
}
