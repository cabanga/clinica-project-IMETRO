/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOA;

import MODEL.DBConnection;
import MODEL.MedicoModel;
import MODEL.PagamentoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author joao.c
 */
public class AtendimentoDao {
    private Connection conn;

    public AtendimentoDao() {
        this.conn = new DBConnection().getConnection();
    }
    
    public boolean Create(PagamentoModel _pagamento, MedicoModel _medico){
        String sql = "INSERT INTO atendimentos " +
            "(valor, estado," +
            "id_paciente, nome, bilhete_identidade, morada, idade,"+
            "id_medico, nome_medico, especialidade)" +
            " VALUES (?,?,?,?,?,?,?,?,?,?)";
    
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1,_pagamento.getValor());
            stmt.setString(2,_pagamento.getNovo_estado());
            
            stmt.setInt(3,_pagamento.getId_paciente());
            stmt.setString(4,_pagamento.getNome());
            stmt.setString(5,_pagamento.getBilhete_identidade());
            stmt.setString(6,_pagamento.getMorada());
            stmt.setInt(7,_pagamento.getIdade());
            
            stmt.setInt(8,_medico.getId_medico());
            stmt.setString(9,_medico.getNome());
            stmt.setString(10,_medico.getEspecialidade());

            stmt.execute();
            stmt.close();
             
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }  
      
}
