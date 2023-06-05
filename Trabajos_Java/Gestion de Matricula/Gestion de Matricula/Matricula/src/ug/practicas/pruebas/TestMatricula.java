package ug.practicas.pruebas;

import java.util.List;
import java.util.Scanner;

import ug.practicas.dominio.Asignatura;
import ug.practicas.dominio.Estudiante;
import ug.practicas.dominio.Matricula;
import ug.practicas.dominio.Universidad;

public class TestMatricula {

    private static List<Asignatura> Asignatura;
    public static void main(String[] args) {
        
    
    Universidad universidad= new Universidad("Universidad de Guayaquil (UG)");
    Estudiante estudiante= new Estudiante(123,"0952164358", " Bryan Asitimbay", "Av 25 de julio Cdl Nueva Guayaquil", "Soltero",true);
    Estudiante estudiante2= new Estudiante(1234,"0968252651","Shirley Gomez", "Cdla Santa Monica Mz1 Sl3", "Soltera",false);
    Matricula matricula= new Matricula(111);
    
    
    
    matricula.agregarAsignaturas(111, "Estructura de datos", "Cesar Alcivar", "MA-2-1");
    matricula.agregarAsignaturas(222, "Metodologia de la investigacion", "Patricia Rodas", "MA-2-1");
    matricula.agregarAsignaturas(333, "Teorias de matrices", "Cesar Bustamante", "MA-2-1");
    matricula.agregarAsignaturas(444, "Ecologia", "Enrique Martinez", "MA-2-1");
    matricula.agregarAsignaturas(555, "Programación Orientada a Objetos", "Jose Caicedo", "MA-2-1");
    matricula.agregarAsignaturas(666, "Calculo Integral", "Mario Figueroa","MA-2-1");
    
    
        Scanner asignatura=new Scanner(System.in);
        System.out.println("Codigos de las asignaturas: \n-111\n-222\n-333\n-444\n-555\n-666");
        System.out.println();
		System.out.print("Ingrese codigo de la asignatura matriculado:");
		int codigo = asignatura.nextInt();
        Asignatura result = matricula.buscarPorCodigo(codigo);
        System.out.println("");

        System.out.println("------------------LISTA DE ESTUDIANTES------------------");
        estudiante.mostrarDatos();
        estudiante2.mostrarDatos();

        System.out.println();
        System.out.println("---------DATOS DE LA ASIGNATURA DONDE SE ENCUENTRA MATRICULADO---------");
       
        if(result != null) 
        { 
        System.out.println("Codigo: "+result.getCodigo()+ "\t\t\tNombre de la asignatura: "+ result.getNombre()+"\nDocente: "+result.getProfesor()+"\t\tCurso: "+result.getCurso());
        }
        else  
        {
         System.out.println("No existe esta materia");
        } 
     
    }
    
        
    
}