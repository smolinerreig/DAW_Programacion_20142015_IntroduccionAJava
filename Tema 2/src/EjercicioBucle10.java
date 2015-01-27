import java.util.*;

public class EjercicioBucle10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("---Introduzca notas---");
		
		int nota;
		int susp=0;
		int cond=0;
		int apr=0;
		
		for(int v=0;v<6;v++){
			nota=kb.nextInt();
			if (nota<5){System.out.printf("Suspenso "); susp++;  
				if (nota==4){System.out.printf("Condicionado"); cond++;}
			} 
			else{System.out.println("Aprobado"); apr++;}
				
		}
		System.out.println("El número de suspensos es "+susp+", de los cuales condicionados "+cond+", y el número de aprobados es "+apr);		
	}

}
