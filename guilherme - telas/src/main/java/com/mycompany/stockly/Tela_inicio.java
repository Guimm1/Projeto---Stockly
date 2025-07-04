/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.stockly;

/**
 *
 * @author g.magri
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Tela_inicio extends javax.swing.JFrame {

    /**
     * Creates new form Tela_inicio
     */
     private JTextField campoUsuario;
    private JTextField campoEmpresa;
    private JPasswordField campoSenha1;
    private JButton botaoEntrar1;
    private JLabel labelCadastrar;
   
    
    
    public Tela_inicio() {
        montarInterface();
    }
        
        private void montarInterface() {
        setTitle("Login - Stockly");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // layout absoluto
        getContentPane().setBackground(new Color(0, 180, 0)); // verde do fundo

        // Painel central branco
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(Color.WHITE);
        painel.setBounds(40, 40, 560, 340);
        add(painel);

        // Título
        JLabel titulo = new JLabel("Seja Bem-Vindo ao ");
        titulo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        titulo.setBounds(30, 20, 200, 30);
        painel.add(titulo);

        JLabel stockly = new JLabel("Stockly");
        stockly.setFont(new Font("Segoe UI", Font.BOLD, 20));
        stockly.setForeground(new Color(30, 60, 150)); // azul
        stockly.setBounds(210, 20, 100, 30);
        painel.add(stockly);

        // Campos
        JLabel labelUsuario = new JLabel("Usuário");
        labelUsuario.setBounds(30, 70, 100, 20);
        painel.add(labelUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(30, 90, 200, 25);
        painel.add(campoUsuario);

        JLabel labelEmpresa = new JLabel("Código Empresa");
        labelEmpresa.setBounds(30, 120, 150, 20);
        painel.add(labelEmpresa);

        campoEmpresa = new JTextField();
        campoEmpresa.setBounds(30, 140, 200, 25);
        painel.add(campoEmpresa);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(30, 170, 100, 20);
        painel.add(labelSenha);

        campoSenha1 = new JPasswordField();
        campoSenha1.setBounds(30, 190, 200, 25);
        painel.add(campoSenha1);

        // Botão Entrar
        botaoEntrar1 = new JButton("Entrar");
        botaoEntrar1.setBounds(30, 230, 100, 30);
        botaoEntrar1.setBackground(new Color(40, 70, 160));
        botaoEntrar1.setForeground(Color.WHITE);
        painel.add(botaoEntrar1);

        // Ações do botão
        botaoEntrar1.addActionListener(e -> realizarLogin());

        // Labels clicáveis
        

        labelCadastrar = new JLabel("<html><a href=''>Deseja cadastrar-se?</a></html>");
        labelCadastrar.setBounds(250, 220, 180, 20);
        labelCadastrar.setForeground(Color.BLUE);
        painel.add(labelCadastrar);

        // Imagem
        JLabel imagem = new JLabel(new ImageIcon("logo.png")); // Substitua pelo nome real da imagem
        imagem.setBounds(360, 80, 150, 150);
        painel.add(imagem);

        setLocationRelativeTo(null);
        setVisible(true);
    

    }
        private void realizarLogin() {
        
    String nome_funcionario = campoUsuario.getText();
    String codigo_empresa = campoEmpresa.getText();
    String senha = new String(campoSenha1.getPassword());

    if (nome_funcionario.isEmpty() || codigo_empresa.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
    } else {
        try {
            // Conexão com MySQL
            String url = "jdbc:mysql://localhost:3306/stocklys";
            String user = "root"; // seu usuário do MySQL
            String password = ""; // sua senha do MySQL

            Connection conexao = DriverManager.getConnection(url, user, password);

            // Query para verificar usuário
            String sql = "SELECT * FROM funcionario WHERE nome_funcionario = ? AND codigo_empresa = ? AND senha = ?";
   
             PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome_funcionario);
            stmt.setString(2, codigo_empresa);
            stmt.setString(3, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
                // Aqui você pode abrir a próxima tela, se quiser
            } else {
                JOptionPane.showMessageDialog(this, "Usuário, empresa ou senha incorretos.");
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco: " + e.getMessage());
        }
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botao_entrar = new javax.swing.JButton();
        botao_esqueci_senha = new javax.swing.JButton();
        botao_cadastro = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        codigo_empresa = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(864, 615));
        setSize(new java.awt.Dimension(860, 634));

        jPanel2.setBackground(new java.awt.Color(81, 195, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(860, 634));

        jPanel1.setPreferredSize(new java.awt.Dimension(789, 581));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Seja Bem-Vindo ao");

        jLabel2.setBackground(new java.awt.Color(40, 71, 173));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 71, 173));
        jLabel2.setText("Stockly");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Usuário");

        jLabel4.setText("Código Empresa");

        jLabel5.setText("Senha");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/stockly/logo stockly_of.png"))); // NOI18N

        botao_entrar.setBackground(new java.awt.Color(40, 71, 173));
        botao_entrar.setForeground(new java.awt.Color(255, 255, 255));
        botao_entrar.setText("Entrar");

        botao_esqueci_senha.setForeground(new java.awt.Color(0, 102, 255));
        botao_esqueci_senha.setText("Esqueceu a senha?");
        botao_esqueci_senha.setBorder(null);

        botao_cadastro.setForeground(new java.awt.Color(0, 102, 255));
        botao_cadastro.setText("Deseja cadastrar-se?");
        botao_cadastro.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(codigo_empresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                            .addComponent(usuario, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGap(162, 162, 162))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botao_cadastro)
                                        .addComponent(botao_esqueci_senha))
                                    .addGap(28, 28, 28)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(botao_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23)
                        .addComponent(botao_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(botao_esqueci_senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_cadastro)
                        .addGap(202, 202, 202))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastro;
    private javax.swing.JButton botao_entrar;
    private javax.swing.JButton botao_esqueci_senha;
    private javax.swing.JTextField codigo_empresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
