package practicas.patrones.logica;

import java.util.List;

import practicas.patrones.dominio.Cliente;

public interface IClienteDAO 
{

    public Cliente buscar(String cedula);
    public List<Cliente> consultarTodos();
    
}
