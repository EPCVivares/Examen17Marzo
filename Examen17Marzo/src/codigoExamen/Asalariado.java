package codigoExamen;

/*
 * ejerc1_4
 Ejerc1_4: ¿qué podrías refactorizar en este ejercicio? Justifica tu respuesta y refactoriza en caso necesario.
* 
 */
public class Asalariado extends Empleado{
  //  private String nombre;	Todos los atributos los hereda de la clase padre que es Empleados
 //   private String direccion;
//    private String telefono;
 //   private String email;

    public Asalariado() {
    }

    public Asalariado(String nombre, String direccion, String telefono, String email) {
 //      super(nombre, direccion, telefono, email);
    	super(); /*se pueden quitar los argumentos ya que los empleados asalariados heredan de empleados
    			al igual que los setters y getters, porque todos los atributos coinciden con los de la clase padre*/
    }

  
}
