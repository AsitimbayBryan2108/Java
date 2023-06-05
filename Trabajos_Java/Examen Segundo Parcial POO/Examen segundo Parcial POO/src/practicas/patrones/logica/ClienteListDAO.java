package practicas.patrones.logica;

import java.util.ArrayList;
import java.util.List;

import practicas.patrones.dominio.Cliente;

public class ClienteListDAO implements IClienteDAO
{
   List <Cliente> clientesList= new ArrayList<>();

    public ClienteListDAO()
   {
      clientesList.add(new Cliente("Bryan Asitimbay", "19", "0952164358" ));
   }



   @Override
   public Cliente buscar(String cedula) 
   {
      for (Cliente cliente : clientesList) 
      {
         if (cliente.getCedula() == cedula)
            return cliente;
      }
      return null;
   }

   @Override
   public List<Cliente> consultarTodos() {

      return null;
   }


}
