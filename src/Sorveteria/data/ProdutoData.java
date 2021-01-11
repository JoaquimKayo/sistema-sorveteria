/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorveteria.data;

import Sorveteria.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kayo_
 */
public class ProdutoData extends Conexao{
    public ProdutoData() throws Exception{}
    
    public boolean incluir(Produto obj) throws Exception{
        PreparedStatement ps = getConexao().prepareStatement("INSERT INTO Produto (codigo_barra, tipo, preco, cnpj_fornecedor,estoque) values (?,?,?,?,?)");
        ps.setLong(1, obj.getCodigo_barra());
        ps.setString(2, obj.getTipo());
        ps.setFloat(3, obj.getPreco());
        ps.setString(4, obj.getCnpj_fornecedor());
        ps.setInt(5, obj.getEstoque());
        
        
        if (ps.executeUpdate() > 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Produto> pesquisar(String texto) throws Exception{
        ArrayList<Produto> dados = new ArrayList<>();
        String sql="Select * from Produto where Tipo ilike '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            //idProduto, tipo, preco, cnpj_fornecedor
            Produto obj = new Produto(rs.getInt("idProduto"),rs.getString("tipo"),rs.getString("cnpj_fornecedor"), rs.getFloat("preco"),rs.getLong("codigo_barra"),rs.getInt("estoque") );
            dados.add(obj);
        }  
        return dados;
    }
    
    public Produto retornarProduto(int idProduto) throws Exception{
        String sql = "SELECT * FROM Produto WHERE idProduto = "+idProduto+"";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return new Produto(rs.getInt("idProduto"), rs.getString("tipo"), "", rs.getFloat("preco"),rs.getLong("codigo_barra"),rs.getInt("estoque"));
        }
        throw new Exception("Produto não encontrado!");

    }
    
    public Produto retornarProdutoCodigoBarra(long codigo_barra) throws Exception{
        String sql = "SELECT * FROM Produto WHERE codigo_barra = "+codigo_barra+"";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return new Produto(rs.getInt("idProduto"), rs.getString("tipo"), "", rs.getFloat("preco"),rs.getLong("codigo_barra"),rs.getInt("estoque"));
        }
        throw new Exception("Produto não encontrado!");

    }
    
    
    public boolean excluir(long codigo_barra) throws Exception {
        String sql="delete from Produto where codigo_barra=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setLong(1,codigo_barra);
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(Produto obj) throws Exception {
        String sql="UPDATE Produto SET tipo = ?, preco = ?, cnpj_fornecedor = ?, estoque = ?  WHERE codigo_barra=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getTipo());
        ps.setFloat(2, obj.getPreco());
        ps.setString(3, obj.getCnpj_fornecedor());
        ps.setInt(4, obj.getEstoque());
        ps.setLong(5, obj.getCodigo_barra());
        
        return ps.executeUpdate()>0;
    }
    
}
