package cifradoCesar.cifrado;

import java.io.FileNotFoundException;

public class ArgumentoValorOpcion {
    private String valorOpcion;
	public ArgumentoValorOpcion(String valorOpcion) {

	  this.valorOpcion=valorOpcion;
	}
	public String getValorOpcion() {
		 return this.valorOpcion;
	}
	public Boolean esValido(ArgumentoNombreOpcion nombreOpcion) {
		if(nombreOpcion.esOpcionDeAlfabeto()) {
			return this.valorOpcion.equals("español")||this.valorOpcion.equals("ingles")||
					this.valorOpcion.equals("griego");
		}
		if(nombreOpcion.esOpcionDeTextoClaro()) {
			return this.valorOpcion.trim().length()>0;
		}
		if(nombreOpcion.esOpcionDeOperacion()) {
			return this.valorOpcion.equals("cifrar")||this.valorOpcion.equals("descifrar");
		}
		
		if(nombreOpcion.esOpcionSalida()) {
			return this.valorOpcion.equals("consola")||this.valorOpcion.equals("web");
		}
		if(nombreOpcion.esOpcionAyuda()) {
			return this.valorOpcion.equals("-h")||this.valorOpcion.equals("--ayuda");
		}
		if(nombreOpcion.esOpcionDeArchivo()) {

			try {
				LeerArchivo leer=new LeerArchivo(this.valorOpcion);
				return true;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				return false;
			}
			
		}
		
		if(nombreOpcion.esOpcionDeDesplazamiento()) {
			try {
				Integer numero=Integer.parseInt(this.valorOpcion.trim());
				return numero>0;
			}catch(Exception e) {
				return false;
			}
		}return false;
	}
	public String toString() {
		String representacion="ArgumentoValorOpcion [";
		representacion+="valorOpcion "+this.valorOpcion;
		representacion+="]";
		return representacion;
	}
	

}
