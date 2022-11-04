package gestion_Aeroportuaria;

// Clase Hija de Aeropuerto

public class Aeropuerto_Privado extends Aeropuerto{
	
	private String ListaEmpresas[] = new String [10];  
	private int NumeroEmpresa ;  
	
	 // Constructor de los Strimg 
	public Aeropuerto_Privado (String Nombre , String Ciudad , String Pais ) {
		super (Nombre ,Ciudad , Pais ); 
		
	 }
	
	public Aeropuerto_Privado (String Nombre , String Ciudad , String Pais  , Compania[]   co  ,String E[]  ) {
		super (Nombre , Ciudad , Pais );
		this.NumeroEmpresa = 0 ;  
		ListaEmpresas = E ;  
		NumeroEmpresa = E.length; 
		
	} 
	// Insertar todo de una sola 
	public void InsertarEmpresas (String E[]) {
		this.ListaEmpresas = E ; 
		NumeroEmpresa = E.length; //Ingresar toda de una sola  
		
	}
	
	public void InsertarEmpresa(String e ) {
		ListaEmpresas[NumeroEmpresa ]= e ; // Insertamos una Empresa 
		NumeroEmpresa++; // Siga un paso adelante en el arreglo 
		
	}
	// Mostrar las Empresas
	public String [] getListaEmpresas() {
		return ListaEmpresas; 
	}
	
	public int getNumeroEmpresa () {
		return NumeroEmpresa ; 
	}
	
	
	
	

}
