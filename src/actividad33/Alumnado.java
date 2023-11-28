package actividad33;

public class Alumnado {

    int [] Estudiante = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38};
    private int numeroEstudiantes;

    public Alumnado() {
        this.numeroEstudiantes = 0;
    }

    public int obtenerNumeroEstudiantes() {
        return this.numeroEstudiantes;
    }
    public void agregarEstudiante() {
        if (this.numeroEstudiantes < 38) {
            this.numeroEstudiantes++;
            System.out.println("Estudiante agregado. Total: " + this.numeroEstudiantes);
        } else {
            System.out.println("No se puede agregar más estudiantes. Límite alcanzado.");
        }
    }
}

