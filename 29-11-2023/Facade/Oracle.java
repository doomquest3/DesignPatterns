
public class Oracle {
    public void getOraclePDFReport(String tablename,boolean con){
        if(con==true){
            System.out.println("Relatório MySQL em formado PDF");

        }else{
            System.out.println("Conexão falhada ao requisitar relatório PDF! Tente novamente!");

        }
    }

    public void getOracleHTMLReport(String tablename, boolean con){
        if(con==true){
            System.out.println("Relatorio MySQL em formado HTML");
            
        }else{
            System.out.println("Conexão falhada ao requisitar relatório HTML! Tente novamente!");

        }
    }
}
