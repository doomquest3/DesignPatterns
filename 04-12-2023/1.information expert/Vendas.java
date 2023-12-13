import java.util.ArrayList;

public class Vendas {
    private int qtdItens;
    private Produto itens;
    private ArrayList<Vendas> listaProdutos = new ArrayList<Vendas>();
    private double precoTotal = 0;

    public Vendas(Produto itens, int qtdItens){
        this.itens = itens;
        this.qtdItens = qtdItens;

    }

    public int getQtdItens() {
        return qtdItens;

    }

    public int getpreco(){
        return this.itens.getPreco();
    }

    public void setListaProdutos(ArrayList<Vendas> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void calPrecoTotal(){
        for(Vendas item : this.listaProdutos){
            precoTotal += item.getpreco();
        }

        System.out.println(precoTotal);
        System.out.println();
    }
}
