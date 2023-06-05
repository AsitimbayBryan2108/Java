package examen.repositorios;

import examen.dominio.Cliente;

public interface IClienteDao {
    
    public Cliente buscar(String cedula);
    
}
