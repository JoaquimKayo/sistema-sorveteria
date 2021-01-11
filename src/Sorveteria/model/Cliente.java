package Sorveteria.model;

public class Cliente {
    private int idCliente, numero;
    private String telefone, nome, rua, bairro, cidade;
    private EmailCliente email;

    public EmailCliente getEmail() {
        return email;
    }

    public void setEmail(EmailCliente email) {
        this.email = email;
    }
    public Cliente(){
        idCliente = 0;
        numero = 0;
        telefone = new String();
        nome = new String();
        rua = new String();
        bairro  = new String();
        cidade = new String();
        email = new EmailCliente();
    }
    
    public Cliente(int idCliente, int numero, String telefone, String nome, String rua, String bairro, String cidade, EmailCliente email) {
        this.idCliente = idCliente;
        this.numero = numero;
        this.telefone = telefone;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
   
}
