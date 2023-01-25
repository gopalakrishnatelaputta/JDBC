package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	 
	public class StatementBATCH_UPDATE {
	 
	    public static void main(String a[]){
	         
	        Connection con = null;
	        Statement st = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.
	                getConnection("jdbc:oracle:thin:@localhost:1521:orcl"
	                    ,"c##batch4pm","system");
	            con.setAutoCommit(false);
	            st = con.createStatement();
	            st.addBatch("update EMPLOYEE_INCOME set SALARY=30000 where empid=2");
	            st.addBatch("insert into EMPLOYEE_INCOME values (1,'Jhon',45000,1000)");
	            st.addBatch("update EMPLOYEE_INCOME set name='SANJU SAMSON' where empid=3");
	            int count[] = st.executeBatch();
	            for(int i=1;i<=count.length;i++){
	                System.out.println("Query "+i+" has effected "+count[i]+" times");
	            }
	            con.commit();
	        } catch (ClassNotFoundException e) {
	            try {
	                con.rollback();
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
	            e.printStackTrace();
	        } catch (SQLException e) {
	            try {
	                con.rollback();
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
	            e.printStackTrace();
	        } finally{
	            try{
	                if(st != null) st.close();
	                if(con != null) con.close();
	            } catch(Exception ex){}
	        }
	    }
	}


