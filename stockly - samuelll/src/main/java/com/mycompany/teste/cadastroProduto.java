/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author s.beretta
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cadastroProduto extends JFrame {

    private static final Logger logger = Logger.getLogger(cadastroProduto.class.getName());

    public cadastroProduto() {
        setTitle("Cadastro de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 700);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        JPanel topo = new JPanel(new GridLayout(5, 4, 10, 10));

        topo.add(new JLabel("Funcionário:"));
        topo.add(new JComboBox<>(new String[]{"Estoquista", "Supervisor", "Administrador"}));
        topo.add(new JLabel("Importar:"));
        topo.add(new JButton("📥 Importar"));

        topo.add(new JLabel("Nome / Razão Social:"));
        topo.add(new JTextField());
        topo.add(new JLabel("UF:"));
        topo.add(new JTextField(2));

        topo.add(new JLabel("CNPJ:"));
        topo.add(new JTextField());
        topo.add(new JLabel("Data da Entrada:"));
        topo.add(new JTextField());

        topo.add(new JLabel("Hora da Entrada:"));
        topo.add(new JTextField());
        topo.add(new JLabel("Endereço:"));
        topo.add(new JTextField());
        topo.add(new JLabel("Bairro:"));
        topo.add(new JTextField());

        topo.add(new JLabel("CEP:"));
        topo.add(new JTextField());
        topo.add(new JLabel("Município:"));
        topo.add(new JTextField());

        JButton btnNFe = new JButton("NFe - Produtos");
        btnNFe.setBackground(new Color(0, 102, 204));
        btnNFe.setForeground(Color.WHITE);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPanel.add(btnNFe);

        String[] colunas = {"Código", "Descrição", "Marca", "Fornecedor", "Fabricação", "Validade"};
        JTable tabela = new JTable(new DefaultTableModel(colunas, 7));
        JScrollPane scroll = new JScrollPane(tabela);

        JPanel centro = new JPanel(new BorderLayout());
        centro.add(btnPanel, BorderLayout.NORTH);
        centro.add(scroll, BorderLayout.CENTER);

        painel.add(topo, BorderLayout.NORTH);
        painel.add(centro, BorderLayout.CENTER);

        add(painel);
        setVisible(true);
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_fundo1 = new javax.swing.JPanel();
        painel_fundo2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Funcionario = new javax.swing.JList<>();
        funcionarios = new javax.swing.JLabel();
        ambiente_Producao = new javax.swing.JLabel();
        id_numeroNFe = new javax.swing.JLabel();
        id_fornecedor_nome = new javax.swing.JLabel();
        Nome_Empresas = new javax.swing.JTextField();
        UF = new javax.swing.JTextField();
        CNPJ = new javax.swing.JTextField();
        id_cnpj = new javax.swing.JLabel();
        id_data_entrada = new javax.swing.JLabel();
        data_entrada = new javax.swing.JTextField();
        id_hora_entrada = new javax.swing.JLabel();
        hora_entrada = new javax.swing.JTextField();
        importar = new javax.swing.JButton();
        Endereco = new javax.swing.JTextField();
        id_endereco = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        id_bairro = new javax.swing.JLabel();
        CEP = new javax.swing.JTextField();
        id_cep = new javax.swing.JLabel();
        municipio = new javax.swing.JTextField();
        id_municipio = new javax.swing.JLabel();
        nfe_produtos = new javax.swing.JButton();
        codigo = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        fornecedor = new javax.swing.JLabel();
        fabricacao = new javax.swing.JLabel();
        validade = new javax.swing.JLabel();
        descricoes = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        descricoes1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        descricoes2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        descricoes3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        descricoes4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        descricoes5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        descricoes6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(81, 195, 70));

        painel_fundo1.setBackground(new java.awt.Color(81, 195, 70));

        painel_fundo2.setBackground(new java.awt.Color(230, 230, 230));

        Funcionario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Estoquista", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Funcionario);

        funcionarios.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        funcionarios.setText("Funcionário:");

        ambiente_Producao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ambiente_Producao.setForeground(new java.awt.Color(35, 123, 59));
        ambiente_Producao.setText("Ambiente Produção");

        id_numeroNFe.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        id_numeroNFe.setForeground(new java.awt.Color(35, 123, 59));
        id_numeroNFe.setText("N° 000007629");

        id_fornecedor_nome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        id_fornecedor_nome.setText("Nome / Razão Social:");

        Nome_Empresas.setForeground(new java.awt.Color(153, 153, 153));
        Nome_Empresas.setText("Digite o nome / razão social");

        UF.setForeground(new java.awt.Color(153, 153, 153));
        UF.setText("UF");
        UF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UFActionPerformed(evt);
            }
        });

        CNPJ.setForeground(new java.awt.Color(153, 153, 153));
        CNPJ.setText("Digite o CNPJ");

        id_cnpj.setText("CNPJ");

        id_data_entrada.setText("Data Da Entrada");

        id_hora_entrada.setText("Hora Da Entrada");

        importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/teste/importar (1) 1.png"))); // NOI18N
        importar.setText("Importar");

        Endereco.setForeground(new java.awt.Color(153, 153, 153));
        Endereco.setText("Digite o endereço");

        id_endereco.setText("Endereço");

        Bairro.setForeground(new java.awt.Color(153, 153, 153));
        Bairro.setText("Digite o Bairro");

        id_bairro.setText("Bairro");

        CEP.setForeground(new java.awt.Color(153, 153, 153));
        CEP.setText("Digite o CEP");

        id_cep.setText("CEP");

        municipio.setForeground(new java.awt.Color(153, 153, 153));
        municipio.setText("Digite o Municipio");

        id_municipio.setText("Municipío");

        nfe_produtos.setBackground(new java.awt.Color(0, 102, 204));
        nfe_produtos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nfe_produtos.setForeground(new java.awt.Color(255, 255, 255));
        nfe_produtos.setText("NFe - Produtos");

        codigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codigo.setText("Código");

        descricao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        descricao.setText("Descrição");

        marca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        marca.setText("Marca");

        fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fornecedor.setText("Fornecedor");

        fabricacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fabricacao.setText("Fabricação");

        validade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validade.setText("Validade");

        descricoes.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoesLayout = new javax.swing.GroupLayout(descricoes);
        descricoes.setLayout(descricoesLayout);
        descricoesLayout.setHorizontalGroup(
            descricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addContainerGap(914, Short.MAX_VALUE))
        );
        descricoesLayout.setVerticalGroup(
            descricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        descricoes1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoes1Layout = new javax.swing.GroupLayout(descricoes1);
        descricoes1.setLayout(descricoes1Layout);
        descricoes1Layout.setHorizontalGroup(
            descricoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descricoes1Layout.setVerticalGroup(
            descricoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        descricoes2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoes2Layout = new javax.swing.GroupLayout(descricoes2);
        descricoes2.setLayout(descricoes2Layout);
        descricoes2Layout.setHorizontalGroup(
            descricoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descricoes2Layout.setVerticalGroup(
            descricoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        descricoes3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoes3Layout = new javax.swing.GroupLayout(descricoes3);
        descricoes3.setLayout(descricoes3Layout);
        descricoes3Layout.setHorizontalGroup(
            descricoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descricoes3Layout.setVerticalGroup(
            descricoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        descricoes4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoes4Layout = new javax.swing.GroupLayout(descricoes4);
        descricoes4.setLayout(descricoes4Layout);
        descricoes4Layout.setHorizontalGroup(
            descricoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descricoes4Layout.setVerticalGroup(
            descricoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        descricoes5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoes5Layout = new javax.swing.GroupLayout(descricoes5);
        descricoes5.setLayout(descricoes5Layout);
        descricoes5Layout.setHorizontalGroup(
            descricoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descricoes5Layout.setVerticalGroup(
            descricoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        descricoes6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout descricoes6Layout = new javax.swing.GroupLayout(descricoes6);
        descricoes6.setLayout(descricoes6Layout);
        descricoes6Layout.setHorizontalGroup(
            descricoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descricoes6Layout.setVerticalGroup(
            descricoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descricoes6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_fundo2Layout = new javax.swing.GroupLayout(painel_fundo2);
        painel_fundo2.setLayout(painel_fundo2Layout);
        painel_fundo2Layout.setHorizontalGroup(
            painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nfe_produtos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                        .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_fundo2Layout.createSequentialGroup()
                                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                                        .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painel_fundo2Layout.createSequentialGroup()
                                                .addComponent(id_fornecedor_nome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(painel_fundo2Layout.createSequentialGroup()
                                                .addComponent(Nome_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)))
                                        .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_cnpj))
                                        .addGap(89, 89, 89))
                                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                                        .addComponent(id_endereco)
                                        .addGap(377, 377, 377)
                                        .addComponent(id_bairro)
                                        .addGap(140, 140, 140)
                                        .addComponent(id_cep)
                                        .addGap(132, 132, 132)
                                        .addComponent(id_municipio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_hora_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(data_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hora_entrada)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_fundo2Layout.createSequentialGroup()
                                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(funcionarios)
                                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(importar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ambiente_Producao)
                                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(id_numeroNFe))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_fundo2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(id_data_entrada)))
                        .addGap(26, 26, 26))
                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                        .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(municipio, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addGap(68, 68, 68))))
            .addGroup(painel_fundo2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addGap(88, 88, 88)
                        .addComponent(descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marca)
                        .addGap(82, 82, 82)
                        .addComponent(fornecedor)
                        .addGap(87, 87, 87)
                        .addComponent(fabricacao)
                        .addGap(91, 91, 91)
                        .addComponent(validade)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_fundo2Layout.createSequentialGroup()
                        .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descricoes6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricoes5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricoes4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricoes3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricoes2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricoes1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        painel_fundo2Layout.setVerticalGroup(
            painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundo2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcionarios)
                    .addComponent(ambiente_Producao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_numeroNFe)
                        .addComponent(importar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_data_entrada)
                .addGap(8, 8, 8)
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_fundo2Layout.createSequentialGroup()
                        .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_fornecedor_nome)
                            .addComponent(id_cnpj)
                            .addComponent(data_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nome_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id_hora_entrada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_endereco)
                        .addComponent(id_bairro)
                        .addComponent(id_cep)
                        .addComponent(id_municipio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nfe_produtos)
                .addGap(30, 30, 30)
                .addGroup(painel_fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(descricao)
                    .addComponent(marca)
                    .addComponent(fornecedor)
                    .addComponent(fabricacao)
                    .addComponent(validade))
                .addGap(18, 18, 18)
                .addComponent(descricoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricoes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descricoes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricoes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricoes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descricoes6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout painel_fundo1Layout = new javax.swing.GroupLayout(painel_fundo1);
        painel_fundo1.setLayout(painel_fundo1Layout);
        painel_fundo1Layout.setHorizontalGroup(
            painel_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundo1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painel_fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painel_fundo1Layout.setVerticalGroup(
            painel_fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fundo1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(painel_fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UFActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new cadastroProduto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField CNPJ;
    private javax.swing.JTextField Endereco;
    private javax.swing.JList<String> Funcionario;
    private javax.swing.JTextField Nome_Empresas;
    private javax.swing.JTextField UF;
    private javax.swing.JLabel ambiente_Producao;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField data_entrada;
    private javax.swing.JLabel descricao;
    private javax.swing.JPanel descricoes;
    private javax.swing.JPanel descricoes1;
    private javax.swing.JPanel descricoes2;
    private javax.swing.JPanel descricoes3;
    private javax.swing.JPanel descricoes4;
    private javax.swing.JPanel descricoes5;
    private javax.swing.JPanel descricoes6;
    private javax.swing.JLabel fabricacao;
    private javax.swing.JLabel fornecedor;
    private javax.swing.JLabel funcionarios;
    private javax.swing.JTextField hora_entrada;
    private javax.swing.JLabel id_bairro;
    private javax.swing.JLabel id_cep;
    private javax.swing.JLabel id_cnpj;
    private javax.swing.JLabel id_data_entrada;
    private javax.swing.JLabel id_endereco;
    private javax.swing.JLabel id_fornecedor_nome;
    private javax.swing.JLabel id_hora_entrada;
    private javax.swing.JLabel id_municipio;
    private javax.swing.JLabel id_numeroNFe;
    private javax.swing.JButton importar;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marca;
    private javax.swing.JTextField municipio;
    private javax.swing.JButton nfe_produtos;
    private javax.swing.JPanel painel_fundo1;
    private javax.swing.JPanel painel_fundo2;
    private javax.swing.JLabel validade;
    // End of variables declaration//GEN-END:variables
}
