public class FormCads {
    private String alerta = "Seu formulário foi enviado com sucesso!";
    private BancoDados a = new BancoDados();

    public void confirmarEnvio(boolean autorizar, ObjetoDom b){
        System.out.println(alerta);
        a.ConnectarBD(autorizar, b);
    }
}
