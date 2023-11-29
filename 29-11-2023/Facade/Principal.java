public class Principal {
    
    public static void main(String[] args){
        Facede novoFacede = new Facede();
        WithoutFacede novWithoutFacede = new WithoutFacede();

        novoFacede.gerarRelatorio("MySQL", "PDF", "Algo", true);
        // novWithoutFacede.gerarRelatorioWithoutFacade("MySQL", "PDF", "Algo", true);
        
    }
}
