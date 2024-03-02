package domain;
import java.time.LocalDate;

public class Persona {
    /*
     * Ejercicio 17.
     * Realice los siguientes apartados:
     * 1.Cree la clase Persona con los atributos nombre de tipo String y fecha-DeNacimiento de tipo LocalDate,
     * y con un método que calcule la edad de la persona en años con la siguiente cabecera: public long calcularEdad()
     * 2.Cree la clase Personas con un método que permita añadir personas
     * con la cabecera que se muestra a continuación: public void annadirPersona(Persona persona)
     * 3.Utilizando expresiones lambda, implemente los siguientes métodos dentro de la clase Personas.
     * a) Obtención de la persona más joven, de acuerdo con la cabecera que se muestra a continuación:
     * public Persona elMasJoven()
     * b) Cálculo de la suma de las edades, con la siguiente cabecera:
     * public long calcularSumaEdades()
     * c) Obtención de la edad mínima, con la cabecera que se muestra a continuación:
     * public long calcularEdadMinima()
     * d ) Cálculo de la media de edad, con la siguiente cabecera:
     * public double calcularMediaDeEdad()
     * */
    private String name;
    private LocalDate dob;

    public  Persona(String name, LocalDate dob)
    {
        this.name = name;
        this.dob = dob;
    }

    public String getName()
    {
        return this.name;
    }
    public long calculateAge()
    {
        int curr_year = LocalDate.now().getYear();
        int dob_year = this.dob.getYear();
        return (long) curr_year - dob_year;
    }

}