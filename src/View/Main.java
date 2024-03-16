package View;

import javax.swing.JOptionPane;

import Model.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto();

        p1.setNome(JOptionPane.showInputDialog("Qual produto deseja cadastrar? "));
        p1.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Qual será o preço de "+p1.getNome()+"? ")));
        p1.setQtdEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quanto temos em estoque desse produto? ")));


        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println(p1.getQtdEstoque());

        if(p1.verificaProdutoDisponivel("caneta")){
            System.out.println("temos "+p1.getQtdEstoque()+" unidades!");
        } else {
            System.out.println("estamos sem estoques deste produto :(");
        }

        System.out.println("O total em estoque de "+p1.getNome() +"equivale a: R$"+p1.totalValorestoque()+"!");
    }
}
