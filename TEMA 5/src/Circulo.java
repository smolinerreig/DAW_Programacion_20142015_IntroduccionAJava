import java.math.*;
public class Circulo {
	
	private double radio;
	
	public Circulo(){
		
	}
	
	public void asignaRadio(double rad){
		radio=rad;
	}
	
	public double daRadio(){
		return radio;
	}
	
	public double perimetro(){
		double circ=2*radio*Math.PI;
		return circ;
	}
	
	public double area(){
		double ar=Math.PI*radio*radio;
		return ar;
		}
	
	public boolean mayorQue(Circulo c){
		if(this.perimetro()>c.perimetro()){
			return true;
		}else{return false;}
		
	}

}
