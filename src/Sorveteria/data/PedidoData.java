package Sorveteria.data;

import Sorveteria.model.Pedido;
import Sorveteria.model.ItensPedido;
import java.sql.PreparedStatement;

public class PedidoData extends Conexao{
    public PedidoData() throws Exception{}
    
    public boolean incluir(Pedido obj) throws Exception{
        
        getConexao().setAutoCommit(false);
        PreparedStatement ps = getConexao().prepareStatement("INSERT INTO Pedido (idCliente, total, data) values (?,?,now())");
        ps.setInt(1, obj.getIdCliente());
        ps.setFloat(2, obj.getTotal());




        if (ps.executeUpdate() > 0) {
            for(ItensPedido i: obj.getItens()){
                
            
                PreparedStatement ps2 = getConexao().prepareStatement("INSERT INTO ItensPedido (nroPedido, idProduto, quantidade, valor_unitario, valor) values ((select max(nropedido) from pedido),?,?,?,?)");
                
                ps2.setInt(1, i.getIdProduto());
                ps2.setInt(2, i.getQuantidade());
                ps2.setFloat(3, i.getValorUnitario());
                ps2.setFloat(4, i.getValor());

                

                if (ps2.executeUpdate() == 0) {
                    getConexao().rollback();
                    throw new Exception("Erro ao Inserir Item.");
                }
            }
            
        }else{
            return false;
        }
    
        getConexao().commit();
        getConexao().setAutoCommit(true);
        
        return true;
    }
    
    
}
