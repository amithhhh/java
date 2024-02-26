import java.io.*;
import java.util.Scanner;
import java.sql.*;
public class Employee{

	public static void main(String args[]){

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			System.out.println("something wnt wrong");
		}

		try{
			int i;
			int id;
			String name;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","3141");
			PreparedStatement psmt = con.prepareStatement("insert into Employee values(?,?)");
			Scanner sc = new Scanner(System.in);
			ResultSet rs;
			i = sc.nextInt();

			switch(i){

				case 1:
					System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.nextLine();
					psmt.setInt(1,id);
					psmt.setString(2,name);
				        psmt.executeQuery();


			}

		}catch(Exception e){
			System.out.println(e);
		}

	}

}
