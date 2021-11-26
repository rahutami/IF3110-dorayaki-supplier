package com.dorayakisupplier;
import com.dorayakisupplier.model.Variant;
import com.dorayakisupplier.service.*;

import javax.xml.ws.Endpoint;
import java.sql.SQLException;

public class Publisher {
    public static void main(String[] args) throws SQLException {
        Endpoint.publish("http://localhost:8080/hello", new Hello());
        Endpoint.publish("http://localhost:8080/variant", new GetVariantService());
        Endpoint.publish("http://localhost:8080/request-dorayaki", new RequestDorayakiService());
        Endpoint.publish("http://localhost:8080/status", new StatusRequestService());
        Endpoint.publish("http://localhost:8080/test", new GetVariantService());
    }
}
