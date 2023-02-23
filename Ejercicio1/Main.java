package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Ventanilla ventanilla = new Ventanilla("12345LP");

        Estudiante e1 = new Estudiante("Jose Manolo", "456");
        ventanilla.setEstudiante(e1);
        ventanilla.hacerPagoMatricula();

        Estudiante e2 = new Estudiante("Pablo Londres", "789");
        ventanilla.setEstudiante(e2);
        ventanilla.hacerPagoMatricula();

        Estudiante e3 = new Estudiante("Rebeca Molina", "123");
        ventanilla.setEstudiante(e3);
        ventanilla.hacerPagoMatricula();

        Estudiante e4 = new Estudiante("Manuel Laura", "345");
        ventanilla.setEstudiante(e4);
        ventanilla.hacerPagoMatricula();
        ventanilla.hacerPagoMatricula();

        Estudiante e5 = new Estudiante("Rodrigo de Celis", "678");
        ventanilla.setEstudiante(e5);
        ventanilla.hacerPagoMatricula();
        
        ventanilla.show();
        
    }
}