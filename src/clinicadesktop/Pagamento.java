/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadesktop;

import DOA.PacienteDao;
import DOA.PagamentoDao;
import MODEL.PacienteModel;
import MODEL.PagamentoModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author joao.c
 */
public class Pagamento extends javax.swing.JPanel {

    DefaultComboBoxModel paciente_list = new DefaultComboBoxModel();
    private JFrame frame;

    public Pagamento() {
        initComponents();
        for(PacienteModel _paciente : new PacienteDao().getAll()){
            paciente_list.addElement(_paciente);
        }
        NamePaciente.setModel(paciente_list);
        DefaultComboBoxModel status_list = new DefaultComboBoxModel();
        status_list.addElement("Moderado");
        status_list.addElement("Urgente");
        status_list.addElement("Grave");

        EstadoSelect.setModel(status_list);
        
        frame  = new JFrame();
        frame.setSize(1500, 900);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ValorAPagarInput = new javax.swing.JTextField();
        NomePacienteLabel = new javax.swing.JLabel();
        TemperatursLabel = new javax.swing.JLabel();
        RegistarBtn = new javax.swing.JButton();
        CancelarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NamePaciente = new javax.swing.JComboBox();
        EstadoLabel = new javax.swing.JLabel();
        EstadoSelect = new javax.swing.JComboBox();

        ValorAPagarInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAPagarInputActionPerformed(evt);
            }
        });

        NomePacienteLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NomePacienteLabel.setText("Nome do paciente");

        TemperatursLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TemperatursLabel.setText("Valor a pagar");

        RegistarBtn.setBackground(new java.awt.Color(0, 204, 0));
        RegistarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistarBtn.setText("Registar");
        RegistarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarBtnActionPerformed(evt);
            }
        });

        CancelarBtn.setBackground(new java.awt.Color(255, 255, 255));
        CancelarBtn.setText("Cancelar");
        CancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("FAZER PAGAMENTO");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logotipo.png"))); // NOI18N

        NamePaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NamePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamePacienteActionPerformed(evt);
            }
        });

        EstadoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EstadoLabel.setText("Estado");

        EstadoSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EstadoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TemperatursLabel)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(NomePacienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NamePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ValorAPagarInput, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RegistarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CancelarBtn))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(EstadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EstadoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomePacienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TemperatursLabel)
                            .addComponent(ValorAPagarInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EstadoLabel)
                            .addComponent(EstadoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegistarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(273, 273, 273))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBtnActionPerformed
        MainClinica init = new MainClinica();
        
        frame.add(init);
        frame.setVisible(true);
    }//GEN-LAST:event_CancelarBtnActionPerformed

    private void RegistarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarBtnActionPerformed
        // TODO add your handling code here:

        try{
            PacienteModel current_paciente = (PacienteModel)NamePaciente.getSelectedItem();
            String estado = (String)EstadoSelect.getSelectedItem();
            
            int valor = Integer.parseInt(ValorAPagarInput.getText());

            PagamentoModel new_pagamento = new PagamentoModel();
            
            new_pagamento.setValor(valor);
            new_pagamento.setNovo_estado(estado) ;
            new_pagamento.setNome(current_paciente.getNome());
            new_pagamento.setBilhete_identidade(current_paciente.getBilhete_identidade());
            new_pagamento.setMorada(current_paciente.getMorada());
            new_pagamento.setIdade(current_paciente.getIdade());
            new_pagamento.setId_paciente(current_paciente.getId_paciente());

            PagamentoDao dao = new PagamentoDao();
            boolean response = dao.Create(new_pagamento);
     
            if(response){
                JOptionPane.showMessageDialog(null, "Pagamento feito com sucesso");
                initForm();
                
                MainClinica init = new MainClinica();

                frame.add(init);
                frame.setVisible(true);
            }
                  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_RegistarBtnActionPerformed

    private void ValorAPagarInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAPagarInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorAPagarInputActionPerformed

    private void NamePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamePacienteActionPerformed

    }//GEN-LAST:event_NamePacienteActionPerformed

    private void EstadoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoSelectActionPerformed

    public void initForm(){
        ValorAPagarInput.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarBtn;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JComboBox EstadoSelect;
    private javax.swing.JComboBox NamePaciente;
    private javax.swing.JLabel NomePacienteLabel;
    private javax.swing.JButton RegistarBtn;
    private javax.swing.JLabel TemperatursLabel;
    private javax.swing.JTextField ValorAPagarInput;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
