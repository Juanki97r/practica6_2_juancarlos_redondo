package daw;

public abstract class Persona {
   protected String nombre;
   protected String apellido;
   protected String nif;
   
   public Persona(String nombre, String apellido, String nif) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nif = nif;
   }

   public Persona() {
   }

   public String getNombre() {
    return nombre;
   }

   public void setNombre(String nombre) {
    this.nombre = nombre;
   }

   public String getApellido() {
    return apellido;
   }

   public void setApellido(String apellido) {
    this.apellido = apellido;
   }

   public String getNif() {
    return nif;
   }

   public void setNif(String nif) {
    this.nif = nif;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
      result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
      result = prime * result + ((nif == null) ? 0 : nif.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Persona other = (Persona) obj;
      if (nombre == null) {
         if (other.nombre != null)
            return false;
      } else if (!nombre.equals(other.nombre))
         return false;
      if (apellido == null) {
         if (other.apellido != null)
            return false;
      } else if (!apellido.equals(other.apellido))
         return false;
      if (nif == null) {
         if (other.nif != null)
            return false;
      } else if (!nif.equals(other.nif))
         return false;
      return true;
   }

   
   

}