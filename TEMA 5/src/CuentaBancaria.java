
public class CuentaBancaria {
	private static int numC=100000;
	private int idCuenta;
	private int dni;
	private int saldo;
	private int interes=4;	
	
	public CuentaBancaria(){
		idCuenta=numC;
		numC++;
	}
	
	public CuentaBancaria(int id, int saved){
		dni=id;
		saldo=saved;
		idCuenta=numC;
		numC++;
	}
	
	public void ingresar(int in){
		saldo=saldo+in;
	}
	
	public void retirar(int out){
		saldo=saldo-out;
	}
	
	public void mostrarDatos(){
		System.out.println("\nNúmero de Cuenta: "+idCuenta);
		System.out.println("DNI: "+dni);
		System.out.println("Saldo en la cuenta: "+saldo);
		System.out.println("Interés de la cuenta: "+interes);
	}
}
