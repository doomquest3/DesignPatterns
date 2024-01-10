import java.util.ArrayList;

public class Subscribe {
    private ArrayList<User> listaSubscribe = new ArrayList<User>();

    public void addSubscribe(User usuario){
        listaSubscribe.add(usuario);

        System.out.println("Subscribe realizado com sucesso!");
    }

    public void editSubscribe(User usuario, boolean inscricao){
        User editUser;
        if(listaSubscribe.contains(usuario)){
            int index = listaSubscribe.indexOf(usuario);
            editUser = listaSubscribe.get(index);
            editUser.setInscrito(inscricao);
            this.listaSubscribe.set(index, editUser);

            System.out.println("Edição realizada com sucesso: "+listaSubscribe.get(listaSubscribe.indexOf(usuario)).getInscrito());

        }
    }

    public void listaSubscribe(){
        System.out.println("Lista de subscribe : "+listaSubscribe);

    }

    public void EnviarAlerta(){   

        for (User user : listaSubscribe) {
            if(user.getInscrito() == true){
                
                System.out.println("Alerta enviando com sucesso para o usuário: "+user.getNome());

            }else{
                System.out.println("Erro ao enviar alerta para o usuário: "+user.getNome());
                System.out.println("O usuário não é cadastrado");

            }
            
        }

    }
}
