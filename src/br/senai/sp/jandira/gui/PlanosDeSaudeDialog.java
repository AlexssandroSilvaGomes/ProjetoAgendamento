package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanosDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanosDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        this.operacao = operacao;

        preencherTitulo();

    }

    public PlanosDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao,
            PlanoDeSaude p) {

        super(parent, modal);
        initComponents();

        this.operacao = operacao;

        planoDeSaude = p;

        preencherTitulo();

        preencherFormulario();

    }

    private void preencherFormulario() {
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldNomeOperadora.setText(planoDeSaude.getOperadora());
        textFieldNomeCategoria.setText(planoDeSaude.getCategoria());
        textFieldNumeroPlano.setText(planoDeSaude.getNumero());
        textFieldValidadePlano.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelTitulo.setText("   Planos de Saude - " + operacao);
        if (operacao == OperacaoEnum.EDITAR) {

            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit.png")));

        } else {

            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus64px.png")));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelNomeOperadora = new javax.swing.JLabel();
        labelNumeroPlano = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeOperadora = new javax.swing.JTextField();
        textFieldNumeroPlano = new javax.swing.JTextField();
        buttonEspecialidadesCancelar = new javax.swing.JButton();
        buttonEspecialidadesSalvar = new javax.swing.JButton();
        labelNomeCategoria = new javax.swing.JLabel();
        textFieldNomeCategoria = new javax.swing.JTextField();
        textFieldValidadePlano = new javax.swing.JTextField();
        labelValidadePlano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 460));
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(51, 51, 51));
        panelHeader.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus64px.png"))); // NOI18N
        labelTitulo.setText("   Planos de Saude - ADICIONAR");
        panelHeader.add(labelTitulo);
        labelTitulo.setBounds(100, 20, 510, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 700, 100);

        panelMain.setBackground(new java.awt.Color(204, 204, 204));
        panelMain.setPreferredSize(new java.awt.Dimension(700, 280));
        panelMain.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhe de Plano de Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(20, 20, 190, 20);

        labelNomeOperadora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomeOperadora.setText("Nome da Operadora:");
        jPanel1.add(labelNomeOperadora);
        labelNomeOperadora.setBounds(20, 80, 190, 20);

        labelNumeroPlano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNumeroPlano.setText("Número do Plano de Saúde:");
        jPanel1.add(labelNumeroPlano);
        labelNumeroPlano.setBounds(20, 200, 190, 20);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 40, 130, 30);

        textFieldNomeOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeOperadoraActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldNomeOperadora);
        textFieldNomeOperadora.setBounds(20, 100, 300, 30);

        textFieldNumeroPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroPlanoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldNumeroPlano);
        textFieldNumeroPlano.setBounds(20, 220, 430, 30);

        buttonEspecialidadesCancelar.setBackground(new java.awt.Color(255, 102, 102));
        buttonEspecialidadesCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidadesCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/close.png"))); // NOI18N
        buttonEspecialidadesCancelar.setToolTipText("Cancelar");
        buttonEspecialidadesCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEspecialidadesCancelar);
        buttonEspecialidadesCancelar.setBounds(490, 280, 80, 40);

        buttonEspecialidadesSalvar.setBackground(new java.awt.Color(51, 204, 255));
        buttonEspecialidadesSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidadesSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/save.png"))); // NOI18N
        buttonEspecialidadesSalvar.setToolTipText("Salvar");
        buttonEspecialidadesSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEspecialidadesSalvar);
        buttonEspecialidadesSalvar.setBounds(580, 280, 80, 40);

        labelNomeCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomeCategoria.setText("Nome da Categoria:");
        jPanel1.add(labelNomeCategoria);
        labelNomeCategoria.setBounds(20, 140, 190, 20);

        textFieldNomeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldNomeCategoria);
        textFieldNomeCategoria.setBounds(20, 160, 430, 30);

        textFieldValidadePlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadePlanoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldValidadePlano);
        textFieldValidadePlano.setBounds(20, 280, 130, 30);

        labelValidadePlano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelValidadePlano.setText("Validade:");
        jPanel1.add(labelValidadePlano);
        labelValidadePlano.setBounds(20, 260, 190, 20);

        panelMain.add(jPanel1);
        jPanel1.setBounds(10, 10, 680, 340);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 100, 700, 370);

        setSize(new java.awt.Dimension(716, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeOperadoraActionPerformed

    private void textFieldNumeroPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroPlanoActionPerformed

    private void buttonEspecialidadesCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonEspecialidadesCancelarActionPerformed

    private void buttonEspecialidadesSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonEspecialidadesSalvarActionPerformed
    private void adicionar() {
        //cria um objeto PlanoDeSaude
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(textFieldNomeOperadora.getText());
        novoPlanoDeSaude.setCategoria(textFieldNomeCategoria.getText());
        novoPlanoDeSaude.setNumero(textFieldNumeroPlano.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidadePlano.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //gravar objeto através do DAO
        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);

        JOptionPane.showMessageDialog(
                this,
                "Plano de Saúde gravada com sucesso!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void editar() {
        planoDeSaude.setOperadora(textFieldNomeOperadora.getText());
        planoDeSaude.setCategoria(textFieldNomeCategoria.getText());
        planoDeSaude.setNumero(textFieldNumeroPlano.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidadePlano.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //atualiza o objeto através do DAO
        PlanoDeSaudeDAO.atualizar(planoDeSaude);

        JOptionPane.showMessageDialog(
                this,
                "Plano de Saúde editado com sucesso!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    private void textFieldNomeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeCategoriaActionPerformed

    private void textFieldValidadePlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadePlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadePlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEspecialidadesCancelar;
    private javax.swing.JButton buttonEspecialidadesSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNomeCategoria;
    private javax.swing.JLabel labelNomeOperadora;
    private javax.swing.JLabel labelNumeroPlano;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidadePlano;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNomeCategoria;
    private javax.swing.JTextField textFieldNomeOperadora;
    private javax.swing.JTextField textFieldNumeroPlano;
    private javax.swing.JTextField textFieldValidadePlano;
    // End of variables declaration//GEN-END:variables
}
