package daw;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno extends Persona implements SoliciarBaja{
    
    private String numExpd;
    private LocalDate fechaBaja;
    
    
    
    public Alumno(String nombre, String apellido, String nif, String numExpd) {
        super(nombre, apellido, nif);
        this.numExpd = numExpd;
        this.fechaBaja = LocalDate.MAX;
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

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", numExpd=" + numExpd + ", nif=" + nif
                + ", fechaBaja=" + fechaBaja + "]";
    }

    @Override
    public int hashCode() {
     
        return Objects.hash(super.hashCode(), fechaBaja);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        if(!super.equals(obj))
            return false;
        Alumno other = (Alumno) obj;
        if (numExpd == null) {
            if (other.numExpd != null)
                return false;
        } else if (!numExpd.equals(other.numExpd))
            return false;
        if (fechaBaja == null) {
            if (other.fechaBaja != null)
                return false;
        } else if (!fechaBaja.equals(other.fechaBaja))
            return false;
        return true;
    }

    @Override
    public void solicitarBaja(LocalDate fecha) {
        this.setFechaBaja(fecha);
    }

   

    
    
}
