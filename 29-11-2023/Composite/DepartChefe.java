import java.util.ArrayList;
import java.util.List;

public class DepartChefe implements Departamento{
    private Integer id;
    private String nome;

    private List<Departamento> listaDepartamento;

    public DepartChefe(Integer id,String nome){
        this.id = id;
        this.nome = nome;
        this.listaDepartamento = new ArrayList<>();

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

    public void printDepartamento(){
        listaDepartamento.forEach(Departamento::printDepartamento);

    };

    public void addDepartamento(Departamento departamento){
        listaDepartamento.add(departamento);

    }

    public void removerDepartamento(Departamento departamento){
        listaDepartamento.remove(departamento);

    }

}
