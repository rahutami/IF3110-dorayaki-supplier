package com.dorayakisupplier.repository;

import com.dorayakisupplier.model.LogRequest;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.sql.Timestamp.*;

public class LogRequestRepository {
    public static final Connection conn = DatabaseConnection.getConnection();

    public int insertLog(LogRequest logRequest) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT into log_request(ip, endpoint, timestamp) value(?, ?, ?)");
        ps.setString(1, logRequest.getIpAddress());
        ps.setString(2, logRequest.getEndpoint());
        ps.setTimestamp(3, logRequest.getTimestamp());

        return ps.executeUpdate();
    }

    public int countLog(String ipAddress, String endpoint) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT count(*) AS rowcount from log_request where timestamp > ? and ip = ? and endpoint = ?");
        LocalDateTime ldt = LocalDateTime.now();
        ps.setTimestamp(1, valueOf(ldt.minus(1, ChronoUnit.MINUTES)));
        ps.setString(2, ipAddress);
        ps.setString(3, endpoint);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt("rowcount");
    }
}
