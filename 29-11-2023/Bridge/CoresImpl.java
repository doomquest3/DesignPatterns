public class CoresImpl implements Cores {
    private String nomeCor;

    public CoresImpl(String nomeCor){
        this.nomeCor = nomeCor;

    }

    public String getNomeCor() {
        return nomeCor;
    
    }
    
    @Override
    public void aplicarCor(){
        System.out.println("A cor a ser aplica é: "+this.nomeCor);
        
    }
}
