package examen.repositorios;

import java.util.ArrayList;
import java.util.List;


import examen.dominio.Cliente;

public class ClienteListDao implements IClienteDao
{
    List <Cliente> clientesLista= new ArrayList<>();

    public ClienteListDao()
   {
      clientesLista.add(new Cliente("0943883991", "Axel Licoa", 21 ));
   }




    @Override
    public Cliente buscar(String cedula) {
        for (Cliente cliente : clientesLista) 
        {
           if (cliente.getCedula().equals(cedula))
              return cliente;
        }
        return null;
     
    }
    

    
}
