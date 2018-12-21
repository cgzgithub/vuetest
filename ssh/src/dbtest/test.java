package dbtest;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class test {

	private final static String url = "jdbc:mysql://127.0.0.1:3306/test";
	
	private final static String username = "root";
	
	private final static String password = "ABeam123";
	
	private static Connection conn=null;

    static{
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection)DriverManager.getConnection(url,username,password);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
        return conn;
    }
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Statement st = conn.createStatement();
		String sql = "SELECT * FROM user";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
            System.out.println(rs.getString("phone"));
        }
	}

}