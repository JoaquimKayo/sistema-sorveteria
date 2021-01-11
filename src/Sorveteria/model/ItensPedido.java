package Sorveteria.model;

public class ItensPedido {
    private int nroPedido, idProduto, quantidade;
    private float valor, valorUnitario;


    public ItensPedido() {
        nroPedido = 0;
        idProduto = 0;
        quantidade = 0;
        valorUnitario = 0;
        valor = 0;
    }

    public ItensPedido(int nroPedido, int idProduto, int quantidade, float valorUnitario,float valor) {
        this.nroPedido = nroPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valor = valor;
    }
    
    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
