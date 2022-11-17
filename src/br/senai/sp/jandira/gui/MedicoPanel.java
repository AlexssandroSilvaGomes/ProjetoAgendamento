package br.senai.sp.jandira.gui;

public class MedicoPanel extends javax.swing.JPanel {

    public MedicoPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        ButtonMedicosExcluir = new javax.swing.JButton();
        ButtonMedicosEditar = new javax.swing.JButton();
        ButtonMedicosAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        ScrollMedicos.setPreferredSize(new java.awt.Dimension(1020, 270));

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollMedicos.setViewportView(tableMedicos);

        add(ScrollMedicos);
        ScrollMedicos.setBounds(30, 30, 1020, 270);

        ButtonMedicosExcluir.setBackground(new java.awt.Color(255, 0, 51));
        ButtonMedicosExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        ButtonMedicosExcluir.setToolTipText("Utilizado Para Excluir Uma Especialidade da Tabela");
        ButtonMedicosExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMedicosExcluirActionPerformed(evt);
            }
        });
        add(ButtonMedicosExcluir);
        ButtonMedicosExcluir.setBounds(820, 310, 70, 60);

        ButtonMedicosEditar.setBackground(new java.awt.Color(51, 102, 255));
        ButtonMedicosEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        ButtonMedicosEditar.setToolTipText("Utilizado Para Alterar Uma Especialidade Que Já Está na Tabela");
        ButtonMedicosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMedicosEditarActionPerformed(evt);
            }
        });
        add(ButtonMedicosEditar);
        ButtonMedicosEditar.setBounds(900, 310, 70, 60);

        ButtonMedicosAdicionar.setBackground(new java.awt.Color(51, 153, 0));
        ButtonMedicosAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        ButtonMedicosAdicionar.setToolTipText("Utilizado Para Adicionar Outra Especialidade");
        ButtonMedicosAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMedicosAdicionarActionPerformed(evt);
            }
        });
        add(ButtonMedicosAdicionar);
        ButtonMedicosAdicionar.setBounds(980, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMedicosExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMedicosExcluirActionPerformed

    }//GEN-LAST:event_ButtonMedicosExcluirActionPerformed

    private void ButtonMedicosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMedicosEditarActionPerformed

    }//GEN-LAST:event_ButtonMedicosEditarActionPerformed

    private void ButtonMedicosAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMedicosAdicionarActionPerformed

    }//GEN-LAST:event_ButtonMedicosAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMedicosAdicionar;
    private javax.swing.JButton ButtonMedicosEditar;
    private javax.swing.JButton ButtonMedicosExcluir;
    private javax.swing.JScrollPane ScrollMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
}
