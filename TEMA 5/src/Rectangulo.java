public class Rectangulo {
	private Punto xy1;
	private Punto xy2;
	private Punto xy3;
	private Punto xy4;
	private int base;
	private int altura;
	
	
	public Rectangulo(Punto zd1, Punto zd2, Punto zd3, Punto zd4){
		xy1=zd1;
		xy2=zd2;
		xy3=zd3;
		xy4=zd4;
		base=zd2.getX()-zd1.getX();
		altura=zd3.getY()-zd1.getY();
	}
	
	public Rectangulo(int ba, int alt){
		base=ba;
		altura=alt;
		xy1=new Punto(0,0);
		xy2=new Punto(base,0);
		xy3=new Punto(0,altura);
		xy4=new Punto(base, altura);
	}
	
	public double area(){
		
		int ar=base*altura;	
		return ar;
	}
	
	public void desplazar(int desp_Horiz, int desp_Vert){
		xy1.desplazar(desp_Horiz, desp_Vert);
		xy2.desplazar(desp_Horiz, desp_Vert);
		xy3.desplazar(desp_Horiz, desp_Vert);
		xy4.desplazar(desp_Horiz, desp_Vert);
		
		System.out.println("\nNuevos vértices del triángulo");
		xy1.imprimir(); xy2.imprimir(); xy3.imprimir(); xy4.imprimir();
	}

}
