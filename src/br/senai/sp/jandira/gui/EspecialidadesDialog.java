package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {

    Especialidade especialidade;

    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal,
            Especialidade e) {

        super(parent, modal);
        initComponents();

        especialidade = e;

        preecherFormulario();
    }

    private void preecherFormulario() {
        labelTitulo.setText("   Especialidades - EDITAR");
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/edit.png")));
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoEspecialidade.setText(especialidade.getDescriçao());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelNomeEspecialidade = new javax.swing.JLabel();
        labelDescricaoEspecialidade = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeEspecialidade = new javax.swing.JTextField();
        textFieldDescricaoEspecialidade = new javax.swing.JTextField();
        buttonEspecialidadesCancelar = new javax.swing.JButton();
        buttonEspecialidadesSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 380));
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(51, 51, 51));
        panelHeader.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus64px.png"))); // NOI18N
        labelTitulo.setText("   Especialidades - ADICIONAR");
        panelHeader.add(labelTitulo);
        labelTitulo.setBounds(100, 20, 480, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 700, 100);

        panelMain.setBackground(new java.awt.Color(204, 204, 204));
        panelMain.setPreferredSize(new java.awt.Dimension(700, 280));
        panelMain.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhe de Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(30, 40, 190, 20);

        labelNomeEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomeEspecialidade.setText("Nome de Especialidade:");
        jPanel1.add(labelNomeEspecialidade);
        labelNomeEspecialidade.setBounds(30, 100, 190, 20);

        labelDescricaoEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescricaoEspecialidade.setText("Descrição de Especialidade:");
        jPanel1.add(labelDescricaoEspecialidade);
        labelDescricaoEspecialidade.setBounds(30, 160, 190, 20);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 60, 130, 30);

        textFieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeEspecialidadeActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldNomeEspecialidade);
        textFieldNomeEspecialidade.setBounds(30, 120, 300, 30);

        textFieldDescricaoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoEspecialidadeActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldDescricaoEspecialidade);
        textFieldDescricaoEspecialidade.setBounds(30, 180, 430, 30);

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
        buttonEspecialidadesCancelar.setBounds(490, 210, 80, 40);

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
        buttonEspecialidadesSalvar.setBounds(580, 210, 80, 40);

        panelMain.add(jPanel1);
        jPanel1.setBounds(10, 10, 680, 260);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 100, 700, 310);

        setSize(new java.awt.Dimension(716, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeEspecialidadeActionPerformed

    private void textFieldDescricaoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescricaoEspecialidadeActionPerformed

    private void buttonEspecialidadesCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadesCancelarActionPerformed

    private void buttonEspecialidadesSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesSalvarActionPerformed

        //cruar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoEspecialidade.getText());

        //gravar o objeto, através do DAO.
        EspecialidadeDAO.gravar(novaEspecialidade);

        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso!",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_buttonEspecialidadesSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEspecialidadesCancelar;
    private javax.swing.JButton buttonEspecialidadesSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoEspecialidade;
    private javax.swing.JLabel labelNomeEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoEspecialidade;
    private javax.swing.JTextField textFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}
