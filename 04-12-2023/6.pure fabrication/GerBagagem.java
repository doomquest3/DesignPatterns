import java.util.ArrayList;

public class GerBagagem {
    private String tipo;
    private int numero;
    private ArrayList<String> listaBagagens = new ArrayList<String>();


    public GerBagagem(String tipo, int numero){
        this.numero = numero;
        this.tipo = tipo;
        this.listaBagagens.add(tipo);
    }

    public int getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }

    public void addBagagens(String nome){
        this.listaBagagens.add(nome);

    }

    public void listaBagagens(){
        for (int i = 0; i < listaBagagens.size(); i++) {
            System.out.println("Item: "+listaBagagens.get(i));
        }
    }
}
