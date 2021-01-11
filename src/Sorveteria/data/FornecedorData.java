package Sorveteria.data;

import Sorveteria.model.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FornecedorData extends Conexao{
    public FornecedorData() throws Exception{}
    
    public boolean incluir(Fornecedor obj) throws Exception{
        PreparedStatement ps = getConexao().prepareStatement("INSERT INTO Fornecedor(cnpj, razao_social, telefone) VALUES (?, ?, ?)");
        ps.setString(1, obj.getCnpj());
        ps.setString(2, obj.getRazao_social());
        ps.setString(3, obj.getTelefone());
    
        if (ps.executeUpdate() > 0) {
            return true;            
        }else{
            return false;
        }

    }
    
    public ArrayList<Fornecedor> pesquisar(String texto) throws Exception{
        ArrayList<Fornecedor> dados = new ArrayList<>();
        String sql="Select * from Fornecedor where razao_social ilike '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            //int idCliente, int numero, String telefone, String nome, String rua, String bairro, String cidade
            Fornecedor obj = new Fornecedor(rs.getString("cnpj"),rs.getString("razao_social"),rs.getString("telefone"));
            dados.add(obj);
        }  
        return dados;
    }
    
    public String tirarParenteses(String telefone) throws Exception{
        StringBuilder sb = new StringBuilder(telefone);
        
        //detelar o "(" : (##) ##### - ####
        sb.deleteCharAt(0);
        
        //deletar 0 ")" : ##) ##### - ####
        sb.deleteCharAt(2);
        
        //deletar o "-" : ## ##### - ####
        sb.deleteCharAt(7);
        
        //agr inserir o prefixo "+55" na posicao 0: +55 ## ##### ####
        sb.insert(0, "+55");
        
        return sb.toString();
    }
    
        public String colocarParenteses(String telefone) throws Exception{
        StringBuilder sb = new StringBuilder(telefone);
        
        //deletar o prefixo "+55" : +55 ## ##### ####
        for (int i = 0; i < 3; i++) {
            sb.deleteCharAt(0);
        }
        
        //inserir o Parenteses "(": ## ##### ####
        //sb.insert(0, "(");
       
        return sb.toString();
    }
        
    public boolean excluir(String cnpj) throws Exception {
        String sql="delete from Fornecedor where cnpj=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,cnpj);
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(Fornecedor obj) throws Exception {
        String sql="UPDATE Fornecedor SET razao_social = ?, telefone = ? WHERE cnpj=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getRazao_social());
        ps.setString(2, obj.getTelefone());
        ps.setString(3, obj.getCnpj());
        
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<Fornecedor> carregarCombo() throws Exception{
        ArrayList<Fornecedor> dados = new ArrayList<>();
        String sql="Select * from Fornecedor order by razao_social";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            //int idCliente, int numero, String telefone, String nome, String rua, String bairro, String cidade
            Fornecedor obj = new Fornecedor(rs.getString("cnpj"),rs.getString("razao_social"),rs.getString("telefone"));
            dados.add(obj);
        }  
        return dados;
    }
}
