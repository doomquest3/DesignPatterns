public class Principal{

    public static void main(String[] args){
        Pagamento pagar1 = new Pagamento();
        Estoque produtosEstoque = new Estoque();

        pagar1.realizarPagamento(20);

        produtosEstoque.addEstoque("Beringela");
        produtosEstoque.addEstoque("Maça");
        produtosEstoque.addEstoque("Banana");
        produtosEstoque.addEstoque("Uva");

        produtosEstoque.mostrarLista();
    }
    
}