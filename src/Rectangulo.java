class Rectangulo {

    double base;
    double altura;

    Rectangulo(){
        this.base = 2;
        this.altura = 1;            //this (2,1);
    }
    Rectangulo(double base, double altura) throws Exception {
        if (base <= 0 || altura <= 0){
            throw new Exception("Dimensiones no válidas");
        }
    }
    Rectangulo(double lado) throws Exception{
        this.base = lado;
        this.altura = lado;
    }
    double calcularArea(){

        return base*altura;

    }
    double Perimetro(){
        return (base + altura)*2;
    }
}
