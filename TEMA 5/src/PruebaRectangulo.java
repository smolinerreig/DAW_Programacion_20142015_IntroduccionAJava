public class PruebaRectangulo {

	public static void main(String[] args) {
		
		Punto q=new Punto(2,3);
		Punto w=new Punto(7,3);
		Punto e=new Punto(7,6);
		Punto r=new Punto(2,6);
		Rectangulo a=new Rectangulo(q,w,e,r);
		Rectangulo b=new Rectangulo(7,4);
		
		System.out.println(a.area());
		System.out.println(b.area());
		a.desplazar(2,-7);
		b.desplazar(2,-7);
		
	}

}
