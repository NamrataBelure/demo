package oracle.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo2 {
     static String url="jdbc:mysql://localhost:3306/demo";
     static String user="root";
     static String pass="";
	public static void main(String[] args) {
	      Connection con=null;
	      Statement st=null;
	      ResultSet rs=null;
	      String sql=null;
	try {
		 con=DriverManager.getConnection(url,user,pass);
		 st=con.createStatement();
		 
		    rs=st.executeQuery("select*from employee");
			while(rs.next()){
				System.out.println(+rs.getInt("Eid")+","+rs.getString("emp_Name")+","+rs.getInt("userAge"));
			}
		 
		  sql="insert into employee"+"(EId,emp_Name,userAge)"+"values('14','harsh','29')";
		  st.executeUpdate(sql);
		  System.out.println("insert data successfully....");
		
		/*  sql="update employee"+"SET emp_Name='piuu'"+"WHERE eId='12'";
		  st.executeUpdate(sql);
		  System.out.println("Data Updated sucessfully...");
		*/
		sql="delete from employee where emp_name='harsh'";
		int RowsAffected=st.executeUpdate(sql);
		System.out.println("RowsAffected..."+RowsAffected);
		System.out.println("Data Deleted sucessfully...");
	} catch (Exception e) {
         e.printStackTrace();
	}

	}

}
