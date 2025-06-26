
package com.mycompany.stockly;


import javax.swing.*; // Para usar JFrame, JLabel, JTexField, JButton
import java.awt.event.*; // Serve para capturar eventos feitos no botão

public class TelaCadastro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastro.class.getName());
    
    

    
    public TelaCadastro() {
       
        initComponents();
        setLocationRelativeTo(null); // Centralizar janela
       

        
        cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarCadastro();
            }
        });
    }
        
   private void realizarCadastro() {
        String Nome = nome.getText();
        String CPF = cpf.getText();
        String Telefone = telefone.getText();
        String Email = email.getText();
        String Usuario = usuario.getText();
        String Senha = senha.getText();

        if (Nome.isEmpty() || CPF.isEmpty() || Telefone.isEmpty()
                || Email.isEmpty() || Usuario.isEmpty() || Senha.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Email.contains("@")) {
            JOptionPane.showMessageDialog(this,
                    "Digite um email válido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Cadastro realizado com sucesso!",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        nome.setText("");
        cpf.setText("");
        telefone.setText("");
        email.setText("");
        usuario.setText("");
        senha.setText("");
    }
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelP = new javax.swing.JPanel();
        Painel2 = new javax.swing.JPanel();
        PainelL = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        FontePrincipal = new javax.swing.JLabel();
        DadosPessoais = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        DadosDeAcesso = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        senha = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelP.setBackground(new java.awt.Color(81, 195, 70));

        Painel2.setBackground(new java.awt.Color(255, 255, 255));

        PainelL.setBackground(new java.awt.Color(230, 230, 230));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/stockly/imagemprojeto.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout PainelLLayout = new javax.swing.GroupLayout(PainelL);
        PainelL.setLayout(PainelLLayout);
        PainelLLayout.setHorizontalGroup(
            PainelLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelLLayout.setVerticalGroup(
            PainelLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FontePrincipal.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        FontePrincipal.setText("Cadastro de Usuário Stockly");

        DadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        DadosPessoais.setForeground(new java.awt.Color(46, 56, 167));
        DadosPessoais.setText("Dados Pessoais:");

        nome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nome.setForeground(new java.awt.Color(102, 102, 102));
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        CPF.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CPF.setText("CPF:");

        cpf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cpf.setForeground(new java.awt.Color(102, 102, 102));

        telefone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        telefone.setForeground(new java.awt.Color(102, 102, 102));

        Telefone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Telefone.setText("Telefone:");

        Email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Email.setText("Email:");

        email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));

        DadosDeAcesso.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        DadosDeAcesso.setForeground(new java.awt.Color(46, 56, 167));
        DadosDeAcesso.setText("Dados de Acesso:");

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        Senha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Senha.setText("Senha:");

        senha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        senha.setForeground(new java.awt.Color(102, 102, 102));

        cadastrar.setBackground(new java.awt.Color(0, 102, 153));
        cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setText("Cadastrar");

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FontePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome)
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPF))
                        .addGap(57, 57, 57)
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefone)
                            .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addComponent(Email)
                    .addComponent(email)
                    .addComponent(jSeparator1)
                    .addComponent(DadosDeAcesso)
                    .addComponent(usuario)
                    .addComponent(Senha)
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cadastrar))
                    .addComponent(jSeparator2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(PainelL, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(FontePrincipal)
                .addGap(29, 29, 29)
                .addComponent(DadosPessoais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(Telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefone)
                    .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DadosDeAcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelPLayout = new javax.swing.GroupLayout(PainelP);
        PainelP.setLayout(PainelPLayout);
        PainelPLayout.setHorizontalGroup(
            PainelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PainelPLayout.setVerticalGroup(
            PainelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

   
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel DadosDeAcesso;
    private javax.swing.JLabel DadosPessoais;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FontePrincipal;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel PainelL;
    private javax.swing.JPanel PainelP;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
