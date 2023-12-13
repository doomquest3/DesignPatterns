public class Pagamento {
    private double valor;

    public void realizarPagamento(double valor){
        this.valor = valor;
        System.out.println("O valor pago foi de: R$"+this.valor );
    }
}
