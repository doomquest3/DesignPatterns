public class Cliente implements PesoKg{
    private String nome;
    private double peso;

    public Cliente (String nome, double peso){
        this.nome = nome;
        this.peso = peso;

    }
    
    public String getNome() {
        return nome;

    }
    public double getPeso() {
        return peso;
    
    }

    // Retorna o peso em quilograma.
    @Override
    public double getPesoKg(){
        return this.peso;

    }

}
