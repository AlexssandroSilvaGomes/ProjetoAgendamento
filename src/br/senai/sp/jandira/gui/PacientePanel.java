package br.senai.sp.jandira.gui;

public class PacientePanel extends javax.swing.JPanel {

    public PacientePanel() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPacientes = new javax.swing.JScrollPane();
        tablepacientes = new javax.swing.JTable();
        ButtonPacientesExcluir = new javax.swing.JButton();
        ButtonPacientesEditar = new javax.swing.JButton();
        ButtonPacientesAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        ScrollPacientes.setPreferredSize(new java.awt.Dimension(1020, 270));

        tablepacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollPacientes.setViewportView(tablepacientes);

        add(ScrollPacientes);
        ScrollPacientes.setBounds(30, 30, 1020, 270);

        ButtonPacientesExcluir.setBackground(new java.awt.Color(255, 0, 51));
        ButtonPacientesExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        ButtonPacientesExcluir.setToolTipText("Utilizado Para Excluir Uma Especialidade da Tabela");
        ButtonPacientesExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPacientesExcluirActionPerformed(evt);
            }
        });
        add(ButtonPacientesExcluir);
        ButtonPacientesExcluir.setBounds(820, 310, 70, 60);

        ButtonPacientesEditar.setBackground(new java.awt.Color(51, 102, 255));
        ButtonPacientesEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        ButtonPacientesEditar.setToolTipText("Utilizado Para Alterar Uma Especialidade Que Já Está na Tabela");
        ButtonPacientesEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPacientesEditarActionPerformed(evt);
            }
        });
        add(ButtonPacientesEditar);
        ButtonPacientesEditar.setBounds(900, 310, 70, 60);

        ButtonPacientesAdicionar.setBackground(new java.awt.Color(51, 153, 0));
        ButtonPacientesAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        ButtonPacientesAdicionar.setToolTipText("Utilizado Para Adicionar Outra Especialidade");
        ButtonPacientesAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPacientesAdicionarActionPerformed(evt);
            }
        });
        add(ButtonPacientesAdicionar);
        ButtonPacientesAdicionar.setBounds(980, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPacientesExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPacientesExcluirActionPerformed

    }//GEN-LAST:event_ButtonPacientesExcluirActionPerformed

    private void ButtonPacientesEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPacientesEditarActionPerformed

    }//GEN-LAST:event_ButtonPacientesEditarActionPerformed

    private void ButtonPacientesAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPacientesAdicionarActionPerformed

    }//GEN-LAST:event_ButtonPacientesAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPacientesAdicionar;
    private javax.swing.JButton ButtonPacientesEditar;
    private javax.swing.JButton ButtonPacientesExcluir;
    private javax.swing.JScrollPane ScrollPacientes;
    private javax.swing.JTable tablepacientes;
    // End of variables declaration//GEN-END:variables
}
