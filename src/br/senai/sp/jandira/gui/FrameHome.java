package br.senai.sp.jandira.gui;

import java.awt.Toolkit;

public class FrameHome extends javax.swing.JFrame {

    private final int POS_X = 30;
    private final int POS_Y = 100;
    private final int LARGURA = 1090;
    private final int ALTURA = 380;

    private EspecialidadesPanel especialidadesPanel;
    private PlanoDeSaudePanel planoDeSaudePanel;
    

    public FrameHome() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/image/medico.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        buttonAgenda = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelLinha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        labelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        labelTitulo.setLayout(null);

        LabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        LabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/calendario.png"))); // NOI18N
        LabelTitle.setText(" Sistema para Agendamento de Consultas");
        labelTitulo.add(LabelTitle);
        LabelTitle.setBounds(230, 10, 643, 79);

        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(0, 0, 1140, 90);

        panelMain.setBackground(new java.awt.Color(204, 204, 204));
        panelMain.setLayout(null);

        buttonAgenda.setBackground(new java.awt.Color(246, 246, 246));
        buttonAgenda.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/299096_calendar_clock_icon.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        panelMain.add(buttonAgenda);
        buttonAgenda.setBounds(180, 20, 132, 65);

        buttonMedico.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedico.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/medico.png"))); // NOI18N
        buttonMedico.setToolTipText("Medicos");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        panelMain.add(buttonMedico);
        buttonMedico.setBounds(460, 20, 130, 66);

        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidade.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/kit-de-primeiros-socorros.png"))); // NOI18N
        buttonEspecialidade.setToolTipText("Especialidades");
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        panelMain.add(buttonEspecialidade);
        buttonEspecialidade.setBounds(600, 20, 130, 65);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/cartao-medico.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Planos de Saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelMain.add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(740, 20, 130, 65);

        buttonSair.setBackground(new java.awt.Color(255, 0, 0));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setText("Sair");
        buttonSair.setBorder(null);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        panelMain.add(buttonSair);
        buttonSair.setBounds(1020, 20, 97, 64);

        buttonPaciente.setBackground(new java.awt.Color(246, 246, 246));
        buttonPaciente.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/paciente.png"))); // NOI18N
        buttonPaciente.setToolTipText("Pacientes");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        panelMain.add(buttonPaciente);
        buttonPaciente.setBounds(320, 20, 130, 65);

        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        buttonHome.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/home-button.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        panelMain.add(buttonHome);
        buttonHome.setBounds(40, 20, 132, 65);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(204, 255, 204));
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(10, 110, 250, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(10, 150, 380, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contato Empresarial");
        panelHome.add(jLabel3);
        jLabel3.setBounds(810, 180, 250, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("EMAIL: sisacon123@gmail.com");
        panelHome.add(jLabel4);
        jLabel4.setBounds(810, 210, 250, 15);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TELEFONE: (11) 12345-6789");
        panelHome.add(jLabel5);
        jLabel5.setBounds(810, 230, 250, 15);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("www.sisacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(810, 250, 250, 15);

        panelLinha.setBackground(new java.awt.Color(0, 153, 153));
        panelHome.add(panelLinha);
        panelLinha.setBounds(10, 180, 1050, 5);

        panelMain.add(panelHome);
        panelHome.setBounds(30, 100, 1090, 380);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 90, 1140, 530);

        setSize(new java.awt.Dimension(1156, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 255, 204));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(false);
        planoDeSaudePanel.setVisible(true);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        buttonEspecialidade.setBackground(new java.awt.Color(204, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(false);
        planoDeSaudePanel.setVisible(false);
        especialidadesPanel.setVisible(true);
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonHome.setBackground(new java.awt.Color(204, 255, 204));
        panelHome.setVisible(true);
        planoDeSaudePanel.setVisible(false);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel labelTitulo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelLinha;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        //cria a tela especialidades
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        panelMain.add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
        
        //cria a tela plano de saude
        planoDeSaudePanel = new PlanoDeSaudePanel();
        planoDeSaudePanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        panelMain.add(planoDeSaudePanel);
        planoDeSaudePanel.setVisible(false);

    }

}
