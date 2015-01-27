public class CuentaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuen=new CuentaBancaria(20847563,5000);
		CuentaBancaria cuen3=new CuentaBancaria(456456,2000);
		CuentaBancaria cuen4=new CuentaBancaria(2134863,5000);
		
		cuen.mostrarDatos();
		cuen3.retirar(500);
		cuen4.ingresar(200);;
		cuen4.mostrarDatos();
		cuen3.mostrarDatos();
		

	}

}
