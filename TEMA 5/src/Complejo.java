public class Complejo {
	
	private double pReal;
	private double pImag;
	
	public void asignar(double x, double y){
		pReal=x;
		pImag=y;
	}
	
	public void sumar(Complejo b){
			this.pReal=this.pReal + b.pReal;
			this.pImag=this.pImag + b.pImag;
	}
	
	public void imprimir(){
		System.out.println("Suma de n�mero real: "+pReal);
		System.out.println("Suma de n�mero imaginario: "+pImag);
	}

}
