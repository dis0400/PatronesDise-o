package Ejercicio1;

public class Cajero {
    

    private static Cajero instance = null;
    private String codigo;
    private double caja;

    
    private Cajero(){
        this.caja=0;
    }

    
    public static Cajero getInstance(){
        if (instance == null){
            multiThreadManage();;
        }
        return instance;
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new Cajero();
        }
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void destroySingleton(){
        instance = null;
    }

    public void pagoACaja(double monto){
        this.caja=this.caja+monto;
    }

    public void show(){
        System.out.println("--------------");
        System.out.println("MONTO: "+caja);
        System.out.println("CAJERO: "+codigo);
        System.out.println("-------------");
    }
}
