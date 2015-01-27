import java.util.*;

public class EjercicioBucle13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb=new Scanner(System.in);
		
		double cod=0;
		double vol=0;
		double pr_L=0;
		double fac_T=0;
		double vol_1=0;
		int c=0;
		
		
		for(int v=0;v<5;v++){
			
			System.out.println("---Inserte código de factura---");
				cod=kb.nextDouble();
			System.out.println("---Inserte volumen vendido (en Litros)---");
				vol=kb.nextDouble();
			System.out.println("---Inserte precio por litro (€/L)---");
				pr_L=kb.nextDouble();
				
				fac_T=fac_T+((double)vol*pr_L);
			
			if(v==0){vol_1=vol;}		
			if((vol*pr_L)>600){c++;}
			
		}
		
		System.out.println(fac_T);
		System.out.println(vol_1);
		System.out.println(c);
		
	}

}
