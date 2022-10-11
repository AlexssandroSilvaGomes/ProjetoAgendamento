package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.table.DefaultTableModel;


public class EspecialidadesPanel extends javax.swing.JPanel {

    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarlistaDeEspecialidades();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollEspecialidades = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtonExcluir = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 20", "Title 3", "Title 4"
            }
        ));
        ScrollEspecialidades.setViewportView(jTable1);

        add(ScrollEspecialidades);
        ScrollEspecialidades.setBounds(30, 30, 1020, 270);

        ButtonExcluir.setBackground(new java.awt.Color(255, 0, 51));
        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        ButtonExcluir.setToolTipText("Utilizado Para Excluir Uma Especialidade da Tabela");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        add(ButtonExcluir);
        ButtonExcluir.setBounds(820, 310, 70, 60);

        ButtonEditar.setBackground(new java.awt.Color(51, 102, 255));
        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        ButtonEditar.setToolTipText("Utilizado Para Alterar Uma Especialidade Que Já Está na Tabela");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });
        add(ButtonEditar);
        ButtonEditar.setBounds(900, 310, 70, 60);

        ButtonAdicionar.setBackground(new java.awt.Color(51, 153, 0));
        ButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        ButtonAdicionar.setToolTipText("Utilizado Para Adicionar Outra Especialidade");
        ButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdicionarActionPerformed(evt);
            }
        });
        add(ButtonAdicionar);
        ButtonAdicionar.setBounds(980, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdicionar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        jTable1.setModel(EspecialidadeDAO.getEspecialidadesModel());

    }
}
