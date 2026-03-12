package daw;

public abstract class Profesor extends Empleado {
    
    private Enum Especialidad;
    private double complementoSalarial;
   
   
    
    public Profesor(String nombre, String apellido, String nif, String numSegSocial, double salarioBase,
            Enum especialidad, double complementoSalarial) {
        super(nombre, apellido, nif, numSegSocial, salarioBase);
        Especialidad = especialidad;
        this.complementoSalarial = complementoSalarial;
    }



    public Profesor() {
    }



    public Enum getEspecialidad() {
        return Especialidad;
    }



    public void setEspecialidad(Enum especialidad) {
        Especialidad = especialidad;
    }



    public double getComplementoSalarial() {
        return complementoSalarial;
    }



    public void setComplementoSalarial(double complementoSalarial) {
        this.complementoSalarial = complementoSalarial;
    }



    
    
}
