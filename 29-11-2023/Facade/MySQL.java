public class MySQL {
    public void MySQLPDFReport(String tablename,boolean con){
        if(con==true){
            System.out.println("Relatorio MySQL em formado PDF");
            
        }else{
            System.out.println("Conexão falhada ao requisitar relatório PDF! Tente novamente!");

        }
    }

    public void mySQLHTMLReport(String tablename, boolean con){
        if(con==true){
            System.out.println("Relatorio MySQL em formado HTML");

        }else{
            System.out.println("Conexão falhada ao requisitar relatório HTML! Tente novamente!");

        }
    }

}
