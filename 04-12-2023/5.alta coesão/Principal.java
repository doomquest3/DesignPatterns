public class Principal{
    

    public static void main(String[] args){
        CriarEmail leandroEmail = new CriarEmail("Leandro@gmail.com", "Leandro de jesus");

        EnviarEmail enviarEmail = new EnviarEmail(leandroEmail.getEmail(), "emailTal@gmail.com", "Me devolve os 100 reais", leandroEmail);

        enviarEmail.Enviar();

    }

}