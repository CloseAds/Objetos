import Figuras.Punto;
import Figuras.Rectangulo;

public class Prueba {

    public static void main(String[]args) throws Exception{

        Rectangulo r = new Rectangulo(5);  //llamado constructor;

        r.base = 10;
        r.altura = 5;

        System.out.println(r);

        System.out.println("El rectángulo tiene: base= " +r.base+ "y altura= " +r.altura);

        System.out.println("El área es: " +r.calcularArea());
        System.out.println("El perímetro es: "+r.Perimetro());

        Persona p = new Persona();

        p.nombre = "Jose María";
        p.apellidos = "de Castro Mora";
        p.dni = "26925489S";

        p.imprimirDatos();

        Contacto c1 = new Contacto();
        c1.nombre = "Chema de Castro";
        c1.telefono = "615 18 99 08";

        Contacto c2 = new Contacto();
        c2.nombre = "Jose María";
        c2.telefono = "789 34 55 56";

        Punto p1 = new Punto();
        p1.x = 1;
        p1.y = 2;
        System.out.println(p1);

        Punto p2 = new Punto();
        p2.x = 3;
        p2.y = 4;
        System.out.println(p2);

        Rectangulo r2 = new Rectangulo(5);
        //r2 = r1;
        System.out.println("El área es: " +r.calcularArea());
        System.out.println("El perímetro es: "+r.Perimetro());

        System.out.println(r2);

        Rectangulo r3 = new Rectangulo(5);

        System.out.println("El área es: " +r.calcularArea());
        System.out.println("El perímetro es: "+r.Perimetro());


    }
}
