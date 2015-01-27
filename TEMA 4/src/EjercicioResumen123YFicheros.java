import java.io.*;
import java.util.*;

public class EjercicioResumen123YFicheros {
	
	public static void main (String args[]) throws FileNotFoundException{
		
		Scanner in=null;
		
			
			int n=0;
			int nCiud=5;
			String nom[]=new String[nCiud];
			int numAct[]=new int[10];
			double act[][]=new double[nCiud][10];
			double ingC[]=new double[nCiud];
			double ing=0;
			
		try{  
			in=new Scanner(new FileReader("actividadeconómica.txt"));
			
			for(int i=0;i<nCiud;i++){
				n=0;
				nom[i]=in.next();
				
				n=in.nextInt();
				numAct[i]=n;
				
				for(int j=0;j<n;j++){
					
					act[i][j]=in.nextDouble();
					
					ingC[i]=ingC[i]+act[i][j];
					ing=ing+act[i][j];
					
				}
				
			}
			
		}catch(FileNotFoundException e){
			System.out.println("ERROR: "+e);
		}finally{
			if(in!=null){in.close();}
		} //LECTURA
			
			Scanner kb=new Scanner(System.in);
			int opc=0;
			String nombre="lala";
			double maxIng=0, minIng=9999999;
			String maxCiud="tralala", minCiud="trololo";
			int histog[]=new int [11];
			
			do{
				
				System.out.println("\nMENÚ\n-----------------------\n(1)Mostrar actuaciones.\n(2)Recaudación máxima.\n(3)Recaudación mínima.\n(4)Histograma de actuaciones.\n(5)Generar informe de actividad económica.\n(6)Terminar programa.");
				n=0;
				opc=kb.nextInt();
				
				switch(opc){
				
				case 1:
					System.out.println("\n¿De qué ciudad quiere conocer las actuaciones?");
					nombre=kb.next();
					
					for(int v=0;v<nCiud;v++){
						
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
					
					for(int i=0;i<nCiud;i++){
						
						if (i==0){maxIng=ingC[i]; maxCiud=nom[i];}
						else if(ingC[i]>maxIng){
							maxIng=ingC[i];maxCiud=nom[i];}
						
					}
					System.out.println("\nLa ciudad en que mayor recaudación hubo fue "+maxCiud+", con un total de "+maxIng);
					
					break;
					
				case 3:
					
					for(int i=0;i<nCiud;i++){
						
						if (i==0){minIng=ingC[i]; minCiud=nom[i];}
						else if(ingC[i]<minIng){
							minIng=ingC[i];minCiud=nom[i];}
						
					}
					System.out.println("\nLa ciudad en que menor recaudación hubo fue "+minCiud+", con un total de "+minIng);
					
					break;
					
					
				case 4:
					
					for(int i=0;i<11;i++){
						System.out.print("\nNúmero de ciudades con "+i+" actuaciones: ");
						for(int j=0;j<nCiud;j++){
							
							if(numAct[j]==i){
								histog[i]++;
								System.out.print("+ ");
							}
							
						}
						
						
					}
					System.out.println("");
					break;
				
				case 5:
					PrintWriter out=null;
					try{
					
					out=new PrintWriter("informegestión.txt");
					out.println("La recaudación media es de "+(double)ing/nCiud+" por ciudad");
					out.println("Las ciudades que han superado dicha media son: ");
					
					for(int i=0;i<nCiud;i++){
						 if(ingC[i]>((double)ing/nCiud)){
							 out.print(nom[i]+"  ");
						 }
						
					}
					}catch(IOException e){
						out.println("ERROR: "+ e);
					}finally{
						if(out!=null){out.close();} //ESCRITURA
					}
					break;
					
				}
				
				
			}while(opc!=6);
			
		
		
	}

}
