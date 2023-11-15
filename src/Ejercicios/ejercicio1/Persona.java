package Ejercicios.ejercicio1;

import java.util.Random;
import java.util.Scanner;

class Persona {

    private String DNI;

    private String edad;

    private char sexo;

    private String nombre;

    private String peso;

    private String altura;


     public void getSexo(char sexo) {

         this.sexo = sexo;

     }

     public void getDNI(String DNI) {

         int max = 10000000;
         int min = 0;

         for (int i = min; i < max; i++) {

             Random random = new Random();

             int num_DNI = random.nextInt(max - min +1) + min;

             System.out.println("El numero del DNI es: " +num_DNI);
         }
         String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
         int indice = DNIletra % 23;
         return letras.charAt(indice);
         this.DNI = DNI;
     }

     public String getEdad() {

         this.edad = edad;
     }

    public String getPeso() {
        double peso;
    }
}
