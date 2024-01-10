class Principal{

    public static void main(String[] args){

        User Leandro = new User("Leandro de jesus", true,"Leandro@gmail.com");
        User Douglas = new User("Douglas Sousa", true,"DS@gmail.com");
        User André = new User("André Queiroz", false,"AQZ@gmail.com");

        Subscribe Apple = new Subscribe();


        Apple.addSubscribe(Leandro);
        Apple.addSubscribe(Douglas);
        Apple.addSubscribe(André);

        Apple.editSubscribe(André, true);

        
    }
}