package Sorveteria.data;

import javax.swing.JOptionPane;


public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            JOptionPane.showMessageDialog(null, "Conexao ok");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
