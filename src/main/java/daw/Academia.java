package daw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Academia {
    private Direccion direccion;
    private String nombre;
    private Set<Alumno> alumnosMatriculados = new HashSet<>();
    private List<Empleado> empleadosContratados = new ArrayList<>();
    
    public Academia(Direccion direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }


    

    public Set<Alumno> getAlumnosMatriculados() {
        Set<Alumno> copia = Set.copyOf(alumnosMatriculados);
        return copia;
    }


// en los getters de las listas devolvemos una copia de la listas para reforzar el encapsulamiento de las mismas


    




    public List<Empleado> getEmpleadosContratados() {
        List<Empleado> copia = List.copyOf(empleadosContratados);
        return copia;
    }




    




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void contratarEmpleado(Empleado e){
        
        empleadosContratados.add(e);
    }

    public void matricularAlumno(Alumno a){
        
        
        alumnosMatriculados.add(a);

    }




    public Direccion getDireccion() {
        return direccion;
    }




    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
