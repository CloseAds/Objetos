package actividad33;

public class Alumnado {
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

