package daw;

import java.time.LocalDate;

public final class Interino extends Profesor {
   
    private LocalDate fechaInicio;
    private LocalDate fechaCese;
   
    public Interino(String nombre, String apellido, String nif, String numSegSocial, double salarioBase,
            Enum especialidad, double complementoSalarial ) {
        super(nombre, apellido, nif, numSegSocial, salarioBase, especialidad, complementoSalarial);
        this.fechaInicio = LocalDate.now();
        this.fechaCese = fechaInicio.plusMonths(6);
    }
    public Interino() {
        
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaCese() {
        return fechaCese;
    }
    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public int calcularDiasTrabajados(){

    }
     @Override
   
     public double calcularIrpf() {
        double irpf= 0;

        if(this.getEspecialidad() == Especialidad.SECUNDARIA){
        irpf = this.getSalarioBase()*Especialidad.SECUNDARIA.getIrpf();
       }
       else{ irpf = this.getSalarioBase()*Especialidad.PROFESOR_TECNICO.getIrpf();}


        return irpf;
    }

   
    @Override
    public String toString() {
        return "Interino [nombre=" + nombre + ", apellido=" + apellido + ", fechaInicio=" + fechaInicio + ", nif=" + nif
                + ", fechaCese=" + fechaCese + "]";
    }
   
    
}
