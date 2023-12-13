public class Principal {
    
    public static void main(String[] args){
        ObjetoDom form = new ObjetoDom("Leandro", "Rua tal");
        Controller control = new Controller();

        control.Controlador(true, form);
    }
}
