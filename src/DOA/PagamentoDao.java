/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOA;

import MODEL.DBConnection;
import MODEL.MedicoModel;
import MODEL.PagamentoModel;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author joao.c
 */
public class PagamentoDao {
    private Connection conn;

    public PagamentoDao() {
        this.conn = new DBConnection().getConnection();
    }
    

    public boolean Create(PagamentoModel _pagamento){
        String sql = "INSERT INTO pagamentos " +
            "(valor, novo_estado, nome, bilhete_identidade, morada, idade, was_paid, id_paciente, was_attended)" +
            " VALUES (?,?,?,?,?,?,?,?,?)";
    
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,_pagamento.getValor());
            stmt.setString(2,_pagamento.getNovo_estado());
            stmt.setString(3,_pagamento.getNome());
            stmt.setString(4,_pagamento.getBilhete_identidade());
            stmt.setString(5,_pagamento.getMorada());
            stmt.setInt(6,_pagamento.getIdade());
            stmt.setBoolean(7, true);
            stmt.setInt(8,_pagamento.getId_paciente());
            stmt.setBoolean(9, false);

            stmt.execute();
            stmt.close();
             
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    } 
    
    public boolean Update(PagamentoModel _pagamento){
        String sql = "UPDATE pagamentos SET was_attended=? WHERE id_paciente=?";
    
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, true);
            stmt.setInt(2,_pagamento.getId_paciente());

            stmt.execute();
            stmt.close();
             
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    } 
    
    public ArrayList<MedicoModel> getAllMedicos(){
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
    
    public ArrayList<PagamentoModel> getAllToAttended(){

        try {
            ArrayList<PagamentoModel> pagamentos = new ArrayList<PagamentoModel>();
            
            PreparedStatement stmt = this.conn.
            prepareStatement("SELECT * FROM pagamentos WHERE was_attended = FALSE");
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                PagamentoModel paciente = new PagamentoModel();
                
                paciente.setId_pagamento(response.getInt("id_pagamento"));
                paciente.setValor(response.getInt("valor"));
                paciente.setNovo_estado(response.getString("novo_estado"));
                
                paciente.setId_paciente(response.getInt("id_paciente"));
                paciente.setNome(response.getString("nome"));
                paciente.setBilhete_identidade(response.getString("bilhete_identidade"));
                paciente.setMorada(response.getString("morada"));
                paciente.setIdade(response.getInt("idade"));
                paciente.setWas_paid(response.getBoolean("was_paid"));

                pagamentos.add(paciente);
            }
            response.close();
            stmt.close();
            return pagamentos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<PagamentoModel> getAll(){

        try {
            ArrayList<PagamentoModel> pagamentos = new ArrayList<PagamentoModel>();
            
            PreparedStatement stmt = this.conn.
            prepareStatement("SELECT * FROM pagamentos");
            ResultSet response = stmt.executeQuery();

            while (response.next()) {
                PagamentoModel paciente = new PagamentoModel();
                
                paciente.setId_pagamento(response.getInt("id_pagamento"));
                paciente.setValor(response.getInt("valor"));
                paciente.setNovo_estado(response.getString("novo_estado"));
                
                paciente.setId_paciente(response.getInt("id_paciente"));
                paciente.setNome(response.getString("nome"));
                paciente.setBilhete_identidade(response.getString("bilhete_identidade"));
                paciente.setMorada(response.getString("morada"));
                paciente.setIdade(response.getInt("idade"));
                paciente.setWas_paid(response.getBoolean("was_paid"));

                pagamentos.add(paciente);
            }
            response.close();
            stmt.close();
            return pagamentos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
    
    
    
    
}
