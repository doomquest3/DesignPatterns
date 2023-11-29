public class Principal{

    public static void main(String[] args){
        FormaImpl triangulo = new FormaImpl( new CoresImpl("Azul"),"Triangulo");

        triangulo.aplicarCor();
        triangulo.getNomeForma();

    }

    
}