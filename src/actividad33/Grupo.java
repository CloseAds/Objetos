package actividad33;

public class Grupo {

    private String cumpleanios;

    private String nombreGrupo;

    private Localidad nombreLocalidad;
    private String tutor;

    private String estudiante;


    public Grupo(String cumpleanios, String nombreGrupo, Localidad nombreLocalidad, String tutor, String estudiante) {
        this.cumpleanios = cumpleanios;
        this.nombreGrupo = nombreGrupo;
        this.nombreLocalidad = nombreLocalidad;
        this.tutor = tutor;
        this.estudiante = estudiante;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public String setNombreGrupo() {
        return nombreGrupo;
    }


    public Localidad getNombreLocalidad() {
        return nombreLocalidad;
    }

    public String getTutor() {
        return tutor;
    }

    public String getEstudiante(String nombreEstudiante, String apellidosEstudiante, double NIE) {
        return estudiante;
    }
}
