public class FormaImpl extends Formas{
    private String nomeForma;
    
    public FormaImpl(Cores c, String nome) {
        super(c);
        this.nomeForma = nome;
        
    }

    public void getNomeForma() {
        System.out.println("Nome da nossa forma: "+this.nomeForma);
    
    }
    
    @Override
    public void aplicarCor(){
        System.out.println("O Triângulo pintando com a cor: ");
        cor.aplicarCor();

    }

}
