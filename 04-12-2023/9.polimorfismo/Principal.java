public class Principal{

    public static void main(String[] args){
        Vendedor leandro = new Vendedor("Leandro", 333, 2000);
        Diretor bah = new Diretor("Bah Bah", 111,15000);

        leandro.bonitifcacaoSalario();
        bah.bonitifcacaoSalario();

    }

}