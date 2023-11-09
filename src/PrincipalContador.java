public class PrincipalContador {

    public static void main(String[] args) {
        Contador c1 = new Contador(34);
        Contador c2 = new Contador(15);

        //c1.cantidad = 56;

        System.out.println("c1 inicial: " + c1.cantidad);
        c1.incrementar();
        System.out.println("c1 final: " + c1.cantidad);

        System.out.println("c2 inicial: " + c2.cantidad);
        c2.incrementar();
        System.out.println("c2 final: " + c2.cantidad);
    }
}
