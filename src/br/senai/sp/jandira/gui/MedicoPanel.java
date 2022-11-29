package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {
    
    private int linha;

    public MedicoPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
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
        
        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que você deseja excluir!",
                    "atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonMedicosExcluirActionPerformed
    
    private void editarMedico() {
        Medico medico = MedicoDAO.getMedicos(getCodigo());
        
        MedicosDialog medicoDialog = new MedicosDialog(null, true, medico, OperacaoEnum.EDITAR);
        
        medicoDialog.setVisible(true);
        
        preencherTabela();
        
    }
    
    private void excluirMedico() {
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
    
    private Integer getCodigo() {
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void ButtonMedicosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMedicosEditarActionPerformed
        
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que deseja editar!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonMedicosEditarActionPerformed

    private void ButtonMedicosAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMedicosAdicionarActionPerformed
        MedicosDialog medicosDialog = new MedicosDialog(null, true, OperacaoEnum.ADICIONAR);
        medicosDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_ButtonMedicosAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMedicosAdicionar;
    private javax.swing.JButton ButtonMedicosEditar;
    private javax.swing.JButton ButtonMedicosExcluir;
    private javax.swing.JScrollPane ScrollMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        
        tableMedicos.setModel(MedicoDAO.getMedicosModel());
        ajustarTabela();
        
    }
    
    private void ajustarTabela() {
        
        //impedir que o usuario movimene as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das celulas
        tableMedicos.setDefaultEditor(Object.class, null);
        
        //Definir a largura das colunas
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(200);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(317);
    }
    
}
