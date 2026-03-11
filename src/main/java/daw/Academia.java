package daw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

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
        List<Empleado> listaEmpleado = new ArrayList<>();
        listaEmpleado.add(e);
    }

    public void matricularAlumno(Alumno a){
        
        Set<Alumno> listaAlumnos= new HashSet<>();
        listaAlumnos.add(a);

    }
}
