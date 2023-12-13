public class PagDebito implements Pagamento {
    
    @Override
    public void pagar(double pagamento){
        System.out.println("Pagamento em débito foi realizado, pagamento de R$"+pagamento);
        
    }
}
