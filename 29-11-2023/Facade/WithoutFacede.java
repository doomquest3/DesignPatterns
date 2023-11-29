
// // Estrutura sem utilização do facede design patterns.
public class WithoutFacede {


	public void gerarRelatorioWithoutFacade(String dbType, String reportType, String tableName, boolean con){

			MySQL mySqlHelper = new MySQL();
			mySqlHelper.mySQLHTMLReport(tableName, con);
			mySqlHelper.MySQLPDFReport(tableName, con);
			MySQL MySQLDB = new MySQL();
			MySQLDB.mySQLHTMLReport(tableName, con);
			MySQLDB.MySQLPDFReport(tableName, con);



			Oracle oracleHelper = new Oracle();
			Oracle oracleDB = new Oracle();
			oracleDB.getOraclePDFReport(tableName, con);
			oracleHelper.getOracleHTMLReport(tableName, con);
			oracleHelper.getOraclePDFReport(tableName, con);

			
		
		
	}
}
