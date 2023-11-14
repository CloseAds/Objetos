package Figuras;

class Elipse {

    double radiomayor;

    double radiomenor;

     public Elipse() {
     }



     double calcularArea(){

        return Math.PI * (radiomayor * radiomenor);
    }
    double calcularPerimetro(){
        return Math.PI *(radiomenor + radiomayor);
    }
    public Elipse(double radiomayor){
         this.radiomenor = radiomayor;
         this.radiomayor = radiomayor;
    }
    public Elipse(double radiomayor,double radiomenor)throws Exception{
         if(radiomayor <= 0 || radiomenor <=0){
             throw new Exception("La eclipse no puede tener radios menores que 0.");
         }
         this.radiomayor = radiomayor;
         this.radiomenor = radiomenor;
    }
}
