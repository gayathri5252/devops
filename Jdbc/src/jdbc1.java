                                                                                                                       import java.sql.*;
import java.util.*;
//import java.lang.*;
public class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException {
		try 
		{	
			Scanner s = new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","oracle");//conecc statmen
			Statement s1 = c.createStatement();
			PreparedStatement ps=c.prepareStatement("INSERT INTO Gayathri.dept values(?,?,?)");
			//ResultSet rs=s1.executeQuery("select * from Gayathri.DEPT");
					ps.setInt(1,s.nextInt());
			ps.setString(2,s.next());
			ps.setString(3,s.next());
			int count = ps.executeUpdate();
		/*	while(rs.next())
			{
				System.out.println("deptno "+rs.getInt(1)+" "+"\tdname "+rs.getString(2));
			}
			//System.out.println(count+" rows inserted");
			*/
		}
		catch(SQLException e)
		
		{
			System.out.println(e);
		}
	
	}

	
}

