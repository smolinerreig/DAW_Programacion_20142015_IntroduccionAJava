import java.util.*;
public class Calculadora {
	
	private int num1;
	private int num2;
	private int resultado;
	private Scanner kb=new Scanner(System.in);
	
	public Calculadora(int n1, int n2){
		num1=n1;
		num2=n2;
	}
	
	public int sumar(){
		int suma;
		suma=num1+num2;
		return suma;
	}
	
	public int restar(){
		int resta;
		resta=num1-num2;
		return resta;
	}
	
	public int multiplicar(){
		int mult;
		mult=num1*num2;
		return mult;
	}
	
	public double dividir(){
		double div;
		div=(double)num1/num2;
		return div;
	}
	
	public void imprimir(){
		System.out.println("¿Que operación quiere imprimir?\n(suma/resta/multiplicación/división)");
		String op=kb.next();
		switch(op){
		case "suma": System.out.println(this.sumar()); break;
		case "resta": System.out.println(this.restar()); break;
		case "multiplicación":System.out.println(this.multiplicar()); break;
		case "división": System.out.println(this.dividir()); break;
		
		} 
		
	}

}
