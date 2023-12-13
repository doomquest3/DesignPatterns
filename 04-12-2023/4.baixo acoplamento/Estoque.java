import java.util.ArrayList;

public class Estoque {
    private String produto;
    private ArrayList<String> listaEstoque = new ArrayList<String>();

    public void addProduto(String nome){
        this.produto = nome;
        addEstoque(this.produto);
    }

    public void addEstoque(String nome){
        listaEstoque.add(nome);

    }

    public ArrayList<String> getListaEstoque() {
        return listaEstoque;
    
    }

    public void mostrarLista(){
        for (int i = 0; i < listaEstoque.size(); i++) {
            System.out.println(listaEstoque.get(i));
        }
    }
}
