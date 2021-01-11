package Sorveteria.model;

public class Fornecedor {
    private String cnpj, razao_social, telefone;

    public Fornecedor(){
        cnpj = new String();
        razao_social = new String();
        telefone = new String();
    }
    
    public Fornecedor(String cnpj, String razao_social, String telefone) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
