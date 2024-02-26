import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.rmi.registry.*;
import java.rmi.registry.LocateRegistry;
public class Server{
	public static void main(String args[]){
		try{
			Bankc bc = new Bankc();
			LocateRegistry.createRegistry(1099);
            		Naming.rebind("rmi://localhost/BankService", bc);
            		System.out.println("Bank Server is running...");
		}catch(Exception e){
			System.out.println("something unwanted is happening");
		}
	}


}
