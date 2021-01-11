package Sorveteria.model;

public class Produto {
    private int idProduto, estoque;
    private String tipo,cnpj_fornecedor;
    private long codigo_barra;
    private float preco;

    public Produto(){
        idProduto= 0;
        tipo = new String();
        preco = 0;
        codigo_barra = 0;
        cnpj_fornecedor = new String();
        estoque = 0;
    }
    
    public Produto(int idProduto, String tipo, String cnpj_fornecedor, float preco, long codigo_barra, int estoque) {
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.cnpj_fornecedor = cnpj_fornecedor;
        this.preco = preco;
        this.codigo_barra = codigo_barra;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public long getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(long codigo_barra) {
        this.codigo_barra = codigo_barra;
    }
    
    
}
