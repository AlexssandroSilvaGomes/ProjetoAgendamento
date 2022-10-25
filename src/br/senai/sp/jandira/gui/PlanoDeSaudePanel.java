package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PlanoDeSaudePanel extends javax.swing.JPanel {
    
    private int linha;
    
    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        ButtonPlanoDeSaudeExcluir = new javax.swing.JButton();
        ButtonPlanoDeSaudeEditar = new javax.swing.JButton();
        ButtonPlanoDeSaudeAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        ScrollPlanoDeSaude.setPreferredSize(new java.awt.Dimension(1020, 270));

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollPlanoDeSaude.setViewportView(tablePlanoDeSaude);

        add(ScrollPlanoDeSaude);
        ScrollPlanoDeSaude.setBounds(30, 30, 1020, 270);

        ButtonPlanoDeSaudeExcluir.setBackground(new java.awt.Color(255, 0, 51));
        ButtonPlanoDeSaudeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        ButtonPlanoDeSaudeExcluir.setToolTipText("Utilizado Para Excluir Uma Especialidade da Tabela");
        ButtonPlanoDeSaudeExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanoDeSaudeExcluirActionPerformed(evt);
            }
        });
        add(ButtonPlanoDeSaudeExcluir);
        ButtonPlanoDeSaudeExcluir.setBounds(820, 310, 70, 60);

        ButtonPlanoDeSaudeEditar.setBackground(new java.awt.Color(51, 102, 255));
        ButtonPlanoDeSaudeEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        ButtonPlanoDeSaudeEditar.setToolTipText("Utilizado Para Alterar Uma Especialidade Que Já Está na Tabela");
        ButtonPlanoDeSaudeEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanoDeSaudeEditarActionPerformed(evt);
            }
        });
        add(ButtonPlanoDeSaudeEditar);
        ButtonPlanoDeSaudeEditar.setBounds(900, 310, 70, 60);

        ButtonPlanoDeSaudeAdicionar.setBackground(new java.awt.Color(51, 153, 0));
        ButtonPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        ButtonPlanoDeSaudeAdicionar.setToolTipText("Utilizado Para Adicionar Outra Especialidade");
        ButtonPlanoDeSaudeAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanoDeSaudeAdicionarActionPerformed(evt);
            }
        });
        add(ButtonPlanoDeSaudeAdicionar);
        ButtonPlanoDeSaudeAdicionar.setBounds(980, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPlanoDeSaudeExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanoDeSaudeExcluirActionPerformed
        
        if (getLinha() != -1) {
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja excluir!",
                    "Atenção!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonPlanoDeSaudeExcluirActionPerformed
    
    private void editarPlanoDeSaude() {
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanosDeSaudeDialog planoDeSaudeDialog = new PlanosDeSaudeDialog(null, true, OperacaoEnum.EDITAR, planoDeSaude);
        
        planoDeSaudeDialog.setVisible(true);
        
        preencherTabela();
    }
    
    private void excluirPlanoDeSaude() {
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
    
    private Integer getCodigo() {
        String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void ButtonPlanoDeSaudeEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanoDeSaudeEditarActionPerformed
        
        if (getLinha() != -1) {
            editarPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja editar!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonPlanoDeSaudeEditarActionPerformed

    private void ButtonPlanoDeSaudeAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanoDeSaudeAdicionarActionPerformed
        PlanosDeSaudeDialog planosDeSaudeDialog = new PlanosDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planosDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_ButtonPlanoDeSaudeAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPlanoDeSaudeAdicionar;
    private javax.swing.JButton ButtonPlanoDeSaudeEditar;
    private javax.swing.JButton ButtonPlanoDeSaudeExcluir;
    private javax.swing.JScrollPane ScrollPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabela() {
        
        tablePlanoDeSaude.setModel(PlanoDeSaudeDAO.getPlanosDeSaudeModel());
        ajustarTabela();
        
    }
    
    private void ajustarTabela() {
        
        //impedir que o usuario movimente as colunas
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        
        //bloquear a edição das celulas
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);
        
        //definir a largura das colunas
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(217);
        tablePlanoDeSaude.getColumnModel().getColumn(4).setPreferredWidth(200);
    
    }

}
