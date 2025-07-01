package com.mycompany.telaprojeto;

import javax.swing.*;

public class TelaCadastroProdutos extends JFrame {

    public TelaCadastroProdutos() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Cadastro de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);           // Centraliza a janela

        JPanel panel = new JPanel(null);       // Layout absoluto
        panel.setBorder(
            BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 5)
        );

        /* ---------------------------------------------------------
         * Funcionário (ComboBox)
         * --------------------------------------------------------- */
        JLabel lblFuncionario = new JLabel("Funcionário:");
        lblFuncionario.setBounds(20, 20, 100, 20);
        panel.add(lblFuncionario);

        String[] funcoes = { "Estoquista", "Vendedor", "Gerente", "Supervisor" };
        JComboBox<String> cbFuncionario = new JComboBox<>(funcoes);
        cbFuncionario.setSelectedItem("Estoquista");
        cbFuncionario.setBounds(120, 20, 200, 22);
        panel.add(cbFuncionario);

        /* ---------------------------------------------------------
         * Demais campos
         * --------------------------------------------------------- */
        JLabel lblNome = new JLabel("Nome / Razão Social:");
        lblNome.setBounds(20, 50, 150, 20);
        panel.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(160, 50, 300, 20);
        panel.add(txtNome);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(480, 50, 60, 20);
        panel.add(lblEstado);

        JTextField txtEstado = new JTextField();
        txtEstado.setBounds(540, 50, 50, 20);
        panel.add(txtEstado);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(610, 50, 50, 20);
        panel.add(lblCNPJ);

        JTextField txtCNPJ = new JTextField();
        txtCNPJ.setBounds(660, 50, 200, 20);
        panel.add(txtCNPJ);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(20, 80, 100, 20);
        panel.add(lblEndereco);

        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(120, 80, 300, 20);
        panel.add(txtEndereco);

        JLabel lblBairro = new JLabel("Bairro:");
        lblBairro.setBounds(440, 80, 50, 20);
        panel.add(lblBairro);

        JTextField txtBairro = new JTextField();
        txtBairro.setBounds(490, 80, 150, 20);
        panel.add(txtBairro);

        JLabel lblCEP = new JLabel("CEP:");
        lblCEP.setBounds(660, 80, 40, 20);
        panel.add(lblCEP);

        JTextField txtCEP = new JTextField();
        txtCEP.setBounds(700, 80, 160, 20);
        panel.add(txtCEP);

        JLabel lblMunicipio = new JLabel("Município:");
        lblMunicipio.setBounds(20, 110, 80, 20);
        panel.add(lblMunicipio);

        JTextField txtMunicipio = new JTextField();
        txtMunicipio.setBounds(100, 110, 200, 20);
        panel.add(txtMunicipio);

        /* ---------------------------------------------------------
         * Ambiente Produção (reposicionado e em verde)
         * --------------------------------------------------------- */
        JLabel lblAmbiente = new JLabel("Ambiente Produção");
        lblAmbiente.setBounds(730, 10, 200, 20);                    // ← novo X,Y
        lblAmbiente.setForeground(new java.awt.Color(0, 153, 0));   // verde
        panel.add(lblAmbiente);

        JLabel lblNumero = new JLabel("Nº 00000000");
        lblNumero.setBounds(730, 25, 200, 20);                      // ← novo X,Y
        lblNumero.setForeground(new java.awt.Color(0, 153, 0));     // verde
        panel.add(lblNumero);

        /* --------------------------------------------------------- */
        JLabel lblData = new JLabel("Data de Entrada / Hora de Saída:");
        lblData.setBounds(480, 110, 220, 20);
        panel.add(lblData);

        JTextField txtData = new JTextField("00/00/0000");
        txtData.setBounds(700, 110, 80, 20);
        panel.add(txtData);

        JTextField txtHora = new JTextField("00:00");
        txtHora.setBounds(790, 110, 80, 20);
        panel.add(txtHora);

        JButton btnNFE = new JButton("NFE - Produtos");
        btnNFE.setBounds(20, 150, 150, 25);
        panel.add(btnNFE);

        JButton btnImportar = new JButton("Importar");
        btnImportar.setBounds(180, 150, 150, 25);
        panel.add(btnImportar);

        String[] colunas = {
            "Código", "Descrição", "Marca", "Fornecedor", "Fabricação", "Validade"
        };
        Object[][] dados = {
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            { "", "", "", "", "", "" },
            
            
            
            
            
        };
        JTable tabela = new JTable(dados, colunas);
        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBounds(20, 190, 850, 250);
        panel.add(scroll);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroProdutos().setVisible(true));
    }
}

