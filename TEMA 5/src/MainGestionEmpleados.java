import java.lang.*;
public class MainGestionEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador a;
		a=new Trabajador("Samuel", "20847563H", 3, 2000, "Fil");
		Empresa b;
		b=new Empresa();
		System.out.println(a.toString());
		System.out.println("Nombre: "+a.getNombre());
		System.out.println("DNI: "+a.getDNI());
		System.out.println("Antigüedad: "+a.getAntiguedad());
		System.out.println("Salario: "+a.getSalario());
		System.out.println("Departamento: "+a.getDepartamento());
		
		System.out.println(b.listarEmpleados());
	}

}
