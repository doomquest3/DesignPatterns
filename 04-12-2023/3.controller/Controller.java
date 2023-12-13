public class Controller {
    public void Controlador(boolean autorizacao,ObjetoDom form){
        FormCads enviarForm = new FormCads();
        enviarForm.confirmarEnvio(autorizacao, form);
    }
}
