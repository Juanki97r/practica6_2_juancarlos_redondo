package daw;

import java.time.LocalDate;

public final class Titular extends Profesor {
   
    private LocalDate fechaJubilacion;

    public Titular(String nombre, String apellido, String nif, String numSegSocial, double salarioBase,
            Enum especialidad, double complementoSalarial, LocalDate fechaJubilacion) {
        super(nombre, apellido, nif, numSegSocial, salarioBase, especialidad, complementoSalarial);
        this.fechaJubilacion = fechaJubilacion;
    }

    public Titular() {
        
    }
    

    public boolean pedirProrroga( int meses){
       
        if(!(fechaJubilacion.plusMonths(meses).isAfter(LocalDate.of(2030, 1, 1)))){
            setFechaJubilacion(fechaJubilacion.plusMonths(meses));
            return true;
        }
        
        return false;

        
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
        irpf = (getSalarioBase()+getComplementoSalarial())*Especialidad.SECUNDARIA.getIrpf();
       }
       else{ irpf = (getSalarioBase()+getComplementoSalarial())*Especialidad.PROFESOR_TECNICO.getIrpf();}


       return irpf;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

}
