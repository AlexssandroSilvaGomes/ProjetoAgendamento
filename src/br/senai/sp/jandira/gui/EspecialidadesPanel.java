package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;

    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarlistaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        ButtonEspecialidadesExcluir = new javax.swing.JButton();
        ButtonEspecialidadesEditar = new javax.swing.JButton();
        ButtonEspecialidadesAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1090, 380));
        setLayout(null);

        ScrollEspecialidades.setPreferredSize(new java.awt.Dimension(1020, 270));

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollEspecialidades.setViewportView(tableEspecialidades);

        add(ScrollEspecialidades);
        ScrollEspecialidades.setBounds(30, 30, 1020, 270);

        ButtonEspecialidadesExcluir.setBackground(new java.awt.Color(255, 0, 51));
        ButtonEspecialidadesExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/delete32.png"))); // NOI18N
        ButtonEspecialidadesExcluir.setToolTipText("Utilizado Para Excluir Uma Especialidade da Tabela");
        ButtonEspecialidadesExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadesExcluirActionPerformed(evt);
            }
        });
        add(ButtonEspecialidadesExcluir);
        ButtonEspecialidadesExcluir.setBounds(820, 310, 70, 60);

        ButtonEspecialidadesEditar.setBackground(new java.awt.Color(51, 102, 255));
        ButtonEspecialidadesEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit32.png"))); // NOI18N
        ButtonEspecialidadesEditar.setToolTipText("Utilizado Para Alterar Uma Especialidade Que Já Está na Tabela");
        ButtonEspecialidadesEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadesEditarActionPerformed(evt);
            }
        });
        add(ButtonEspecialidadesEditar);
        ButtonEspecialidadesEditar.setBounds(900, 310, 70, 60);

        ButtonEspecialidadesAdicionar.setBackground(new java.awt.Color(51, 153, 0));
        ButtonEspecialidadesAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus32.png"))); // NOI18N
        ButtonEspecialidadesAdicionar.setToolTipText("Utilizado Para Adicionar Outra Especialidade");
        ButtonEspecialidadesAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadesAdicionarActionPerformed(evt);
            }
        });
        add(ButtonEspecialidadesAdicionar);
        ButtonEspecialidadesAdicionar.setBounds(980, 310, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEspecialidadesExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadesExcluirActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ButtonEspecialidadesExcluirActionPerformed

    private void editarEspecialidade() {
        Especialidade especialidade = EspecialidadeDAO.getEspecialidades(getCodigo());

        EspecialidadesDialog especialidadeDialog = new EspecialidadesDialog(null, true, especialidade); //READ

        especialidadeDialog.setVisible(true);

        preencherTabela();
    }

    private void excluirEspecialidade() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    private void ButtonEspecialidadesEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadesEditarActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja editar!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ButtonEspecialidadesEditarActionPerformed

    private void ButtonEspecialidadesAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadesAdicionarActionPerformed
        EspecialidadesDialog especialidadesDialog = new EspecialidadesDialog(null, true);
        especialidadesDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_ButtonEspecialidadesAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEspecialidadesAdicionar;
    private javax.swing.JButton ButtonEspecialidadesEditar;
    private javax.swing.JButton ButtonEspecialidadesExcluir;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
        ajustarTabela();

    }

    private void ajustarTabela() {

        //impedir que o usuario movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das celulas
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //definir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(200);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(517);

    }
}
