package cifradoCesar.cifrado;

public class ArgumentoNombreOpcion {
 private String opcion;
 public ArgumentoNombreOpcion(String opcion) {
	 this.opcion=opcion;
 }
 public String getOpcion() {
	 return this.opcion;
 }
 public Boolean esValido() {
	 
	 return this.esOpcionAyuda()||this.esOpcionDeAlfabeto()||this.esOpcionDeArchivo()||
			 this.esOpcionDeDesplazamiento()||this.esOpcionDeOperacion()||this.esOpcionDeTextoClaro();
 }
 public Boolean esOpcionDeAlfabeto() {
	 return this.opcion.equals("-a")||this.opcion.equals("--alfabeto")||this.opcion.equals("-A");
 }
 public Boolean esOpcionDeDesplazamiento() {
	 return this.opcion.equals("-d")||this.opcion.equals("--esplazamiento")||this.opcion.equals("-D");
 }
 public Boolean esOpcionDeTextoClaro() {
	 return this.opcion.equals("-t")||this.opcion.equals("--texto")||this.opcion.equals("-T");
 }
 public Boolean esOpcionDeArchivo() {
	 return this.opcion.equals("-f")||this.opcion.equals("--file")||this.opcion.equals("-F");
			 
 }
 public Boolean esOpcionDeOperacion() {
	 return this.opcion.equals("-o")||this.opcion.equals("--operacion")||this.opcion.equals("-O");
 }
 public Boolean esOpcionAyuda() {
	 return this.opcion.equals("-h")||this.opcion.equals("--help")||this.opcion.equals("-H");
 }
 public Boolean esOpcionSalida() {
	 return this.opcion.equals("-s")||this.opcion.equals("--salida")||this.opcion.equals("-S");
 }
 
 public String toString() {
	 String representacion="argumentoOpcion[";
	 representacion+="opcion :"+this.opcion;
	 representacion+="]";
	 return representacion;
 }
}
