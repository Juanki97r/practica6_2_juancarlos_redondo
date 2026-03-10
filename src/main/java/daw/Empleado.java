package daw;

public abstract class Empleado extends Persona{
    
    private String numSegSocial;
    private double salarioBase;

    




    public Empleado(String nombre, String apellido, String nif, String numSegSocial, double salarioBase) {
        super(nombre, apellido, nif);
        this.numSegSocial = numSegSocial;
        this.salarioBase = salarioBase;
    }


    public Empleado(){
        
    }



    public String getNumSegSocial() {
        return numSegSocial;
    }


    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }


    public double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public abstract double calcularIrpf();
}
