import java.io.*;

public class Trabajador {
	
	private String Nombre;
	private String DNI;
	private int Antiguedad;
	private int Salario;
	private String Departamento;
	
	public Trabajador(){
		
	}
	
	public Trabajador(String name, String id, int service, int salary, String dep){
		Nombre=name;
		DNI=id;
		Antiguedad=service;
		Salario=salary;
		Departamento=dep;
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public String getDNI(){
		return DNI;
	}
	
	public int getAntiguedad(){
		return Antiguedad;
	}
	
	public int getSalario(){
		return Salario;
	}
	
	public String getDepartamento(){
		return Departamento;
	}
	
	public String toString(){
		
		
		StringBuffer data = new StringBuffer();
		String datos[]=new String [5];
			datos[0]=Nombre;
			datos[1]=DNI;
			datos[2]=Integer.toString(Antiguedad);
			datos[3]=Integer.toString(Salario);
			datos[4]=Departamento;
			
			PrintWriter out=null; // El PrintWriter podría no ser necesario en esta clase.
		try{
			out=new PrintWriter("TrabajadoresEmpresa.txt");
			
		for(int i=0; i<datos.length; i++){
			if(i!=datos.length-1){
				out.print(datos[i]+" ");
			}else{out.print(datos[i]);}
			
			data=data.append(datos[i]);
			System.out.print("");
		}
		
		}catch(IOException e){
			System.out.println("Error: "+e);
			}finally{
				if (out!=null){
					out.close();}}
				
		String dat=data.toString();
		return dat;
			
		}

}
