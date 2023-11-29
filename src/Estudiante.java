import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;

    private String apellidos;

    private int edad;

    private String dni;

    private List<String> modulos = new ArrayList<>();

    public void setModulos(List<String> modulos) {
        this.modulos = modulos;
    }

    public Estudiante(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.modulos = new ArrayList<Modulos>()
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarModulo(Modulos modulos){
        modulos.add(modulo);
    }

}
