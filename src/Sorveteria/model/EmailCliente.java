package Sorveteria.model;

/**
 *
 * @author kayo_
 */
public class EmailCliente {
    private int idCliente;
    private String emailCliente;

    public EmailCliente(){
        idCliente = 0;
        emailCliente = new String();
        
    }
    
    public EmailCliente(int idCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.emailCliente = emailCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    
}
