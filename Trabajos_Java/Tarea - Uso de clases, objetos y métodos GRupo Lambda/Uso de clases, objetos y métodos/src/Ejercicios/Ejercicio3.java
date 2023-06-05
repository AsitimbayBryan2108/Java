package Ejercicios;
// Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los
// tres atributos, sólo la hora y minuto o sólo la hora. Crear además los métodos necesarios para
// modificar la hora en cualquier momento de forma manual. Mantenga la integridad de los datos en
// todo momento. Crear la clase pruebaTiempo que pruebe una hora concreta y la modifique a su gusto
// mostrándola por pantalla

public class Ejercicio3 
{
    private int hora;
    private int minutos;
    private int segundos;

    public int getHora() 
    {
        return hora;
    }

    public int getMinutos() 
    {
        return minutos;
    }

    public int getSegundos() 
    {
        return segundos;
    }

    
    public Ejercicio3(int hora, int minutos, int segundos)
    {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;   
    }

    public Ejercicio3(int hora, int minutos)
    {
        this.hora = hora;
        this.minutos = minutos;  
    }
    
    public Ejercicio3(int hora)
    {
        this.hora = hora;   
    }

    public void mostrarSoloHora()
    {
        System.out.printf("La hora es %s horas\n",this.hora);
    }

    
    public void mostrarHoraMinuto()
    {
        System.out.printf("La hora es %s horas con %s minutos \n",this.hora,this.minutos);
    }

    public void mostrarTodo()
    {
        System.out.printf("La hora es %s horas %s minutos y %s segundos \n",this.hora,this.minutos,this.segundos);
    }
    
    public void aumentarTiempo(int aumhora, int aumminutos, int aumsegundos)
    {

        this.hora = hora + aumhora;
        this.minutos = minutos + aumminutos;
        this.segundos = segundos + aumsegundos;

        System.out.printf("El tiempo disminuyo ahora es %s horas %s minutos y %s segundos\n",this.hora,this.minutos,this.segundos);
    }

    public void disminuirTiempo(int dishora, int disminuto, int dissegundos)
    {
        this.hora = hora - dishora;
        this.minutos = minutos - disminuto;
        this.segundos = segundos - dissegundos;
 
        System.out.printf("El tiempo disminuyo ahora es %s horas %s minutos y %s segundos\n",this.hora,this.minutos,this.segundos);
    }

    
}



