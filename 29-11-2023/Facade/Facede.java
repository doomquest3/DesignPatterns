// Estrutua utilizando design pattern facede.
public class Facede{

    public void gerarRelatorio(String dbType, String reportType, String tableName, boolean con){
		if(dbType == "MySQL"){
			MySQL mySqlHelper = new MySQL();
			if(reportType == "HTML"){
				mySqlHelper.mySQLHTMLReport(tableName, con);

			}else if(reportType == "PDF"){
				mySqlHelper.mySQLHTMLReport(tableName, con);

			}
		}else if(dbType == "ORACLE"){
			Oracle oracleHelper = new Oracle();
			if(reportType == "HTML"){
				oracleHelper.getOracleHTMLReport(tableName, con);

			}else if(reportType == "PDF"){
				oracleHelper.getOraclePDFReport(tableName, con);

			}
			
		}
		
	}

}