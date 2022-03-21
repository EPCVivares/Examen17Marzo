/**
 * Refactoriza el codigo para extraer la superclase Figura que tenga
el atributo comun   private Coordenada origen;
en las clases Circulo y Rectangulo.

Genera el método toString() para que se sobreescriba en las subclases
ejercicio1_5
 */

package codigoExamen;


public class Coordenada {
    private int x;
    private int y;

    public Coordenada() {
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
