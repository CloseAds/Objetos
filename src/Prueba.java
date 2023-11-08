public class Prueba {

    public static void main(String[]args){

        Rectángulo r = new Rectángulo();

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

        Contacto c = new Contacto();
        c.nombre = "Chema de Castro";
        c.telefono = "615 18 99 08";

    }
}
