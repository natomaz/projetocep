package br.ulbra.view;

import br.ulbra.classes.cadastro;
import br.ulbra.classes.cadastroDao;
import br.ulbra.classes.cep;
import br.ulbra.classes.endereco;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frCadastro extends javax.swing.JFrame {
    public frCadastro() throws SQLException {
        initComponents();
        showTable();
    }
    
        public void showTable() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel)tbPesquisa.getModel();
        modelo.setNumRows(0);
        cadastroDao cdao = new cadastroDao();
        for (cadastro c : cdao.read()){
            modelo.addRow(new Object[]{
            c.getId(),
            c.getNome(),
            c.getSexo(),
            c.getDatanasc(),
            c.getEmail(),
            c.getCelular(),
            c.getCep()
        });
        }
    }
    
    public void showTableForName(String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbPesquisa.getModel();
        modelo.setNumRows(0);
        cadastroDao cdao = new cadastroDao();
        for (cadastro p : cdao.readPesq(nome)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getSexo(),
                p.getDatanasc(),
                p.getEmail(),
                p.getCelular(),
                p.getCep()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDatanasc = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        txtLogradouro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JLabel();
        txtUf = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnCep = new javax.swing.JButton();
        txtCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setText("NOME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel3.setText("SEXO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setText("DATA DE NASCIMENTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel5.setText("E-MAIL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel6.setText("CELULAR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel8.setText("LOGRADOURO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel10.setText("BAIRRO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel11.setText("NOME");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel12.setText("UF");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel13.setText("ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 710, -1, 50));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_1.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 710, -1, 50));

        txtId.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 420, 40));

        txtNome.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 350, 40));

        txtDatanasc.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtDatanasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 160, 40));

        txtEmail.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 340, 40));

        tbPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbPesquisa.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "SEXO", "DATA DE NASCIMENTO", "EMAIL", "CELULAR", "CEP"
            }
        ));
        jScrollPane1.setViewportView(tbPesquisa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 950, 180));

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/modify.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 710, -1, 50));

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, -1, 50));

        txtSexo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 350, 40));

        txtCelular.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 350, 40));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setText("PESQUISA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel7.setText("CADASTRO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel14.setText("CIDADE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 30));

        txtPesquisa.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 350, 40));

        btnPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, 50));

        txtLogradouro.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jPanel1.add(txtLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 220, 50));

        txtBairro.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 210, 40));

        txtCidade.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 270, 40));

        txtUf.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jPanel1.add(txtUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 220, 40));

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel18.setText("CEP");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        btnCep.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCepActionPerformed(evt);
            }
        });
        jPanel1.add(btnCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, 50));

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    System.exit(0);   
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        cadastro c = new cadastro();
        c.setId(Integer.parseInt(txtId.getText()));
	c.setNome(txtNome.getText());
        c.setSexo(txtSexo.getText());
        c.setDatanasc(Integer.parseInt(txtDatanasc.getText()));
        c.setCelular(Integer.parseInt(txtSexo.getText()));
        c.setEmail(txtEmail.getText());
        c.setCep(Integer.parseInt(txtCep.getText()));

        try {
            cadastroDao cdao = new cadastroDao();
            cdao.create(c);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        cadastro c = new cadastro();
        c.setId(Integer.parseInt(txtId.getText()));
	c.setNome(txtNome.getText());
        c.setSexo(txtSexo.getText());
        c.setDatanasc(Integer.parseInt(txtDatanasc.getText()));
        c.setCelular(Integer.parseInt(txtSexo.getText()));
        c.setEmail(txtEmail.getText());
        c.setCep(Integer.parseInt(txtCep.getText()));
        
        cadastroDao cdao;
        try {
            cdao = new cadastroDao();
            cdao.update(c);
            showTable();            
        } catch (SQLException ex) {
            Logger.getLogger(frCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(frCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    cadastro c = new cadastro();
        c.setId(Integer.parseInt(txtId.getText()));
        cadastroDao cdao;
        try {
            cdao = new cadastroDao();
            cdao.delete(c);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(frCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
 try {
            showTableForName(txtPesquisa.getText());
        } catch (SQLException ex) {
            Logger.getLogger(frCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCepActionPerformed
        try {
            endereco end = cep.buscaEnderecoPelo(txtCep.getText());
            txtLogradouro.setText(end.getLogradouro());
            txtBairro.setText(end.getBairro());
            txtCidade.setText(end.getLocalidade());
            txtUf.setText(end.getUf());
            
        } catch (Exception ex) {
            Logger.getLogger(cep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCepActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new frCadastro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCep;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JLabel txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JTextField txtDatanasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JLabel txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JLabel txtUf;
    // End of variables declaration//GEN-END:variables

}
