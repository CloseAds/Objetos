public class PrincipalBancoHackeado3 {

    public static void main(String[] args) throws Exception{

        CuentaBancaria3 c1 = new CuentaBancaria3(
                "Chuck Norris",
                "21031221",
                1000.0);
        System.out.println(c1);
        c1.setTitular("Pepe Botella");
        c1.saldo = 1000000; // ¡HACKER!
        System.out.println("\nRetirar 2000 euros");
                c1.retirarDinero(2000);
        System.out.println(c1);
    }

}
