package cifradoCesar.cifrado;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class LeerArchivo {

   public String contenido;  
//    FileInputStream archivo;// = new FileInputStream(texto);//"/home/alumno/proyectopatrones/cesar/src/cifradoCesar/clases/archivo.txt"//);
       public LeerArchivo(String texto) throws FileNotFoundException{
          leerContenido(texto);
       }
       public String  contenido() {
    	   
    	   return contenido; 
       }
	   public  void leerContenido(String texto) throws FileNotFoundException {
		   String cadena="";
		   try{
	        
	            FileInputStream fstream = new FileInputStream(texto);//"/home/alumno/proyectopatrones/cesar/src/cifradoCesar/clases/archivo.txt"//);
	           
	            DataInputStream entrada = new DataInputStream(fstream);
	            
	            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	            String linea;
	           
	            while ((linea = buffer.readLine()) != null)   {
	               cadena+=linea;
	                
	            }
	            
	            entrada.close();
	        }catch (Exception e){ 
	        	throw new FileNotFoundException();
	        	//System.out.println(e);
	        	}
		   this.contenido=cadena;
//		  System.out.println(cadena);
	
}
	   

}
