package com.dorayakisupplier.repository;

import com.dorayakisupplier.model.LogRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LogRequestRepository {
    public static final Connection conn = DatabaseConnection.getConnection();

    public int insertRequest(LogRequest logRequest) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT into log_request(ip, endpoint, timestamp) value(?, ?, ?)");
        ps.setString(1, logRequest.getIpAddress());
        ps.setString(2, logRequest.getEndpoint());
        ps.setTimestamp(3, logRequest.getTimestamp());

        return ps.executeUpdate();
    }
}
