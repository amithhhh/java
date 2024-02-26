import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.rmi.registry.*;
public class Server{

	public static void main(String args[]){

		try{
			
			Complexc cs = new Complexc();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi",cs);
			System.out.println("Server is ready....!");
	
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
