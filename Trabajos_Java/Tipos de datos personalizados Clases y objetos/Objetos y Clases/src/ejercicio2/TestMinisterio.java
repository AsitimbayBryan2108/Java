package ejercicio2;

public class TestMinisterio 
{
    static final String ENTIDAD = "MINISTERIO DE SALUD - 2022";
    static final String LINEA = "===========================================";

    public static void main(String[] args) {

        MinisterioSalud paciente = new MinisterioSalud();

        System.out.println(LINEA);
        System.out.println("\t "+ ENTIDAD);
        System.out.println(LINEA);

        System.out.println("CEDULA: "+ paciente.cedula);
        System.out.println("NOMBRES DEL PASIENTE: " + paciente.nombres);
        System.out.println("SEXO: " + paciente.sexo  +  "\t EDAD: "+ paciente.edad  );
        System.out.println(LINEA);
        System.out.println("PESO(Kg): " + paciente.peso +  "\t ESTATURA: "+ paciente.estatura  );
        System.out.println(LINEA);



    }
    
}
