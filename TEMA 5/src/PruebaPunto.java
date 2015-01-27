
public class PruebaPunto {
	public static void main (String args[]){
		Punto p0=new Punto(); 
		Punto p1=new Punto(2,3);
		
		System.out.println("p1.x: "+p1.getX()); //sacar las coordenadas
		System.out.println("p1.y: "+p1.getY());
		
		
		System.out.print("Coordenadas del punto en posición original: "); p0.imprimir();
		System.out.print("Coordenadas del punto de ejemplo: "); p1.imprimir();
		
		
		
		
	}
}
