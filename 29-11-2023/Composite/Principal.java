public class Principal{

    // Composite Design patterns
    public static void main(String[] args){
        Departamento departamentoVendas = new DepartVendas(1,"Departamento de vendas");
        Departamento departamentoFinancas = new DepartFinanceiro(1,"Deparamento financeiro");
        DepartChefe departamentoChefe = new DepartChefe(1,"Departamento chefe");

        departamentoChefe.addDepartamento(departamentoVendas);
        departamentoChefe.addDepartamento(departamentoFinancas);

        departamentoChefe.printDepartamento();

    }
    
}