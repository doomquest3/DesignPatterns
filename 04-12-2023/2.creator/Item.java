public class Item {
    private String nome;
    private int quantidade;
    private String descricao;

    public Item(String nome, int quantidade, String descricao){
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;

    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
}
