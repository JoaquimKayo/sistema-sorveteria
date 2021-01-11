package Sorveteria.data;

import Sorveteria.model.Cliente;
import Sorveteria.model.EmailCliente;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteData extends Conexao{
    public ClienteData() throws Exception{}
    
    public boolean incluir(Cliente obj) throws Exception{
        PreparedStatement ps = getConexao().prepareStatement("INSERT INTO Cliente (idCliente, telefone, nome, rua, numero, bairro, cidade) values (?,?,?,?,?,?,?)");
        ps.setInt(1, obj.getIdCliente());
        ps.setString(2, obj.getTelefone());
        ps.setString(3, obj.getNome());
        ps.setString(4, obj.getRua());
        ps.setInt(5, obj.getNumero());
        ps.setString(6, obj.getBairro());
        ps.setString(7, obj.getCidade());
        
        
        if (ps.executeUpdate() > 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public String retornarNome(int idCliente) throws Exception{
        String sql = "SELECT nome FROM Cliente WHERE idCliente = "+idCliente+"";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        /*
        try {
            rs.next();
            return rs.getString("nome");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Cliente não encontrado!!");
            return " ";
        }
        */
        
        if (rs.next()) {
            return rs.getString("nome");
        }
        throw new Exception("Cliente não encontrado!");
            
            
       

    }
    
    public ArrayList<Cliente> pesquisar(String texto) throws Exception{
        ArrayList<Cliente> dados = new ArrayList<>();
        String sql="Select * from Cliente c "
                + "INNER JOIN EmailCliente ec "
                + "ON c.idCliente = ec.idCliente "
                + "where Nome ilike '"+texto+"%'";
        
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            //int idCliente, int numero, String telefone, String nome, String rua, String bairro, String cidade
            Cliente obj = new Cliente(rs.getInt("idCliente"),rs.getInt("numero"),rs.getString("telefone"),rs.getString("nome"),rs.getString("rua"),rs.getString("bairro"),rs.getString("cidade"),new EmailCliente(rs.getInt("idCliente"),rs.getString("email")));
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
        
    public boolean excluir(int id) throws Exception {
        String sql="delete from Cliente where idCliente=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(Cliente obj) throws Exception {
        String sql="UPDATE Cliente SET telefone = ?, nome = ?, rua = ?, numero = ?, bairro = ?, cidade = ? WHERE idCliente=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getTelefone());
        ps.setString(2, obj.getNome());
        ps.setString(3, obj.getRua());
        ps.setInt(4, obj.getNumero());
        ps.setString(5, obj.getBairro());
        ps.setString(6, obj.getCidade());
        ps.setInt(7, obj.getIdCliente());
        return ps.executeUpdate()>0;
    }
}
