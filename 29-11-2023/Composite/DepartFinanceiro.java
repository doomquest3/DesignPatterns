public class DepartFinanceiro implements Departamento {
    private Integer id;
    private String nome;

    public DepartFinanceiro(Integer id, String nome){
        this.id = id;
        this.nome = nome;

    }

    public void printDepartamento(){
        System.out.println(getClass().getSimpleName());

    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}
