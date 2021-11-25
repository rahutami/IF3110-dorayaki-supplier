package com.dorayakisupplier.repository;

import java.sql.*;

//import com.dorayakisupplier.model.Variant;
//import com.dorayakisupplier.model.VariantList;

import java.time.LocalDateTime;

public class DatabaseConnection {
    private static Connection conn = null;

    static
    {
        String url = "jdbc:mysql://localhost:3306/pabriknew?useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String pass = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void main(String[] args) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        String query = "SELECT * FROM dorayaki";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        PreparedStatement ps1 = conn.prepareStatement("INSERT into log_request(ip, endpoint, timestamp) value(?, ?, ?)");
        ps1.setString(1, "127.1.0.1");
        ps1.setString(2, "test");
        ps1.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

        int result = ps1.executeUpdate();
        //        List<Variant> ls = new ArrayList();
//
//        while (rs.next()) {
//            Variant var = new Variant();
//            var.setIdDorayaki(rs.getInt("id"));
//            var.setNamaDorayaki(rs.getString("nama"));
//        }

        System.out.println(rs);
    }

}

