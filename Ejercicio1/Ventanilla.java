package Ejercicio1;

public class Ventanilla {
    private Estudiante estudiante;
    private double matricula;
    private String codigoCajero;

    public String getCodigoCajero() {
        return codigoCajero;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public Ventanilla(String codigoCajero){
        this.codigoCajero=codigoCajero;
        Cajero.getInstance().setCodigo(codigoCajero);
        Cajero.getInstance().show();
        matricula=1000;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public void hacerPagoMatricula(){
        if(!estudiante.pagoMatricula()){
            Cajero.getInstance().pagoACaja(matricula);
            System.out.println("EL ESTUDIANTE "+estudiante.getNombre()
            +" "+estudiante.getCodigo()+" ACABA DE PAGAR LA MATRICULA");
            estudiante.setMatricula(true);
        } else{
            System.out.println("EL ESTUDIANTE "+estudiante.getNombre()
            +" "+estudiante.getCodigo()+" YA REALIZO EL PAGO DE MATRICULA");
        }

    }

    public void show(){
        Cajero.getInstance().show();
    }
}
