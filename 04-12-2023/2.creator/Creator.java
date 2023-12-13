public class Creator {
    
    public Item criarObject(String nome, int qtd, String desc){
        Item newObject = new Item(nome, qtd, desc);
        return newObject;
    }
}
