package practicas.patrones.vistas;

import javafx.application.Application;

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


public class MntIngresoPedidoController extends Application implements Initializable
{
    @FXML
    ListView<Cliente> lstClientes;
    @FXML
    TextField txtCodigoCliente;
    @FXML
    TextField txtCedula;
    @FXML
    TextField txtNombres;
    @FXML
    TextArea txtDireccion;
    @FXML
    Button btnDatos;


    ObservableList<Cliente> listaObservableClientes = FXCollections.observableArrayList();
     IClienteDAO clienteDao = new ClienteListDao();
    public static void main(String[] args) 
    {
        launch(args);
    }
  
     @Override
     public void start(Stage pantalla1) throws Exception 
     {
        Parent root1 = FXMLLoader.load(getClass().getResource("frmPrcIngresoPedido.fxml"));
  
        Scene ventana1 = new Scene(root1, 700, 700);
  
        pantalla1.setScene(ventana1);
        pantalla1.setTitle("Ingreso de Pedidos");
        pantalla1.show();
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

     private void onDatos()
     {
        Cliente cliente = new Cliente();

        //! Recuperar los datos del UI y setear el objeto cliente
       //cliente.setCodigo(Integer.parseInt(txtCodigoCliente.getText()));
       //cliente.setCedula(txtCedula.getText());
       //cliente.setNombres(txtNombres.getText());
       //cliente.setDireccion(txtDireccion.getText();

       //txtCedula.setText(cliente.getCedula());
       //txtNombres.setText(cliente.getNombres());
       //txtDireccion.setText(cliente.getDireccion());
     }
     
}
