public class Diretor extends Pessoa {
    private double salario;
    private double bonificacao = 1.1;
    public Diretor(String nome,int cpf, double salario){
        super(nome, cpf);
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public void bonitifcacaoSalario(){
        System.out.println("Sua bonificação é de: "+this.salario * this.bonificacao);
        
    }
}
