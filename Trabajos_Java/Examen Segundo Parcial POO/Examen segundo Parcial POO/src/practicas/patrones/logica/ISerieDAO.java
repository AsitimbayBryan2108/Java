package practicas.patrones.logica;

import java.util.List;

import practicas.patrones.dominio.Serie;

public interface ISerieDAO 
{

    public Serie buscar(int codigo);
    public List<Serie> consultarTodos();
    
}
