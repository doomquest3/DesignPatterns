import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal{

    public static void main(String[] args){
        Produto Samsung1 = new Produto("Samsung Galaxy A4", 1, 300);
        Produto Samsung2 = new Produto("Samsung Galaxy A10", 1, 400);
        Produto Samsung3 = new Produto("Samsung Galaxy A20", 1, 500);

        Vendas vendasSamsung = new Vendas(Samsung1, Samsung1.getQtd());
        Vendas vendasSamsung2 = new Vendas(Samsung2, Samsung2.getQtd());
        Vendas vendasSamsung3 = new Vendas(Samsung3, Samsung3.getQtd());

        ArrayList<Vendas> listaProdutos = new ArrayList<Vendas>();

        listaProdutos.add(vendasSamsung);
        listaProdutos.add(vendasSamsung2);
        listaProdutos.add(vendasSamsung3);

        vendasSamsung.setListaProdutos(listaProdutos);

        vendasSamsung.calPrecoTotal();
        

    }

}