public class ValidarEmail {
    public Boolean Validacao(CriarEmail email){
        if (email.getEmail() != "") {
            return true;
        } else {
            return false;
        }
    }
    
}
