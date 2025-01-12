package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class MedicosDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicosDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);

        initComponents();

        this.operacao = operacao;

        preencherTitulo();
        preencherListaDeEspecialidades();

    }

    public MedicosDialog(java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);

        initComponents();

        medico = m;

        this.operacao = operacao;

        preencherFormulario();

        preencherTitulo();

        preencherListaDeEspecialidades();
    }

    private void preencherListaDeEspecialidades() {
        jList1.setModel(EspecialidadeDAO.getListaEspecialidade());
    }

    private void preencherListaDeEspecialidadesDoMedico() {
        DefaultListModel<Especialidade> especialidadeMedico = new DefaultListModel<>();
        for (Especialidade listar : medico.getEspecialidade()) {
            especialidadeMedico.addElement(listar);
        }
        jList2.setModel(especialidadeMedico);
    }

    private void preencherFormulario() {

        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCRM.setText(medico.getCrm());
        textFieldNomeMedico.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        textFieldDataNascimento.setText(medico.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        preencherListaDeEspecialidadesDoMedico();

    }

    private void preencherTitulo() {
        labelTitulo.setText("   MÉDICOS - " + operacao);
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
        labelCRM = new javax.swing.JLabel();
        labelNomeMedico = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelListaEspecialidades = new javax.swing.JLabel();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldCRM = new javax.swing.JTextField();
        textFieldNomeMedico = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldDataNascimento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        buttonAdicionarEsp = new javax.swing.JButton();
        buttonRemoverEsp = new javax.swing.JButton();
        buttonEspecialidadesSalvar = new javax.swing.JButton();
        buttonEspecialidadesCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(51, 51, 51));
        panelHeader.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/plus64px.png"))); // NOI18N
        labelTitulo.setText("   MÉDICOS - ADICIONAR");
        panelHeader.add(labelTitulo);
        labelTitulo.setBounds(170, 20, 420, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 800, 110);

        panelMain.setBackground(new java.awt.Color(204, 204, 204));
        panelMain.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        labelCodigo.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(30, 60, 50, 20);

        labelCRM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCRM.setText("CRM:");
        labelCRM.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelCRM);
        labelCRM.setBounds(180, 60, 50, 20);

        labelNomeMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomeMedico.setText("Nome do(a) médico(a):");
        labelNomeMedico.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelNomeMedico);
        labelNomeMedico.setBounds(330, 60, 160, 20);

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefone.setText("Telefone:");
        labelTelefone.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelTelefone);
        labelTelefone.setBounds(30, 130, 60, 20);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setText("E-mail:");
        labelEmail.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelEmail);
        labelEmail.setBounds(190, 130, 50, 20);

        labelDataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDataNascimento.setText("Data Nascimento:");
        labelDataNascimento.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelDataNascimento);
        labelDataNascimento.setBounds(600, 130, 120, 20);

        labelListaEspecialidades.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelListaEspecialidades.setText("Lista de Especialidades:");
        labelListaEspecialidades.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelListaEspecialidades);
        labelListaEspecialidades.setBounds(30, 200, 150, 20);

        labelEspecialidadesMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEspecialidadesMedico.setText("Especialidades do(a) Médico(a):");
        labelEspecialidadesMedico.setPreferredSize(new java.awt.Dimension(37, 20));
        jPanel1.add(labelEspecialidadesMedico);
        labelEspecialidadesMedico.setBounds(330, 200, 200, 20);

        textFieldCodigo.setEditable(false);
        jPanel1.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 80, 140, 30);

        textFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCRMActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCRM);
        textFieldCRM.setBounds(180, 80, 140, 30);
        jPanel1.add(textFieldNomeMedico);
        textFieldNomeMedico.setBounds(330, 80, 390, 30);

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldTelefone);
        textFieldTelefone.setBounds(30, 150, 150, 30);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldEmail);
        textFieldEmail.setBounds(190, 150, 400, 30);

        try {
            textFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldDataNascimento);
        textFieldDataNascimento.setBounds(600, 150, 120, 30);

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 170, 170);

        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(330, 220, 170, 170);

        buttonAdicionarEsp.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdicionarEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/right-arrow.png"))); // NOI18N
        buttonAdicionarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarEsp);
        buttonAdicionarEsp.setBounds(230, 240, 60, 50);

        buttonRemoverEsp.setBackground(new java.awt.Color(255, 102, 102));
        buttonRemoverEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/image/left-arrow.png"))); // NOI18N
        buttonRemoverEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEspActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRemoverEsp);
        buttonRemoverEsp.setBounds(230, 310, 60, 50);

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
        buttonEspecialidadesSalvar.setBounds(670, 390, 80, 40);

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
        buttonEspecialidadesCancelar.setBounds(580, 390, 80, 40);

        panelMain.add(jPanel1);
        jPanel1.setBounds(20, 20, 760, 440);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 110, 800, 490);

        setSize(new java.awt.Dimension(816, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCRMActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void buttonAdicionarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspActionPerformed
        if (jList1.isSelectionEmpty() == false) {
            ArrayList<Especialidade> listaNova = new ArrayList<>();
            int tamanho = jList2.getModel().getSize();
            int i = 0;
            while (tamanho > i) {
                listaNova.add(jList2.getModel().getElementAt(i));
                i++;
            }
            if (listaNova.contains(jList1.getSelectedValue()) == false) {
                listaNova.add(jList1.getSelectedValue());

                DefaultListModel<Especialidade> listaDeEsp = new DefaultListModel<>();
                for (Especialidade listar : listaNova) {
                    listaDeEsp.addElement(listar);
                }
                jList2.setModel(listaDeEsp);
            } else {
                JOptionPane.showMessageDialog(null, "Especialidade já selecionada!", "Médico", JOptionPane.WARNING_MESSAGE, null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione alguma especialidade!", "Médico", JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonAdicionarEspActionPerformed

    private void buttonEspecialidadesCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonEspecialidadesCancelarActionPerformed

    private void buttonEspecialidadesSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesSalvarActionPerformed
        CharSequence teste = " ";
        
        int i = 0;
        if (textFieldDataNascimento.getText().contains(teste) == true
                || textFieldCRM.getText().isEmpty() == true
                || textFieldNomeMedico.getText().isEmpty() == true
                || textFieldTelefone.getText().isEmpty() == true
                || textFieldEmail.getText().isEmpty() == true
                || jList1.isSelectionEmpty() == true) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);

        } else {
            if (operacao == operacao.ADICIONAR) {
                adicionar();
            } else {
                editar();
            }
        }


    }//GEN-LAST:event_buttonEspecialidadesSalvarActionPerformed

    private ArrayList<Especialidade> getEspecialidades(JList<Especialidade> lista) {
        int tamanho = lista.getModel().getSize();
        ArrayList<Especialidade> listaNova = new ArrayList();
        for (int i = 0; i < tamanho; i++) {
            listaNova.add(lista.getModel().getElementAt(i));
        }
        return listaNova;
    }

    private void adicionar() {
        //Criar um objeto medico
        Medico novoMedico = new Medico();
        novoMedico.setCrm(textFieldCRM.getText());
        novoMedico.setNome(textFieldNomeMedico.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(textFieldDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        novoMedico.setEspecialidade(getEspecialidades(jList1));

        //gravar o objeto, através do DAO.
        MedicoDAO.gravar(novoMedico);

        JOptionPane.showMessageDialog(this,
                "Médico gravado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void editar() {
        medico.setCrm(textFieldCRM.getText());
        medico.setNome(textFieldNomeMedico.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(LocalDate.parse(textFieldDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        medico.setEspecialidade(getEspecialidades(jList1));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(this,
                "Médico editado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }

    private void textFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataNascimentoActionPerformed

    private void buttonRemoverEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEspActionPerformed

        if (jList2.isSelectionEmpty() == false) {
            ArrayList<Especialidade> listaNova = new ArrayList<>();
            int tamanho = jList1.getModel().getSize();
            int o = 0;
            while (tamanho > o) {
                listaNova.add(jList1.getModel().getElementAt(o));
                o++;
            }

            if (listaNova.contains(jList2.getSelectedValue()) == false) {
                listaNova.add(jList2.getSelectedValue());

                DefaultListModel<Especialidade> listaDeEspecialidades =  new DefaultListModel<>();
                for (Especialidade listar : listaNova) {
                    listaDeEspecialidades.addElement(listar);
                }
                jList1.setModel(listaDeEspecialidades);
            } else {
                JOptionPane.showMessageDialog(null, "Especialidade já seleciondada!", "Médioco", JOptionPane.WARNING_MESSAGE, null);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma especialidade!", "Médioco", JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonRemoverEspActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEsp;
    private javax.swing.JButton buttonEspecialidadesCancelar;
    private javax.swing.JButton buttonEspecialidadesSalvar;
    private javax.swing.JButton buttonRemoverEsp;
    private javax.swing.JList<Especialidade> jList1;
    private javax.swing.JList<Especialidade> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaEspecialidades;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCRM;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JFormattedTextField textFieldDataNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeMedico;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

}
