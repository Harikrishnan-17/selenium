package harikrish;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class fillo {
	public static void main(String args[]) throws FilloException {
		Fillo fillo =new Fillo();
		Connection connection=fillo.getConnection("C:/Users/harikrishnanm/Downloads/list.xlsx");
		 String strQuery="Select * from Sheet1 where Name='John'";
	        Recordset recordset=connection.executeQuery(strQuery);
	         
	        while(recordset.next()){
	        System.out.println(recordset.getField("Country"));
	        }     
	        recordset.close();
	        connection.close();
		/*String strQuery2="INSERT INTO sheet1(Name,Country) VALUES('jeeva','UK')";
		//connection.executeUpdate(strQuery2);
		String strQuery1="Update Sheet1 Set Country='US' where ID=101 and name='John'"; 
		connection.executeUpdate(strQuery1);*/
	}

}
