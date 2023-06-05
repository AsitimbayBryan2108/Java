package practicas.patrones.pruebas;

import practicas.patrones.dominio.Cliente;
import practicas.patrones.repositorios.ClienteListDao;
import practicas.patrones.repositorios.IClienteDAO;

public class TestClienteDao 
{
   public static void main(String[] args) 
   {
      IClienteDAO daoCliente = new ClienteListDao();

      //! crear varios objetos cliente
      Cliente c1 = new Cliente(10, "0845126398","Pedro Marcelo Solines","Av siempre viva");
      Cliente c2 = new Cliente(20, "0947845361","Martha Cecilia Arteaga","Casa de rolando");
      Cliente c3 = new Cliente(30, "1245789653","Juan Alberto Macias","Ciudad Alegre");

      daoCliente.insertar(c1);
      daoCliente.insertar(c2);
      daoCliente.insertar(c3);

      //! Consulta de cliente
      for (Cliente cliente : daoCliente.consultarTodos()) 
         System.out.println(cliente);

      int codigo = 15;
      Cliente cli = daoCliente.buscar(codigo);

      if (cli != null)
      {
         System.out.printf("\n <<< cliente con codigo: %d si existe >>> \n", cli.getCodigo());
         System.out.print(cli);
      }
      else
         System.out.printf("\n <<< cliente con codigo: %d no existe >>> \n", codigo);
   }   
}
