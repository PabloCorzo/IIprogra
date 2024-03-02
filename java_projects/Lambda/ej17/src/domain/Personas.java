package domain;
import java.time.LocalDate;
import java.util.ArrayList;

public class Personas {
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
    static ArrayList<Persona> imagineallthepeople = new ArrayList<>();

    public static void addPerson(Persona p){
        imagineallthepeople.add(p);
    }

    public static long getYoungest()
    {
        return imagineallthepeople
                .stream()
                .mapToLong(e -> e.calculateAge())
                .min()
                .orElse(0)
                ;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Pablo", LocalDate.of(2005,2,25));
        Persona pi = new Persona("Pilar", LocalDate.of(1900,9,3));
        System.out.println(p.calculateAge());
        System.out.println(pi.calculateAge());
        addPerson(p); addPerson(pi);
        System.out.println(getYoungest());
    }
}