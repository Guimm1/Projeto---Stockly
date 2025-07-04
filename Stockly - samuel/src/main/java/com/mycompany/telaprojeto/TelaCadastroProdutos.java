package com.mycompany.telaprojeto;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.Random;
import java.util.Vector;

public class TelaCadastroProdutos extends JFrame {

    private JComboBox<String> cbFuncionario;
    private JTextField txtRazao, txtEstado, txtCNPJ, txtEndereco, txtBairro, txtCEP, txtMunicipio, txtData, txtHora;
    private JTable tabelaProdutos;
    private DefaultTableModel modeloTabela;
    private JButton btnImportar, btnNFE;

    public TelaCadastroProdutos() {
        initComponents();
        carregarFuncionarios();
    }

    private void initComponents() {
        setTitle("Cadastro de Produtos");
        setSize(950, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Borda verde ao redor da tela
        getRootPane().setBorder(new LineBorder(Color.GREEN, 3));

        JLabel lblFuncionario = new JLabel("Funcionário:");
        lblFuncionario.setBounds(20, 20, 100, 25);
        add(lblFuncionario);

        cbFuncionario = new JComboBox<>();
        cbFuncionario.setBounds(100, 20, 200, 25);
        add(cbFuncionario);

        JLabel lblRazao = new JLabel("Nome / Razão Social:");
        lblRazao.setBounds(20, 50, 150, 25);
        add(lblRazao);

        txtRazao = new JTextField();
        txtRazao.setBounds(150, 50, 200, 25);
        add(txtRazao);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(360, 50, 50, 25);
        add(lblEstado);

        txtEstado = new JTextField();
        txtEstado.setBounds(410, 50, 50, 25);
        add(txtEstado);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(470, 50, 50, 25);
        add(lblCNPJ);

        txtCNPJ = new JTextField();
        txtCNPJ.setBounds(510, 50, 150, 25);
        add(txtCNPJ);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(20, 80, 100, 25);
        add(lblEndereco);

        txtEndereco = new JTextField();
        txtEndereco.setBounds(100, 80, 200, 25);
        add(txtEndereco);

        JLabel lblBairro = new JLabel("Bairro:");
        lblBairro.setBounds(310, 80, 50, 25);
        add(lblBairro);

        txtBairro = new JTextField();
        txtBairro.setBounds(360, 80, 150, 25);
        add(txtBairro);

        JLabel lblCEP = new JLabel("CEP:");
        lblCEP.setBounds(520, 80, 50, 25);
        add(lblCEP);

        txtCEP = new JTextField();
        txtCEP.setBounds(560, 80, 100, 25);
        add(txtCEP);

        JLabel lblMunicipio = new JLabel("Município:");
        lblMunicipio.setBounds(20, 110, 100, 25);
        add(lblMunicipio);

        txtMunicipio = new JTextField();
        txtMunicipio.setBounds(100, 110, 200, 25);
        add(txtMunicipio);

        JLabel lblData = new JLabel("Data de Entrada / Hora de Saída:");
        lblData.setBounds(310, 110, 200, 25);
        add(lblData);

        txtData = new JTextField("00/00/0000");
        txtData.setBounds(510, 110, 80, 25);
        add(txtData);

        txtHora = new JTextField("00:00");
        txtHora.setBounds(600, 110, 60, 25);
        add(txtHora);

        btnNFE = new JButton("NFE - Produtos");
        btnNFE.setBounds(150, 150, 150, 30);
        add(btnNFE);

        btnImportar = new JButton("Importar");
        btnImportar.setBounds(310, 150, 150, 30);
        add(btnImportar);

        modeloTabela = new DefaultTableModel(new String[]{"Código", "Descrição", "Marca", "Fornecedor", "Fabricação", "Validade"}, 0);
        tabelaProdutos = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabelaProdutos);
        scrollPane.setBounds(20, 200, 900, 330);
        add(scrollPane);

        btnImportar.addActionListener(e -> cadastrarProdutoFornecedor());
    }

