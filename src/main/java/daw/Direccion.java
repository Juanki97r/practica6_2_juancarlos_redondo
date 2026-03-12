package daw;

public class Direccion {
    private String calleNumero;
    private String codPostal;
    private String poblacion;
    
    public Direccion(String calleNumero, String codPostal, String poblacion) {
        this.calleNumero = calleNumero;
        
        
        this.poblacion = poblacion;
        if((codPostal.length()>0) & codPostal.length()<=5){
        this.codPostal = codPostal;
        }
        else{ this.codPostal = "OOOOO";}
    }

    public Direccion() {
    }

    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        if(codPostal.length() != 5){
            this.codPostal="OOOOO";
        }
        
        this.codPostal = codPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


    
}
