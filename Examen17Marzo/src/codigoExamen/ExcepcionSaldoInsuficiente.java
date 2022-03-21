package codigoExamen;
/**
 * ejerc1_3
 * @param message
 */
class ExcepcionSaldoInsuficiente extends Cuenta {

    public ExcepcionSaldoInsuficiente() {
    }

    public ExcepcionSaldoInsuficiente(String message) {
        System.out.println("Saldo insuficiente");
    }
}
