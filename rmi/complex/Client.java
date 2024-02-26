import java.rmi.*;
import java.io.*;
import java.util.Scanner;
public class Client{

	public static void main(String args[]){
		try{
			Complexi com = (Complexi)Naming.lookup("rmi");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the real and imaginary of first number");
			int r1 = sc.nextInt();
			int i1 = sc.nextInt();
			System.out.println("enter the real and imaginary of second number");
                	int r2 = sc.nextInt();
                	int i2 = sc.nextInt();
			Complex cs1 = new Complex(r1,i1);
			Complex cs2 = new Complex(r2,i2);
			Complex cs3 = new Complex(0,0);
			Complex cs4 = new Complex(0,0);
			cs3 = com.add(cs1,cs2);
			cs4 = com.subtract(cs1,cs2);
			System.out.println("\nsum="+cs3.real+"+"+cs3.img+"i");
			System.out.println("\ndiff="+cs4.real+"+"+cs4.img+"i");
		}catch(Exception e){
			System.out.println(e);
		}
	}


}
