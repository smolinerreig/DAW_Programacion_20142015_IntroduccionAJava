import java.util.*;

public class Punto {
	
	private Scanner kb=new Scanner (System.in);
	private int x;
	private int y;
	
	public Punto(){
		x=0;
		y=0;
	}
	
	public Punto(int x1, int y1){
		x=x1;
		y=y1;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
		
	}
	
	public void imprimir(){
		System.out.println("("+x+","+y+")");
		
	}
	
	public void desplazar(int desp_Horiz, int desp_Vert){
		x=x+desp_Horiz;
		y=y+desp_Vert;
	}

}
