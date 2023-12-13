public class AddClient {
    
    public void AdicionarCliente(Cliente novoCliente){
        Bd a = new Bd();
        a.addCliente(novoCliente);
        
    }
}
