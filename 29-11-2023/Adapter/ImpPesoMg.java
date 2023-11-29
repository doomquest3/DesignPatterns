public class ImpPesoMg implements PesoMg{
    private PesoKg a;
    
    public ImpPesoMg(PesoKg a) {
        this.a = a;
        
    }

    @Override
    public double getPesoGrama(){
        return converterPeso(a.getPesoKg());

    }

    // Retorna o peso em grama.
    private double converterPeso(double peso){
        return peso * 1000;
    }

}
