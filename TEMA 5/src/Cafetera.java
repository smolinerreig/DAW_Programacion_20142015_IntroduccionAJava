public class Cafetera {
	private int capMax;
	private int cantAct;
	
	public Cafetera(){
		capMax=1000;
		cantAct=0;
	}
	
	public Cafetera(int max){
		capMax=max;
		cantAct=max;
	}
	
	public Cafetera(int max, int act){
		capMax=max;
		if(act>max){
			cantAct=max;
		}else{
			cantAct=act;
		}
	}
	
	public void llenarCafetera(){
		cantAct=capMax;
		System.out.println("Cafetera llena.\n");
	}
	
	public void servirTaza(int taza){
		if(cantAct<taza){
			cantAct=0;
			System.out.println("El café se ha agotado. Vuelva a llenarla.\n");
		}else{
			cantAct=cantAct-taza; System.out.println("Disfrute de su café.\n");}		
	}
	
	public void agregarCafe(int cafe){
		if (cafe+cantAct>=capMax){
			cantAct=capMax;
			System.out.println("Cafetera llena.\n");		
		}else{
			cantAct=cantAct+cafe;
			System.out.println("La cafetera contiene ahora "+(cantAct+cafe)+" cc.\n");}
		}
	
	

}
