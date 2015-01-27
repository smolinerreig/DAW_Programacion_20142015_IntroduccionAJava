import java.util.*;

public class EjercicioBucleAnidado3 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner (System.in);
		
		System.out.println("---Introduzca un número entero largo---");
		int num=kb.nextInt();
		System.out.println("---¿Posicion de la cifra?---");
		int pos=kb.nextInt();
		int cif;
		int cif2;
		
		cif=(num%(int)Math.pow(10,pos)); 
		cif2=(cif/(int)Math.pow(10,pos-1));
		 
		System.out.println(cif2);
			
		
	}

}
