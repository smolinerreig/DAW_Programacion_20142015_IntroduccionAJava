import java.util.*;

public class EjercicioExtra1 {
	
	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("---ELIJA SU PRODUCTO---");
		System.out.println("(1)Caf� solo\n(2)Cortado\n(3)Chocolate\n(4)Leche");
		int x=teclado.nextInt();
		
		if ((x==1)^(x==4)){System.out.println("Caf� solo o leche: 35 c�ntimos");}
		else if(x==2){System.out.println("Cortado: 40 c�ntimos");}
		else if(x==3){System.out.println("Chocolate: 30 c�ntimos");}
		
		
		
	}

}
