package Sorveteria.data;

import Sorveteria.model.EmailCliente;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class EmailClienteData extends Conexao{
    public EmailClienteData() throws Exception{}
    
        public boolean incluir(EmailCliente obj) throws Exception{
        PreparedStatement ps = getConexao().prepareStatement("INSERT INTO EmailCliente (idCliente, email) values (?,?)");
        ps.setInt(1, obj.getIdCliente());
        ps.setString(2, obj.getEmailCliente());
        
        
        if (ps.executeUpdate() > 0) {
            return true;
        }else{
            return false;
        }
    }
}
