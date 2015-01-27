import java.util.*;
public class NIF {
	
	private int cifras;
	private char letra;
	private Scanner kb=new Scanner (System.in);

	
	public NIF(){
		cifras=00000000;
		letra=' ';
	}
	
	public NIF(int dni){
		cifras=dni;
		letra=this.obtenerLetra();
		
	}
	
	
	
	public void leer(){
		System.out.println("\nInserte su DNI");
		int dni=kb.nextInt();
		cifras=dni;
		letra=this.obtenerLetra();
	}
	
	public void mostrar(){
		System.out.println("\nSu NIF: "+cifras+"-"+letra);
	}
	
	private char obtenerLetra(){
		char L=' ';
		
		switch(cifras%23){
		case 0: L='T'; break;
		case 1: L='R'; break;
		case 2: L='W'; break;
		case 3: L='A'; break;
		case 4: L='G'; break;
		case 5: L='M'; break;
		case 6: L='Y'; break;
		case 7: L='F'; break;
		case 8: L='P'; break;
		case 9: L='D'; break;
		case 10: L='X'; break;
		case 11: L='B'; break;
		case 12: L='N'; break;
		case 13: L='J'; break;
		case 14: L='Z'; break;
		case 15: L='S'; break;
		case 16: L='Q'; break;
		case 17: L='V'; break;
		case 18: L='H'; break;
		case 19: L='L'; break;
		case 20: L='C'; break;
		case 21: L='K'; break;
		case 22: L='E'; break;
		
		}
		
		return L;
	}

}
