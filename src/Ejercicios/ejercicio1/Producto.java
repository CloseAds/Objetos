package Ejercicios.ejercicio1;
 class Producto {

     double precio;

     String descripcion;

     public String getDescripcion() {
         return descripcion;

     }

     public Producto(String descripcion, double precio)throws Exception {
         if (precio < 0){
             throw new Exception("El precio no puede ser negativo");

         }
         if (precio == 0){
             throw new Exception("El producto es gratis");
         }
         if (descripcion == null){
             throw new Exception("La descripción debe estar rellena");
         }
        this.descripcion = descripcion;
        this.precio = precio;
     }

     public String toString(){
         return "Descripción: " +this.descripcion+ " ,Precio: " +this.precio;
     }
     public    
 }
