public class Principal{

    /*
        PADRÕES DE INTERFACE (29/11/2023 - 02/12/2023)
        Adapter
        Façade
        Composite
        Bridge
    */

    public static void main(String[] args){

        Cliente leandro = new Cliente("leandro",2);
        System.out.println("Peso em Kg: "+leandro.getPesoKg());
        ImpPesoMg convert = new ImpPesoMg(leandro);
        System.out.println("Peso em Mg: "+convert.getPesoGrama());

    }

}