public class CuentaBancaria3 {
    String titular;
    String numeroCuenta;
    double saldo;

    private final int SALDO_NEGATIVO = -1;
    private final int SALDO_POSTIVO = 1;

    private final int SALDO_CERO = 0;

    public CuentaBancaria3(String titular, String numeroCuenta, double saldoInicial) throws Exception {
        if (titular.length() == 0) {
            throw new Exception("El titular no puede estra vacío");
        }
        if (numeroCuenta.length() == 0) {
            throw new Exception("la cuenta no puede ser 0");
        }
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){

    }
    double ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return cantidad;
        }
        return 0;    //Si la cantidad es negativa se devuelve un 0;
    }
    double retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            cantidad = saldo;
        }
        saldo -= cantidad;
        return cantidad;
    }

    public String toString() {        // se invoca a este método;
        return "Cuenta " + numeroCuenta +
                " de " + titular + " con " +
                saldo + " euros";
    }


    public int estadoCuenta(){

        if (saldo < SALDO_NEGATIVO)
            return -1;
        else if (saldo == SALDO_CERO) {
            return 0;
        }
        else
            return SALDO_POSTIVO;
    }
}




