package Figuras;

import Figuras.Elipse;

import java.util.Scanner;

public class PrincipalElipse {

    public static void main(String[] args)throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Radio mayor: ");
        double radiomayor = s.nextDouble();

        System.out.println("Radio menor: ");
        double radiomenor = s.nextDouble();

        Elipse a = new Elipse();
        a.radiomenor = radiomenor;
        a.radiomayor = radiomayor;
        double area = a.calcularArea();
        double perimetro = a.calcularPerimetro();
        System.out.println("Área: " +area);
        System.out.println("Perimetro: "+perimetro);

        Elipse b = new Elipse();
        System.out.println("Área: " +b.calcularArea());
        System.out.println("Perimetro: "+b.calcularPerimetro());

        Elipse c = new Elipse();
        System.out.println("Área: " +c.calcularArea());
        System.out.println("Perimetro: "+c.calcularPerimetro());
    }

}
