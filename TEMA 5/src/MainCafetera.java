import java.util.*;
public class MainCafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera c=new Cafetera(1000);
			
		Scanner kb=new Scanner (System.in);
		int op=1;
		
		while(op!=4){
			
			System.out.println("Bienvenido a su cafetera parlante.\n¿En que puedo ayudarle?");
			System.out.println("----------------------------------------------------------");
			System.out.println("\n(1)--->Llenar cafetera.\n(2)--->Servir taza de café (100cc.).\n(3)--->Agregar café a la cafetera (300 cc.).\n(4)--->Terminar programa de cafetera.");
			
			op=kb.nextInt();
			
			if(op<1&&op>4){
				System.out.println("Sea tan amable de ceñirse a los parámetros de mi programación.");
			}else{
				
				switch(op){
				
				case 1: c.llenarCafetera(); break;
				case 2: c.servirTaza(100); break;
				case 3: c.agregarCafe(300); break;
				case 4: System.out.println("Programa terminado.");break;
				
				}
				
			}
		}
		

		

	}

}
