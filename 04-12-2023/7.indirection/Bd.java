public class Bd {
    private Cliente novoCliente;

    public void addCliente(Cliente a){
        if(a.getNome() != " "){
            this.novoCliente = a;
            System.out.println("Dado salvo com sucesso!");
            System.out.println("Nome do usuário: "+this.novoCliente.getNome());
        }else{
            System.out.println("Erro ao armazenar dados!");
        }

    }

    public Cliente getNovoCliente() {
        return novoCliente;
    }
}
