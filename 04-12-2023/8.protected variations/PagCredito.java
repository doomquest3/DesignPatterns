public class PagCredito implements Pagamento{
    

    @Override
    public void pagar(double pagamento){
        System.out.println("Credito foi pago, pagamento de R$"+pagamento);

    }
}
