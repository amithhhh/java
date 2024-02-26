import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public interface Banki extends Remote{

	public int getId()throws RemoteException;
	public String getName() throws RemoteException;
	public int withDraw() throws RemoteException;
	public int deposit() throws RemoteException;

}
