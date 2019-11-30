/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOA;

import MODEL.DBConnection;
import MODEL.RastreioModel;
import java.sql.*;

/**
 *
 * @author joao.c
 */
public class RastreioDao {
    private Connection conn;

    public RastreioDao() {
        this.conn = new DBConnection().getConnection();
    }
    
    public boolean Create(RastreioModel _rastreio){
        String sql = "INSERT INTO rastreios " +
            "(temperatura, peso, pressao, estado, id_paciente)" +
            " VALUES (?,?,?,?,?)";
    
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,_rastreio.getTemperatura());
            stmt.setInt(2,_rastreio.getPeso());
            stmt.setInt(3,_rastreio.getPressao());
            stmt.setString(4,_rastreio.getEstado());
            stmt.setInt(5,_rastreio.getId_paciente());

            stmt.execute();
            stmt.close();
             
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    } 
    
    
    
    
    
    
    
    
    
}
