/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOA;

import MODEL.DBConnection;
import MODEL.MedicoModel;
import MODEL.PacienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author joao.c
 */
public class MedicoDao {
    private Connection conn;

    public MedicoDao() {
        this.conn = new DBConnection().getConnection();
    }
    
    public ArrayList<MedicoModel> getAll(){

        try {
            ArrayList<MedicoModel> medicos = new ArrayList<MedicoModel>();
            
            PreparedStatement stmt = this.conn.
            prepareStatement("SELECT * FROM medicos");
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                MedicoModel medico = new MedicoModel();
                medico.setId_medico(response.getInt("id_medico"));
                medico.setNome(response.getString("nome"));
                medico.setEspecialidade(response.getString("especialidade"));

                medicos.add(medico);
            }
            response.close();
            stmt.close();
            return medicos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
    
}