    private void carregarFuncionarios() {
        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement("SELECT nome_funcionario FROM funcionario");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                cbFuncionario.addItem(rs.getString("nome_funcionario"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cadastrarProdutoFornecedor() {
        try (Connection conn = conectar()) {
            conn.setAutoCommit(false);

            // Dados fictícios
            String nomeProduto = "Produto " + new Random().nextInt(1000);
            String marca = "Marca " + new Random().nextInt(100);
            LocalDate hoje = LocalDate.now();
            LocalDate validade = hoje.plusDays(30);
            int quantidade = new Random().nextInt(100) + 1;

            String fornecedorNome = "Fornecedor " + new Random().nextInt(1000);
            String cnpj = String.format("%011d", new Random().nextInt(999999999));
            String logadouro = "Rua Fictícia";
            String bairro = "Bairro Exemplo";
            int cep = 12345 + new Random().nextInt(9999);
            String municipio = "Cidade X";
            String estado = "ES";

            // Inserir fornecedor
            String sqlFornecedor = "INSERT INTO fornecedor (nome, cnpj, logadouro, bairro, cep, municipio, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psFornecedor = conn.prepareStatement(sqlFornecedor, Statement.RETURN_GENERATED_KEYS);
            psFornecedor.setString(1, fornecedorNome);
            psFornecedor.setString(2, cnpj);
            psFornecedor.setString(3, logadouro);
            psFornecedor.setString(4, bairro);
            psFornecedor.setInt(5, cep);
            psFornecedor.setString(6, municipio);
            psFornecedor.setString(7, estado);
            psFornecedor.executeUpdate();

            ResultSet rsFornecedor = psFornecedor.getGeneratedKeys();
            rsFornecedor.next();
            int idFornecedor = rsFornecedor.getInt(1);

            // Preencher os campos da tela
            txtRazao.setText(fornecedorNome);
            txtCNPJ.setText(cnpj);
            txtEndereco.setText(logadouro);
            txtBairro.setText(bairro);
            txtCEP.setText(String.valueOf(cep));
            txtMunicipio.setText(municipio);
            txtEstado.setText(estado);

            // Inserir produto
            String sqlProduto = "INSERT INTO produto (nome, marca, fabricacao, validade, quantidade) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psProduto = conn.prepareStatement(sqlProduto, Statement.RETURN_GENERATED_KEYS);
            psProduto.setString(1, nomeProduto);
            psProduto.setString(2, marca);
            psProduto.setDate(3, Date.valueOf(hoje));
            psProduto.setDate(4, Date.valueOf(validade));
            psProduto.setInt(5, quantidade);
            psProduto.executeUpdate();

            ResultSet rsProduto = psProduto.getGeneratedKeys();
            rsProduto.next();
            int idProduto = rsProduto.getInt(1);

            // Vincular produto a fornecedor
            String sqlVinculo = "INSERT INTO produto_fornecedor (id_fornecedor, id_produto, data_expedicao) VALUES (?, ?, ?)";
            PreparedStatement psVinculo = conn.prepareStatement(sqlVinculo);
            psVinculo.setInt(1, idFornecedor);
            psVinculo.setInt(2, idProduto);
            psVinculo.setDate(3, Date.valueOf(hoje));
            psVinculo.executeUpdate();

            conn.commit();

            // Adiciona na tabela da interface
            Vector<String> linha = new Vector<>();
            linha.add(String.valueOf(idProduto));
            linha.add(nomeProduto);
            linha.add(marca);
            linha.add(fornecedorNome);
            linha.add(hoje.toString());
            linha.add(validade.toString());
            modeloTabela.addRow(linha);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private Connection conectar() throws Exception {
        String url = "jdbc:mysql://localhost:3306/stocklys";
        String usuario = "root";
        String senha = ""; // Altere aqui
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, usuario, senha);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroProdutos().setVisible(true));
    }
}
