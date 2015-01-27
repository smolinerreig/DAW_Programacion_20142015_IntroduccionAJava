import java.util.*;

public class EjercicioResumen123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb=new Scanner (System.in);
		
		System.out.println("¿En cuantas ciudades se ha actuado?");
		
		int N=kb.nextInt();
		double act [][]=new double [N][10];
		double ingC[]=new double[N];
		
		String nom[]=new String[N];
		String maxCiud="trololo", minCiud="tralala";
		int n=0; String nombre;
		double ing=0, maxIng=0, minIng=0;
		int opc=0;
		int numAct[]=new int[N];
		
		int histog[]=new int[11];
		
		for(int i=0;i<N;i++){
			n=0;
			
			System.out.println("¿Cual es el nombre de la ciudad "+i+"?");
			nom[i]=kb.next();
			
			System.out.println("¿Cuantas actuaciones se celebraron en "+nom[i]+"?");
			n=kb.nextInt();
			numAct[i]=n;
			
			for(int j=0;j<n;j++){
				
				System.out.println("¿Cuanto se cobró en la actuación "+j+"?");
				act[i][j]=kb.nextDouble();
				
				ingC[i]=ingC[i]+act[i][j];
				ing=ing+act[i][j];
				
			}
			

		}
		
		do{
			
			System.out.println("\nMENÚ\n-----------------------\n(1)Mostrar actuaciones.\n(2)Recaudación máxima.\n(3)Recaudación mínima.\n(4)Histograma de actuaciones.\n(5)Ingresos medios.\n(6)Terminar programa.");
			n=0;
			opc=kb.nextInt();
			
			switch(opc){
			
			case 1:
				System.out.println("\n¿De qué ciudad quiere conocer las actuaciones?");
				nombre=kb.next();
				
				for(int v=0;v<N;v++){
					
					if((nom[v].equals(nombre))&&(act[v][0]!=0)){
						
							for(int j=0;j<numAct[v];j++){
								System.out.println("ACTUACIÓN Nº "+j);
								System.out.println("Ingresos: "+act[v][j]);
								System.out.println("-------------------------------");
								
							}
							System.out.println("\n\n");
						
						break;
						
					}else if(act[v][0]==0)
						{System.out.println("No ha habido actuaciones en esta ciudad");
					}
					
				}break;
				
				
			case 2:
				
				for(int i=0;i<N;i++){
					
					if (i==0){maxIng=ingC[i]; maxCiud=nom[i];}
					else if(ingC[i]>maxIng){
						maxIng=ingC[i];maxCiud=nom[i];}
					
				}
				System.out.println("\nLa ciudad en que mayor recaudación hubo fue "+maxCiud+", con un total de "+maxIng);
				
				break;
				
			case 3:
				
				for(int i=0;i<N;i++){
					
					if (i==0){minIng=ingC[i]; minCiud=nom[i];}
					else if(ingC[i]<minIng){
						minIng=ingC[i];minCiud=nom[i];}
					
				}
				System.out.println("\nLa ciudad en que menor recaudación hubo fue "+minCiud+", con un total de "+minIng);
				
				break;
				
				
			case 4:
				
				for(int i=0;i<11;i++){
					System.out.print("\nNúmero de ciudades con "+i+" actuaciones: ");
					for(int j=0;j<N;j++){
						
						if(numAct[j]==i){
							histog[i]++;
							System.out.print("+ ");
						}
						
					}
					
					
				}
				System.out.println("");
				break;
			
			case 5:
				
				System.out.println("La recaudación media es de "+(double)ing/N+" por ciudad");
				System.out.println("Las ciudades que han superado dicha media son: ");
				
				for(int i=0;i<N;i++){
					 if(ingC[i]>((double)ing/N)){
						 System.out.print(nom[i]+"  ");
					 }
					
				}
				break;
				
			}
			
			
		}while(opc!=6);

		System.out.println("Programa terminado.");
		
	}

}
