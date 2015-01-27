import java.io.*;
import java.util.*;

public class Empresa {
	private String nombre;
	private int antiguedadEmpresa;
	private int maxTrabajadores=30;
	private static int numTrabajadores;
	private Trabajador[] trabajadores;
	
	public Empresa(){
		Scanner in=null;
		try{
			in = new Scanner(new FileReader("TrabajadoresEmpresa.txt"));
			numTrabajadores=in.nextInt();
			
			for(int i=0; i<numTrabajadores; i++){
				String nombre=in.next();
				String dni=in.next();
				int antiguedad=in.nextInt();
				int salario=in.nextInt();
				String departamento=in.next();
				trabajadores[i]=new Trabajador (nombre, dni, antiguedad, salario, departamento);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("Error al leer el archivo: "+e);
		}finally{
			if(in!=null){in.close();}
		}
	}
	
	public int getNumMaximoTrabajadores(){
		return maxTrabajadores;
	}
	
	public int getNumTrabajadores(){
		return numTrabajadores;
	}
	
	public String getNombreEmpresa(){
		return nombre;
	}
	
	public void anyadirEmpleado(Trabajador e){
		Scanner kb=new Scanner (System.in);
		System.out.println("Inserte nombre de empleado.");
		String nombre=kb.next();
		System.out.println("Inserte DNI de empleado.");
		String dni=kb.next();
		System.out.println("Inserte antigüedad de empleado. ");
		int antiguedad=kb.nextInt();
		System.out.println("Inserte salario de empleado.");
		int salario=kb.nextInt();
		System.out.println("Inserte departamento de empleado.");
		String departamento=kb.next();
		
		Trabajador trb=new Trabajador(nombre, dni, antiguedad, salario, departamento);
		
		for(int i=0; i<numTrabajadores; i++){
			if(numTrabajadores<=maxTrabajadores){
				System.out.println("Se ha excedido el número máximo de empleados");}else{
				if(trabajadores[i]==trb){
					System.out.println("Empleado ya existente en el array de empleados");
				}else{
					trabajadores[numTrabajadores]=trb;
					numTrabajadores++;
				}
			}
			
		}		
	}
	
	public String cancelarEmpleado (String numDNI){
		String imposible=null;
		for(int i=0; i<numTrabajadores; i++){
			if (trabajadores[i].getDNI()==numDNI){
				trabajadores[i]=null;
				System.out.println("Empleado borrado del sistema.");
			}else{
				imposible="Imposible realizar la cancelación. El DNI "+numDNI+" no existe.";
				System.out.println(imposible);
			}
		}
		return imposible;
	}
	
	public boolean existeEmpleado(String numDNI){
		boolean existe=false;
		for(int i=0; i<numTrabajadores; i++){
			if (trabajadores[i].getDNI()==numDNI){
				existe=true;
			}else{
				existe=false;
			}
		}
		return existe;
	}
	
	public int getIdEmpleado(String numDNI){
		int posicion=0;
		for(int i=0; i<numTrabajadores; i++){
			if (trabajadores[i].getDNI()==numDNI){
				posicion=i;
			}else{
				System.out.println("DNI no encontrado.");				
			}
		}
		return posicion;
	}
	
	public String getInfoEmpleado(String numDNI){
		String info;
		info=trabajadores[getIdEmpleado(numDNI)].toString();
		return info;
	}
	
	public String listarEmpleados(){
		String info=null;
		for(int i=0; i<numTrabajadores; i++){
			info=trabajadores[i].toString();
		}
		return info;
	}

}
