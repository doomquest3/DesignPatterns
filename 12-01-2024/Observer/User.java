public class User {
    private String nome;
    private Boolean inscrito;
    private String email;

    public User(String nome, Boolean inscrito, String email){
        this.nome = nome;
        this.inscrito = inscrito;
        this.email = email;

    }

    public void retornarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Inscrição: "+this.inscrito);
        System.out.println("Email: "+this.email);
    }

    public void setInscrito(Boolean inscrito) {
        this.inscrito = inscrito;
    }

    public Boolean getInscrito() {
        return inscrito;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    
    }

}
