public class BancoDados {
    
    public void ConnectarBD(boolean autorizar, ObjetoDom cadastro){
        if (autorizar) {
            System.out.println("Salvo no banco de dados! "+ cadastro);

        } else {
            System.out.println("Erro ao realizar cadastro no banco de dados, falha na autorização");

        }
    }
}
