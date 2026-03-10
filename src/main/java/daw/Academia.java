package daw;

public class Academia {
    private String direccion;
    private String nombre;
    
    public Academia(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void contratarEmpleado(Empleado e){

    }

    public void matricularAlumno(Alumno a){
        
    }
}
