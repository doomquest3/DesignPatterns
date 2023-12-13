public class Vendedor extends Pessoa {
    private double salario;
    private double bonificacao = 0.2;
    public Vendedor(String nome,int cpf, double salario){
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
