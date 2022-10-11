package br.senai.sp.jandira.gui;

import java.awt.Toolkit;

public class FrameHome extends javax.swing.JFrame {

    private final int POS_X = 30;
    private final int POS_Y = 0;
    private final int LARGURA = 1090;
    private final int ALTURA = 380;

    private EspecialidadesPanel especialidadesPanel;

    public FrameHome() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/image/medico.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        PanelMain = new javax.swing.JPanel();
        ButtonAgenda = new javax.swing.JButton();
        ButtonMedico = new javax.swing.JButton();
        ButtonEspecialidade = new javax.swing.JButton();
        ButtonPlanoDeSaude = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        ButtonPaciente = new javax.swing.JButton();
        ButtonHome = new javax.swing.JButton();
        PanelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        LabelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        LabelTitulo.setLayout(null);

        LabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        LabelTitle.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/calendario.png"))); // NOI18N
        LabelTitle.setText(" Sistema para Agendamento de Consultas");
        LabelTitulo.add(LabelTitle);
        LabelTitle.setBounds(230, 10, 643, 79);

        getContentPane().add(LabelTitulo);
        LabelTitulo.setBounds(0, 0, 1140, 90);

        PanelMain.setBackground(new java.awt.Color(204, 204, 204));
        PanelMain.setLayout(null);

        ButtonAgenda.setBackground(new java.awt.Color(246, 246, 246));
        ButtonAgenda.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/299096_calendar_clock_icon.png"))); // NOI18N
        ButtonAgenda.setToolTipText("Agenda");
        ButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendaActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonAgenda);
        ButtonAgenda.setBounds(180, 20, 132, 65);

        ButtonMedico.setBackground(new java.awt.Color(246, 246, 246));
        ButtonMedico.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ButtonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/medico.png"))); // NOI18N
        ButtonMedico.setToolTipText("Medicos");
        ButtonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMedicoActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonMedico);
        ButtonMedico.setBounds(460, 20, 130, 66);

        ButtonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        ButtonEspecialidade.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ButtonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/kit-de-primeiros-socorros.png"))); // NOI18N
        ButtonEspecialidade.setToolTipText("Especialidades");
        ButtonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadeActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonEspecialidade);
        ButtonEspecialidade.setBounds(600, 20, 130, 65);

        ButtonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        ButtonPlanoDeSaude.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ButtonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/cartao-medico.png"))); // NOI18N
        ButtonPlanoDeSaude.setToolTipText("Planos de Saúde");
        ButtonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanoDeSaudeActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonPlanoDeSaude);
        ButtonPlanoDeSaude.setBounds(740, 20, 130, 65);

        ButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        ButtonSair.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonSair);
        ButtonSair.setBounds(1020, 20, 97, 64);

        ButtonPaciente.setBackground(new java.awt.Color(246, 246, 246));
        ButtonPaciente.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/paciente.png"))); // NOI18N
        ButtonPaciente.setToolTipText("Pacientes");
        ButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPacienteActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonPaciente);
        ButtonPaciente.setBounds(320, 20, 130, 65);

        ButtonHome.setBackground(new java.awt.Color(246, 246, 246));
        ButtonHome.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/home-button.png"))); // NOI18N
        ButtonHome.setToolTipText("Home");
        ButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHomeActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonHome);
        ButtonHome.setBounds(40, 20, 132, 65);

        PanelHome.setBackground(new java.awt.Color(255, 255, 255));
        PanelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelHome.setForeground(new java.awt.Color(204, 255, 204));
        PanelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("SISACON");
        PanelHome.add(jLabel1);
        jLabel1.setBounds(10, 100, 182, 50);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        PanelHome.add(jLabel2);
        jLabel2.setBounds(10, 150, 380, 22);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setText("Contato Empresarial");
        PanelHome.add(jLabel3);
        jLabel3.setBounds(10, 190, 247, 30);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel4.setText("EMAIL: sisacon123@gmail.com");
        PanelHome.add(jLabel4);
        jLabel4.setBounds(10, 220, 220, 15);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setText("TELEFONE: 1 2345-6789");
        PanelHome.add(jLabel5);
        jLabel5.setBounds(10, 240, 170, 15);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("www.sisacon.com.br");
        PanelHome.add(jLabel6);
        jLabel6.setBounds(10, 260, 150, 15);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        PanelHome.add(jPanel1);
        jPanel1.setBounds(10, 180, 1050, 5);

        PanelMain.add(PanelHome);
        PanelHome.setBounds(30, 100, 1090, 380);

        getContentPane().add(PanelMain);
        PanelMain.setBounds(0, 90, 1140, 530);

        setSize(new java.awt.Dimension(1156, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgendaActionPerformed

    private void ButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPacienteActionPerformed

    private void ButtonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPlanoDeSaudeActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonMedicoActionPerformed

    private void ButtonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadeActionPerformed
        ButtonEspecialidade.setBackground(new java.awt.Color(204, 255, 204));
        ButtonHome.setBackground(new java.awt.Color(246, 246, 246));
        PanelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
    }//GEN-LAST:event_ButtonEspecialidadeActionPerformed

    private void ButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHomeActionPerformed
        ButtonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        ButtonHome.setBackground(new java.awt.Color(204, 255, 204));
        PanelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_ButtonHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgenda;
    private javax.swing.JButton ButtonEspecialidade;
    private javax.swing.JButton ButtonHome;
    private javax.swing.JButton ButtonMedico;
    private javax.swing.JButton ButtonPaciente;
    private javax.swing.JButton ButtonPlanoDeSaude;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JPanel LabelTitulo;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y + 100, LARGURA, ALTURA);
        PanelMain.add(especialidadesPanel);
        especialidadesPanel.setVisible(false);

    }

}
