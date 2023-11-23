 class Electrodomestico {

    private double precioBase = 100;

     private String color = "blanco";

    private char consumoEnergetico = 'F';

    private double peso = 5;

    public Electrodomestico (double precioBase, double peso){

        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        //this.consumoEnergetico =

    }
    public String getColor (){
         this.color = color;
         return color;
    }

     public double getPrecioBase() {
         return precioBase;
     }

     public double getPeso() {
         return peso;
     }

     public char getConsumoEnergetico() {

        if (consumoEnergetico == 'A')
            return 100;
        if (consumoEnergetico == 'B')
            return 80;
        if (consumoEnergetico == 'C')
            return 60;
        if (consumoEnergetico == 'D')
            return 50;
        if (consumoEnergetico == 'E')
            return 30;
        if (consumoEnergetico == 'F')
            return 10;

        return consumoEnergetico;
     }
     private void comprobarConsumoEnergetico(char letras){

        switch (letras){
            case 'A', 'B', 'C', 'D','E','F':
                this.consumoEnergetico = letras;
                break;
            default:
                this.consumoEnergetico = 'F';

        }
     }

     private void comprobarColor(String color){

        if (color.toLowerCase().equals("blanco")||color.equalsIgnoreCase("negro")|| color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")){
            this.color = color.toLowerCase();
        }else {
            this.color = "blanco";
        }

     }

     public String toString (){

        return "peso:" +this.peso + "Preciobase";

     }

 }
