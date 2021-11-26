package com.dorayakisupplier.repository;

import com.dorayakisupplier.model.RequestDorayaki;
import com.dorayakisupplier.model.Request;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RequestRepository {
    public static final Connection conn = DatabaseConnection.getConnection();

    public int insertRequest(RequestDorayaki reqDorayaki) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT into request(id_dorayaki, jumlah, status, timestamp) value(?, ?, 'waiting', ?)");
        ps.setInt(1, reqDorayaki.getIdDorayaki());
        ps.setInt(2, reqDorayaki.getAmount());
        ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

        return ps.executeUpdate();
    }

    public List<Request> getAllRequest() throws SQLException {
        List<Request> requestList = new ArrayList<>();
        String sql = "SELECT * FROM request";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        while (rs.next()){
            Request request = new Request(rs.getInt("id_dorayaki"), rs.getInt("id"), rs.getInt("jumlah"), rs.getString("status"));
            requestList.add(request);
        }
        return requestList;
    }
}
