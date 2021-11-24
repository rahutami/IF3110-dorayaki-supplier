package com.dorayakisupplier;

import com.dorayakisupplier.model.DorayakiData;
import com.dorayakisupplier.model.VariantList;
import com.dorayakisupplier.DatabaseConnection;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@WebService
public class DorayakiSupplierImpl implements DorayakiSupplier{

    @WebMethod
    public void requestDorayaki(int idDorayaki, String namaDorayaki, int jumlah, XMLGregorianCalendar requestTime, Holder<Integer> code, Holder<String> message, Holder<DorayakiData> data) {
        Connection conn = DatabaseConnection.getConnection();
        try (PreparedStatement ps1 = conn.prepareStatement("INSERT into log_request(ip, endpoint, timestamp) value(?, ?, ?)")) {
            ps1.setString(1, "127.1.0.1");
            ps1.setString(2, "test");
            ps1.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @WebMethod
    public void getStatusRequest(XMLGregorianCalendar requestTime, Holder<Integer> code, Holder<String> message, Holder<DorayakiData> data) {

    }

    @WebMethod
    public void getListVariant(XMLGregorianCalendar requestTime, Holder<Integer> code, Holder<String> message, Holder<VariantList> data) {

    }
}
