import java.util.Scanner;


public class Ejercicios {
	
	public static void main(String[]args) {
		
		int i,j,k;
		i = 1;
		j = 2;
		k = (i > j) ? 2*i : 3*j+1;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		i = 2;
		j = 1;
		k = (i > j) ? 2*i : 3*j+1;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		
		int p,q;
		boolean t;
		p = 1;
		q = 2;
		t=(p>q)?true:false;
		System.out.println("p = " + p);
		System.out.println("q = " + q);
		System.out.println("t = " + t);
		p = 2;
		q = 1;
		t=(p>q)?true:false;
		System.out.println("i = " + p);
		System.out.println("j = " + q);
		System.out.println("t = " + t);
		
		Scanner teclado = new Scanner(System.in);
		int x;
		int y;
		String cadena;
		boolean resultado;
		System.out.println("Introducir primer número:");
		x = teclado.nextInt();//pedimos el primer número
		System.out.println("Introducir segundo número:");
		y = teclado.nextInt();//pedimos el segundo número
		//realizamos las comparaciones
		cadena=(x==y)?"iguales":"distintos";
		System.out.printf("Los números %d y %d son %s\n", x, y, cadena);
		resultado=(x!=y);
		System.out.println("x != y // es " +resultado);
		resultado=(x<y);
		System.out.println("x < y // es " +resultado);
		resultado=(x>y);
		System.out.println("x > y // es " +resultado );
		
		System.out.println("Demostracion de operadores logicos");
		System.out.println("Negacion: ! false es : " + (! false));
		System.out.println(" ! true es : " + (! true));
		System.out.println("Suma: false | false es : " + (false | false));
		System.out.println(" false | true es : " + (false | true));
		System.out.println(" true | false es : " + (true | false));
		System.out.println(" true | true es : " + (true | true));
		System.out.println("Producto: false & false es : " + (false & false));
		System.out.println(" false & true es : " + (false & true));
		System.out.println(" true & false es : " + (true & false));
		System.out.println(" true & true es : " + (true & true));
		
	}

}
