public class Principal{

    public static void main(String[] args){
        Cliente Leandro = new Cliente("Leandro de jesus");
        AddClient newAdd = new AddClient();

        newAdd.AdicionarCliente(Leandro);
    }

}