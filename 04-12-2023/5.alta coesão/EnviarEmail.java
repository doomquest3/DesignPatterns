public class EnviarEmail {
    private String origem;
    private String destinatario;
    private String conteudo;
    private CriarEmail email;
    private Boolean validado;

    public EnviarEmail(String origem, String destinatario, String conteudo, CriarEmail email){
        this.email = email;
        this.origem  = origem;
        this.destinatario = destinatario;
        this.conteudo = conteudo;

    }

    public String getConteudo() {
        return conteudo;
    
    }
    public String getDestinatario() {
        return destinatario;
    
    }
    public String getOrigem() {
        return origem;
    
    }
    public CriarEmail getEmail() {
        return email;
    
    }

    public void Enviar(){
        ValidarEmail validador = new ValidarEmail();
        this.validado = validador.Validacao(this.email);
        if(validado){
            System.out.println("Email enviado com sucesso! "+this.email);
            
        }else{
            System.out.println("Erro ao envio do email! "+this.email);

        }
    }
    
}
