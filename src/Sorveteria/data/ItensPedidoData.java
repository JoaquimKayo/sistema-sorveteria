
package Sorveteria.data;

import Sorveteria.model.ItensPedido;
import java.sql.PreparedStatement;

public class ItensPedidoData extends Conexao{
    public ItensPedidoData() throws Exception{}
    
    public boolean incluir(ItensPedido obj) throws Exception{
        PreparedStatement ps = getConexao().prepareStatement("INSERT INTO ItensPedido (nroPedido, idProduto, quantidade, valor_unitario, valor) values (?,?,?,?,?)");
        ps.setInt(1, obj.getNroPedido());
        ps.setInt(2, obj.getIdProduto());
        ps.setInt(3, obj.getQuantidade());
        ps.setFloat(4, obj.getValorUnitario());
        ps.setFloat(5, obj.getValor());



        if (ps.executeUpdate() > 0) {
            return true;
        }else{
            return false;
        }
    }
    
}
