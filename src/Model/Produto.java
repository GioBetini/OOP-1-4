package Model;

public class Produto {
    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque < 0) {
            this.qtdEstoque = 0;
        } else {
            this.qtdEstoque = qtdEstoque;
        }

    }

    public boolean verificaProdutoDisponivel(String nome) {
        if (qtdEstoque > 0) {
            return true;
        } else {
            return false;
        }
    }

    public float totalValorestoque() {
        return preco * qtdEstoque;
    }

}
