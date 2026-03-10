package daw;

import java.time.LocalDate;

public final class Titular extends Profesor {
   
    private LocalDate fechaJubilacion;

    public Titular(String nombre, String apellido, String nif, String numSegSocial, double salarioBase,
            Enum especialidad, double complementoSalarial, LocalDate fechaJubilacion) {
        super(nombre, apellido, nif, numSegSocial, salarioBase, especialidad, complementoSalarial);
        this.fechaJubilacion = fechaJubilacion;
    }

    public Titular(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }
    

    public boolean pedirProrroga( int meses){

    }

     

    
    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", apellido=" + apellido + ", fechaJubilacion=" + fechaJubilacion
                + ", nif=" + nif + "]";
    }

    @Override
    public double calcularIrpf() {
       double irpf=0;

       if(this.getEspecialidad() == Especialidad.SECUNDARIA){
        irpf = (this.getSalarioBase()+this.getComplementoSalarial())*Especialidad.SECUNDARIA.getIrpf();
       }
       else{ irpf = (this.getSalarioBase()+this.getComplementoSalarial())*Especialidad.PROFESOR_TECNICO.getIrpf();}


       return irpf;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

}
