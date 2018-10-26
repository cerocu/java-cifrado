package cifradoCesar.cifrado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClasificadorArgumentoOpcion {
	
     private Object[] argumentoComoString;
	private List<ArgumentoOpcion> argumentoComoArgumentoOpcion;
	private Map<ArgumentoNombreOpcion,ArgumentoValorOpcion> map;
	
	public ClasificadorArgumentoOpcion(Object [] argumentoComoString) {
		this.argumentoComoString=argumentoComoString;
		 this.argumentoComoArgumentoOpcion=new ArrayList<>();
		 this.map=new HashMap<>();
		 clasificadorArgumentosOpcion();
	}
	public void clasificadorArgumentosOpcion() {
		if(this.argumentoComoString.length%2==0) {
			for (Integer i = 0; i < argumentoComoString.length; i+=2) {
				this.map.put(
						new ArgumentoNombreOpcion((String)this.argumentoComoString[i]),
						new ArgumentoValorOpcion((String)this.argumentoComoString[i+1]));
			}
		}
	}
	public ArgumentoValorOpcion operador() {
		 for (Map.Entry<ArgumentoNombreOpcion, ArgumentoValorOpcion> opcion : map.entrySet()){
		    	if(opcion.getKey().esOpcionDeOperacion())
		    		return opcion.getValue();
			    
		  	}
		 return null;
	}
	public ArgumentoValorOpcion alfabeto() {
		 for (Map.Entry<ArgumentoNombreOpcion, ArgumentoValorOpcion> opcion : map.entrySet()){
		    	if(opcion.getKey().esOpcionDeAlfabeto())
		    		return opcion.getValue();
			    
		  	}
		 return null;
	}
	public ArgumentoValorOpcion texto() {
		 for (Map.Entry<ArgumentoNombreOpcion, ArgumentoValorOpcion> opcion : map.entrySet()){
		    	if(opcion.getKey().esOpcionDeTextoClaro()||opcion.getKey().esOpcionDeArchivo())
		    		return opcion.getValue();
			    
		  	}
		 return null;
	}
	public ArgumentoValorOpcion archivo() {
		 for (Map.Entry<ArgumentoNombreOpcion, ArgumentoValorOpcion> opcion : map.entrySet()){
		    	if(opcion.getKey().esOpcionDeArchivo())
		    		return opcion.getValue();
			    
		  	}
		 return null;
	}
	public ArgumentoValorOpcion desplazamiento() {
		 for (Map.Entry<ArgumentoNombreOpcion, ArgumentoValorOpcion> opcion : map.entrySet()){
		    	if(opcion.getKey().esOpcionDeDesplazamiento())
		    		return opcion.getValue();
			    
		  	}
		 return null;
	}
	public ArgumentoValorOpcion salida() {
		 for (Map.Entry<ArgumentoNombreOpcion, ArgumentoValorOpcion> opcion : map.entrySet()){
		    	if(opcion.getKey().esOpcionSalida())
		    		return opcion.getValue();
			    
		  	}
		 return null;
	}
	public Map<ArgumentoNombreOpcion,ArgumentoValorOpcion> getMap(){
		//this.clasificadorArgumentosOpcion();
		return map;
	}
	public String toString() {
		String representacion="Clasifidador [";
		representacion+="argumentoComoString"+Arrays.toString(this.argumentoComoString);
		representacion+="\n";
		representacion+="mapa "+this.map;
		representacion+="\n";
		representacion+="argumentoComoArgumentoOpcion"+this.argumentoComoArgumentoOpcion;
		representacion+="]";
		return representacion;
	}
}
