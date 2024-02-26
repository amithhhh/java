import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.Scanner;
public class Client{

	public static void main(String args[]){
		try{
			Banki b = (Banki)Naming.lookup("rmi://localhost/BankService");
			int i;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your choice");
			i = sc.nextInt();
			switch(i){
			
				case 0: int id;
					id = b.getId();
					System.out.println("Id:"+id);
				case 1: String name;
					name = b.getName();
					System.out.println("Name:"+name);
				case 2: int balance;
					balance = b.withDraw();
					System.out.println("Balance:"+balance);
				case 3:	int amt;
					amt = b.deposit();
					System.out.println("Balance:"+amt); 

			}
		}catch(Exception e){
			System.out.println("something is happening");
		}
	}

}
