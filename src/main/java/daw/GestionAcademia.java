package daw;

import java.time.LocalDate;

public class GestionAcademia {
    public static void main(String[] args) {
        Academia marDeAlboran = new Academia("Calle Merida", "IES Mar de Alboran");

        Empleado profInterino1 = new Interino("Rafa", "Lopez", "12456668h", "29674354515", 1500, Especialidad.SECUNDARIA, 0);
        Empleado profTitular = new Titular("Pedro", "Fernandez", "45123365t", "453215865614", 1300, Especialidad.PROFESOR_TECNICO, 0, LocalDate.of(2029, 1, 7));
        

        marDeAlboran.contratarEmpleado(profInterino1);
        

    }
}
