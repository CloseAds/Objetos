package Figuras;

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
