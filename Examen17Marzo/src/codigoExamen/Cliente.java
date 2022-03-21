package codigoExamen;
/*
 * ejerc1_1
Ejerc1_1: Extraer los datos relacionados con el telefono en otra clase llamada Telefono
 */
public class Cliente {
    private Telefono data = new Telefono();

	public Cliente() {
    }

    public String getNombre() {
        return data.nombre;
    }

    public void setNombre(String nombre) {
        this.data.nombre = nombre;
    }

   
}
