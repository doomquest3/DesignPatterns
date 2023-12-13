public class Principal{

    public static void main(String[] args){
        Creator criarItem = new Creator();
        Item a = criarItem.criarObject("Colher",1,"Comer comida");
        System.out.println(a);
        System.out.println(a.getNome());
        System.out.println(a.getDescricao());
        System.out.println(a.getQuantidade());
    }

}