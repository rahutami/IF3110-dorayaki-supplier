package com.dorayakisupplier.repository;

import com.dorayakisupplier.DatabaseConnection;
import com.dorayakisupplier.model.Variant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VariantRepository {
    public static final Connection conn = DatabaseConnection.getConnection();

    public List<Variant> getAllVariant() throws SQLException {
        List<Variant> dorayakis = new ArrayList<>();
        String sql = "SELECT * FROM dorayaki";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        while (rs.next()){
            Variant dorayaki = new Variant();
            dorayaki.setId(rs.getInt("id"));
            dorayaki.setNamaDorayaki(rs.getString("nama"));
            dorayaki.setDeskripsi(rs.getString("deskripsi"));
            dorayakis.add(dorayaki);
        }
        return dorayakis;
    }


}
