public class Principal{

    public static void main(String[] args){
        PagCredito credito = new PagCredito();
        PagDebito debito = new PagDebito();

        credito.pagar(100);
        debito.pagar(200);

    }
    
}