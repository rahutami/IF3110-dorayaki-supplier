package com.dorayakisupplier.repository;

import com.dorayakisupplier.model.RequestDorayaki;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class RequestRepository {
    public static final Connection conn = DatabaseConnection.getConnection();

    public int insertRequest(RequestDorayaki reqDorayaki) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT into request(id_dorayaki, jumlah, status, timestamp) value(?, ?, 'dipesan', ?)");
        ps.setInt(1, reqDorayaki.getIdDorayaki());
        ps.setInt(2, reqDorayaki.getAmount());
        ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

        return ps.executeUpdate();
    }
}
