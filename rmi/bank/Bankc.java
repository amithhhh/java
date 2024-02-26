import java.io.*;
import java.util.Scanner;
import java.rmi.*;
import java.rmi.server.*;
public class Bankc extends UnicastRemoteObject implements Banki{

	int id,balance;
	String name;
	Scanner sc = new Scanner(System.in);
	public Bankc()throws RemoteException{
		super();		
		id = 1;
		name = "John";
		balance = 5000;
	}
	public int getId()throws RemoteException{
		return id;
	}
	public String getName() throws RemoteException{
		return name;
	}
	public int withDraw() throws RemoteException{
		int amount;
		System.out.println("enter the amount you want to withdraw/n");
		amount = sc.nextInt();
		balance = balance - amount;
		return balance;
	}
	public int deposit() throws RemoteException{
                int amount;
                System.out.println("enter the amount you want to deposit/n");
                amount = sc.nextInt();
                balance = balance + amount;
                return balance;
        }

}
