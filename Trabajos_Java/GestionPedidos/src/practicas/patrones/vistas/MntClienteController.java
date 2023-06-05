package practicas.patrones.vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import practicas.patrones.dominio.Cliente;
import practicas.patrones.repositorios.ClienteListDao;
import practicas.patrones.repositorios.IClienteDAO;

public class MntClienteController extends Application implements Initializable
{
   //! Componentes gráficos en el archivo fxml

   @FXML
   ListView<Cliente> lstClientes;
   @FXML
   Button btnGrabar;
   @FXML
   Button btnCancelar;

   @FXML
   TextField txtCodigo;
   @FXML
   TextField txtCedula;
   @FXML
   TextField txtNombres;
   @FXML
   

   ObservableList<Cliente> listaObservableClientes = FXCollections.observableArrayList();
   IClienteDAO clienteDao = new ClienteListDao();

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage pantalla) throws Exception 
   {
      Parent root = FXMLLoader.load(getClass().getResource("frmMntCliente.fxml"));

      Scene ventana = new Scene(root, 500, 500);

      pantalla.setScene(ventana);
      pantalla.setTitle("Mantenedor de Clientes");
      pantalla.show();
   }
   
   @Override
   public void initialize(URL arg0, ResourceBundle arg1) 
   {
      cargarClientesListView();
   }

   private void cargarClientesListView()
   {
      listaObservableClientes.clear();
      lstClientes.getItems().clear();

      listaObservableClientes.addAll(clienteDao.consultarTodos());
      lstClientes.getItems().addAll(listaObservableClientes);
   }

   @FXML
   public void doSeleccionarCliente()
   {
      Cliente clienteSeleccionado = lstClientes.getSelectionModel().getSelectedItem();

      txtCodigo.setText(String.valueOf(clienteSeleccionado.getCodigo()));
      txtCedula.setText(clienteSeleccionado.getCedula());
      txtNombres.setText(clienteSeleccionado.getNombres());
   }

   @FXML
   public void doGrabarCliente()
   {
       //! Crear objeto cliente
      Cliente cliente = new Cliente();

       //! Recuperar los datos del UI y setear el objeto cliente
      cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
      cliente.setCedula(txtCedula.getText());
      cliente.setNombres(txtNombres.getText());

      //! guardar los datos con el dao de clientes
      clienteDao.insertar(cliente);
      cargarClientesListView();

   }

   @FXML
   public void doCancelar()
   {

   }

}
