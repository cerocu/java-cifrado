package cifradoCesar.cifrado;

public class ArgumentoOpcion implements Comparable<ArgumentoOpcion>{
 private ArgumentoNombreOpcion nombreOpcion;
 private ArgumentoValorOpcion valorOpcion;
 
 public ArgumentoOpcion(ArgumentoNombreOpcion nombreOpcion,ArgumentoValorOpcion valorOpcion) {
	 this.nombreOpcion=nombreOpcion;
	 this.valorOpcion=valorOpcion;
 }
 public Boolean esValido(){
  return this.nombreOpcion.esValido()&&	 this.valorOpcion.esValido(this.nombreOpcion);
 }
 public ArgumentoNombreOpcion nombreOpion() {
	 return nombreOpcion;
 }
 public ArgumentoValorOpcion valorOpcion() 
 {
	 return valorOpcion;
 }
 public String toString() {
	 String representacion="ArgumentoOpcion";
	 representacion+="nombreOpcion "+this.nombreOpcion;
	 representacion+="valorOpcion "+this.valorOpcion;
	 return representacion;
 }
@Override
public int compareTo(ArgumentoOpcion o) {
	       if(this.nombreOpcion.getOpcion().equals(o.nombreOpion().getOpcion()))
	       {
	    	   return 0;
	       }
	return 1;
}
	public boolean equals(Object objeto) {
		if(objeto==null ||objeto.getClass()!=this.getClass())
		{return false;
		}
		return this==objeto||this.compareTo((ArgumentoOpcion) objeto)==0;
	}
 
}
