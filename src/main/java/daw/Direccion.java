package daw;

public class Direccion {
    private String calleNumero;
    private String codPostal;
    private String poblacion;
    
    public Direccion(String calleNumero, String codPostal, String poblacion) {
        this.calleNumero = calleNumero;
        this.codPostal = codPostal;
        this.poblacion = poblacion;
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
        this.codPostal = codPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


    
}
