package Ejercicio1;

public class Estudiante {
    private String nombre;
    private String codigo;
    private boolean matricula;

    public boolean pagoMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }
}
