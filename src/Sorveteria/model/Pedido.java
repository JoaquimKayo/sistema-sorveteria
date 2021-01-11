package Sorveteria.model;

import java.util.ArrayList;


public class Pedido {
    private int nroPedido, idCliente;
    private float total;
    private String data;
    ArrayList<ItensPedido> itens;

    public Pedido(int nroPedido, int idCliente, float total, String data, ArrayList<ItensPedido> itens) {
        this.nroPedido = nroPedido;
        this.idCliente = idCliente;
        this.total = total;
        this.data = data;
        this.itens = itens;
    }

    public Pedido() {
        nroPedido = 0;
        idCliente = 0;
        total = 0;
        data = new String();
        itens = new ArrayList<>();
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<ItensPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItensPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItensPedido obj){
        this.itens.add(obj);
    }
}
