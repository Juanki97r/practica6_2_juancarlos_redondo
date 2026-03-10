package daw;

import java.time.LocalDate;

public class Alumno extends Persona {
    
    private String numExpd;
    private LocalDate fechaBaja;
    
    
    public Alumno(String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
    }
    public Alumno() {
    }
  
    public String getNumExpd() {
        return numExpd;
    }
   
    public void setNumExpd(String numExpd) {
        this.numExpd = numExpd;
    }
   
    public LocalDate getFechaBaja() {
        return fechaBaja;
    }
   
    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
}
