package com.dorayakisupplier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

//import com.dorayakisupplier.model.Variant;
//import com.dorayakisupplier.model.VariantList;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static Connection conn = null;

    static
    {
        String url = "jdbc:mysql://localhost:3306/pabriknew";
        String user = "root";
        String pass = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
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

