package oops.demo;
import java.sql.*;
import java.util.Scanner;
public class JDBCDemo {
	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/today","root","Sakthi@130901");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement s;
		try {
			System.out.println("Enter the parts id to be searched :");
			int pid=sc.nextInt();
			s=con.prepareStatement("select *from parts where p_id=?");
			s.setInt(1, pid);
			ResultSet rs=s.executeQuery();
			//int res=s.executeUpdate("insert into parts(p_id,p_name,color) values(16,'Mouse','Black')");
			//ResultSet rs=s.executeQuery("select * from parts");
			//System.out.println(res + " record(s) inserted..");
			while(rs.next())
			{
				System.out.println("Parts Id : "+rs.getInt("p_id"));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("Color : "+rs.getString(3));
				System.out.println("---------------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
