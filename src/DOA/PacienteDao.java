/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOA;

import MODEL.*;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author joao.c
 */
public class PacienteDao {
    private Connection conn;

    public PacienteDao() {
        this.conn = new DBConnection().getConnection();
    }
    
    public boolean Create(PacienteModel _paciente){
        String sql = "INSERT INTO pacientes " +
            "(nome, bilhete_identidade, morada, idade, was_paid, estado)" +
            " VALUES (?,?,?,?,?,?)";
    
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,_paciente.getNome());
            stmt.setString(2,_paciente.getBilhete_identidade());
            stmt.setString(3,_paciente.getMorada());
            stmt.setInt(4,_paciente.getIdade());
            stmt.setBoolean(5,false);
            stmt.setInt(6,_paciente.getEstado());

            stmt.execute();
            stmt.close();
             
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    public ArrayList<PacienteModel> getAll(){

        try {
            ArrayList<PacienteModel> pacientes = new ArrayList<PacienteModel>();
            
            PreparedStatement stmt = this.conn.
            prepareStatement("SELECT * FROM pacientes");
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                PacienteModel paciente = new PacienteModel();
                paciente.setId_paciente(response.getInt("id_paciente"));
                paciente.setNome(response.getString("nome"));
                paciente.setBilhete_identidade(response.getString("bilhete_identidade"));
                paciente.setMorada(response.getString("morada"));
                paciente.setIdade(response.getInt("idade"));
                paciente.setWas_paid(response.getBoolean("was_paid"));
                paciente.setEstado(response.getInt("estado"));

                pacientes.add(paciente);
            }
            response.close();
            stmt.close();
            return pacientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
    
}
