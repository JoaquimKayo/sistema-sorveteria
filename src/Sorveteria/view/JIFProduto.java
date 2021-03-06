/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorveteria.view;

import Sorveteria.data.FornecedorData;
import Sorveteria.data.ProdutoData;
import Sorveteria.model.Fornecedor;
import Sorveteria.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kayo_
 */
public class JIFProduto extends javax.swing.JInternalFrame {
    Produto obj;
    ProdutoData DAO;
    FornecedorData DAOF;
    ArrayList<Fornecedor> listaFornecedor;
    ArrayList<Produto> lista;
    int acao = 0;
    
    public JIFProduto() {
        
        try{
            obj = new Produto();
            lista = new ArrayList<>();
            DAO = new ProdutoData();
            DAOF = new FornecedorData();
            listaFornecedor = DAOF.carregarCombo();
        
            initComponents();
        
            for (Fornecedor f : listaFornecedor) {
                jcbFornecedor.addItem(f.getRazao_social());
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Erro ao Conectar: "+ex.getMessage());
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodigoBarra = new javax.swing.JTextField();
        jtTipo = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jcbFornecedor = new javax.swing.JComboBox<>();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jsEstoque = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CADASTRO DE PRODUTOS");

        jLabel1.setText("Código de Barras:");

        jLabel2.setText("Tipo:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Fornecedor:");

        jtCodigoBarra.setEnabled(false);

        jtTipo.setEnabled(false);

        jtPreco.setEnabled(false);

        jcbFornecedor.setEnabled(false);

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Barras", "Tipo", "Preço", "Fornecedor", "Estoque", "Código Interno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        jLabel5.setText("Pesquisa:");

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jLabel6.setText("Estoque:");

        jsEstoque.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jsEstoque.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPesquisa))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jsEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this ,"Você tem certeza que deseja Excluir o Produto ("+jtTipo.getText()+")", "Exclusão",JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            try {
                if(DAO.excluir(Long.parseLong(jtCodigoBarra.getText()))){
                    JOptionPane.showMessageDialog(this, "Excluído com sucesso");
                    jbCancelarActionPerformed(evt);
                    jtPesquisa.setEnabled(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o registro: "+e.getMessage());
            }
        }else{  
            JOptionPane.showMessageDialog(this, "Fique tranquilo que o registro não será excluído!! ;)");
        } 

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        Sorveteria.data.extras.Formulario.limparCampos(this);
        Sorveteria.data.extras.Formulario.tratarCampos(this, true);
        jcbFornecedor.setEnabled(true);
        jsEstoque.setEnabled(true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        acao = 1; //incluir (INSERT)
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        Sorveteria.data.extras.Formulario.limparCampos(this);
        Sorveteria.data.extras.Formulario.tratarCampos(this, false);
        DefaultTableModel mp = (DefaultTableModel)jtbDados.getModel();

        jcbFornecedor.setEnabled(false);
        jsEstoque.setEnabled(false);
        jsEstoque.setValue(0);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtPesquisa.setText("");
        jtPesquisa.setEnabled(true);
        mp.setNumRows(0);//limpar a tabela
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
            //validar dados
            if (validarDados()) {
                //preencher objeto
                if (preencherObjeto()) {
                    if (acao == 1){
                        //incluir no banco
                        if(DAO.incluir(obj)){
                            //mostrar menssagem 
                            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso", "Salvar", JOptionPane.WARNING_MESSAGE);
                            //limpar a tela
                            jbCancelarActionPerformed(evt);
                        }else{
                            JOptionPane.showMessageDialog(this, "Erro ao salvar: ", "Salvar-Publicacao", JOptionPane.ERROR_MESSAGE);
                        } 
                    }
                    if(acao == 2){
                        if(DAO.editar(obj)){
                            JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso", "Atualizar", JOptionPane.WARNING_MESSAGE);
                            jbCancelarActionPerformed(evt);
                        }else{
                            JOptionPane.showMessageDialog(this, "Erro ao Atualizar: ", "Atualizar-Produto", JOptionPane.ERROR_MESSAGE);
                        } 
                    }
                }
            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage(), "Salvar-Produto", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        Sorveteria.data.extras.Formulario.limparCampos(this);
        Sorveteria.data.extras.Formulario.tratarCampos(this, false);
        jsEstoque.setEnabled(false);

        try {
            int linha = jtbDados.getSelectedRow();
            if(linha>-1){

                jtCodigoBarra.setText(jtbDados.getValueAt(jtbDados.getSelectedRow(), 0).toString());
                jtTipo.setText(jtbDados.getValueAt(jtbDados.getSelectedRow(), 1).toString());
                jtPreco.setText(jtbDados.getValueAt(jtbDados.getSelectedRow(), 2).toString());
                
                //o for abaixo percorre os itens do combobox e compara a razão_social que vem da JTable com a razao_social 
                //que esta no combobox, ao encontrar atribui o valor do index para a variavel index, e seta o index ao combobox
                //assim nao necessita usar o addItem, e evitar criar varios itens dentro do combobox
                int index = 0;
                for (int i = 0; i < jcbFornecedor.getItemCount(); i++) {
                    jcbFornecedor.setSelectedIndex(i);
                    if (jtbDados.getValueAt(jtbDados.getSelectedRow(), 3).toString().equals((String)jcbFornecedor.getSelectedItem())) {
                        index = i;
                    }
                }
                jcbFornecedor.setSelectedIndex(index);

                
                jsEstoque.setValue(Integer.parseInt(jtbDados.getValueAt(jtbDados.getSelectedRow(), 4).toString()));
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbCancelar.setEnabled(true);

            } else {
                jbEditar.setEnabled(false);
                jbExcluir.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar o registro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        try {
            int qtd = jtPesquisa.getText().length();
            
            DefaultTableModel mp = (DefaultTableModel)jtbDados.getModel();

            if (qtd < 3) {
                mp.setNumRows(0);//limpar a tabela
            }else{
                mp.setNumRows(0);
                lista = DAO.pesquisar(jtPesquisa.getText());
                for(Produto p: lista){
                    ////Long Codigo_Barra, String tipo, Float Preco, String Cnpj_fornecedor, int Estoque, int idProduto
                    mp.addRow(new String[]{""+p.getCodigo_barra(),p.getTipo(),""+p.getPreco(),DAOF.retornarRazaoSocial(p.getCnpj_fornecedor()), ""+p.getEstoque(), ""+p.getIdProduto()});
                }
            }
  
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar: "+e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        Sorveteria.data.extras.Formulario.tratarCampos(this, true);
        acao = 2; //editar (UPDATE)
        jtCodigoBarra.setEnabled(false);
        jsEstoque.setEnabled(true);
        jcbFornecedor.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbEditar.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed
    
    private boolean preencherObjeto() throws Exception{

        obj.setCodigo_barra(Long.parseLong(jtCodigoBarra.getText()));
        obj.setTipo(jtTipo.getText());
        obj.setPreco(Float.parseFloat(jtPreco.getText()));
        obj.setCnpj_fornecedor(DAOF.retornarCnpj((String)jcbFornecedor.getSelectedItem()));
        obj.setEstoque((int)jsEstoque.getValue());
        return true;
    }
    
    private boolean validarDados() throws Exception{
        if (jtCodigoBarra.getText().length() <= 0) 
            throw new Exception ("Informe um Código de Barras para o produto!");
        
        if (jtTipo.getText().length() < 3 || jtTipo.getText().length() > 100) 
            throw new Exception ("O Tipo deve ter entre 3 e 100 caractéres");
        
        if ( jtPreco.getText().length() <= 0 || Float.parseFloat(jtPreco.getText()) <= 0)
            throw new Exception ("Informe um preço para o produto!");
        
        
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbFornecedor;
    private javax.swing.JSpinner jsEstoque;
    private javax.swing.JTextField jtCodigoBarra;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtTipo;
    private javax.swing.JTable jtbDados;
    // End of variables declaration//GEN-END:variables
}
