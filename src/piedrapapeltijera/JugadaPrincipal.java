package piedrapapeltijera;

public class JugadaPrincipal {

    public static void main(String[] args) {

        Jugada j1 = Jugada.PIEDRA;
        Jugada j2 = Jugada.PAPEL;

        System.out.println("Jugador 1: "+j1);
        System.out.println("jugador 2: "+j2);

        j1.ganaA(j2);
        j1.empataCon(j2);

        if (j1.ganaA(j2)){
            System.out.println("Gana el jugador 1!");
        }
        else if (j1.empataCon(j2)){
            System.out.println("Han empatado.");
        }
        else {
            System.out.println("Gana el jugador 2!");
        }
    }
}
