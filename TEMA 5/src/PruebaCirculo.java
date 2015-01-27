
public class PruebaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1=new Circulo();
		Circulo c2=new Circulo();
		
		c1.asignaRadio(12.2);
		c2.asignaRadio(7.56);
		System.out.println(c1.daRadio());
		System.out.println(c2.daRadio());
		System.out.println(c1.perimetro());
		System.out.println(c2.perimetro());
		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println(c1.mayorQue(c2));
		
		
	}

}
