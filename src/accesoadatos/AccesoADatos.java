
package accesoadatos;

import accesoadatos.modelo.Alumno;
import accesoadatos.modelo.AlumnoData;
import accesoadatos.modelo.Conexion;
import java.time.LocalDate;
import java.time.Month;


public class AccesoADatos {

    //Aca arranca la aplicación
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan Lopez", LocalDate.of(2010,Month.DECEMBER, 12), true );
    
        Conexion con = new Conexion();
        //Creamos aulmno data
        AlumnoData ad = new AlumnoData(con);
        
        ad.guardarAlumno(alumno1);
        
        System.out.println("Nuevo alumno id: " + alumno1.getId());
    }   
    
}
