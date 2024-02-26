import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class Complexc extends UnicastRemoteObject implements Complexi{

	Complex cs;
	public Complexc()throws RemoteException,IOException{
		
		cs = new Complex(0,0);	
	}
	public Complex add(Complex c1,Complex c2)throws Exception{
		cs.real = c1.real + c2.real;
		cs.img = c1.img + c2.img;
		return cs; 
	}
	public Complex subtract(Complex c1,Complex c2)throws Exception{ 
                cs.real = c1.real - c2.real; 
                cs.img = c1.img - c2.img; 
                return cs; 
        }
}
