package oracle.jdbc;
import java.sql.*;
public class jdbcDemo {

	public static void main(String[] args) {
      Connection con=null;
      Statement st=null;
      ResultSet rs=null;
	try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
         st=con.createStatement();
		 rs=st.executeQuery("select*from employee");
		while(rs.next()){
			System.out.println(+rs.getInt("Eid")+","+rs.getString("emp_Name")+","+rs.getInt("userAge"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	}

}
