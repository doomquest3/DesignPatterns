public class Produto{
    private String nome;
    private int preco;
    int qtd;

    public Produto(String nome, int qtd, int preco){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    
    }
    public int getQtd() {
        return qtd;
    
    }
    public int getPreco() {
        return preco;
    
    }
}