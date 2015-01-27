import java.util.*;

public class EjercicioExtra3 {

	public static void main(String args[]){
		
		System.out.println("---ESCRIBA SUS CARACTERES--- \n(a,b,c,d,e)");
		Scanner teclado=new Scanner(System.in);
		char x=teclado.next().charAt(0); //leer un carácter por teclado
		
		switch(x){
		case'a':System.out.println("10");break;
		case'b':System.out.println("8-10");break;
		case'c':System.out.println("6-8");break;
		case'd':System.out.println("5-6");break;
		case'e':System.out.println("0-5");break;
		}
		
	} //para comparar -----> equals(one)
	
}
