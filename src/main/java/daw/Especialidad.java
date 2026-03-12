package daw;

public enum Especialidad {
    
   SECUNDARIA("Secundaria", 0.23),
   PROFESOR_TECNICO("Profesor tecnico", 0.25);

   private String nombre;
   private double irpf;

   private Especialidad(String nombre, double irpf){
    this.nombre=nombre;
    this.irpf=irpf;
   }

   public String getNombre() {
    return nombre;
}

   

   public double getIrpf() {
    return irpf;
}

  


   
    


    
}
    
    
    

