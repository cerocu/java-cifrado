package cifradoCesar.cifrado;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Validador {
	public ClasificadorArgumentoOpcion opciones;
	public Map<ArgumentoNombreOpcion,ArgumentoValorOpcion> listaErrores=new HashMap<>();
	
	public Validador(ClasificadorArgumentoOpcion opciones) {
		  this.opciones=opciones;
	}
	public  Boolean esValido() {
		if(this.opciones.getMap().isEmpty()) return false;
		   Set<Boolean> conjunto=new HashSet<>();
		    this.opciones.getMap().forEach((llave,valor)->{if(!valor.esValido(llave))
		    {	                     listaErrores.put(llave, valor);
		       //System.out.println("el "+valor.toString()+" no es valido"); 	    
		    };conjunto.add(valor.esValido(llave));});
		    return !conjunto.contains(false);
		    //throw new Exception();
	}
	public Map<ArgumentoNombreOpcion,ArgumentoValorOpcion> erroresIdentificado(){
		return listaErrores;
	}
	public String toString() {
		String representacion="Validador [";
		representacion+="opciones"+opciones;
		return representacion;
	}
	

}
