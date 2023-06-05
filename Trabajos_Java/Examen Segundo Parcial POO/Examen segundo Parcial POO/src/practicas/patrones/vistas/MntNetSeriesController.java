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
import practicas.patrones.logica.ClienteListDAO;
import practicas.patrones.logica.IClienteDAO;


public class MntNetSeriesController extends Application implements Initializable
{
    @FXML
    ListView<Cliente> lstClientes;
    @FXML
    TextField txtCodigoCliente;
    @FXML
    TextField txtNumero;
    @FXML
    TextField txtFecha;
    @FXML
    TextField txtCedula;
    @FXML
    TextField txtNombres;
    @FXML
    TextArea txtEdad;
    @FXML
    Button btnCliente;


    ObservableList<Cliente> listaObservableClientes = FXCollections.observableArrayList();
     IClienteDAO clienteDAO = new ClienteListDAO();
    public static void main(String[] args) 
    {
        launch(args);
    }
  
     @Override
     public void start(Stage pantalla1) throws Exception 
     {
        Parent root1 = FXMLLoader.load(getClass().getResource("NetSeriesSA.fxml"));
  
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
  
        listaObservableClientes.addAll(clienteDAO.consultarTodos());
        lstClientes.getItems().addAll(listaObservableClientes);
     }

     @FXML
     public void onDatosCliente() 
      {

             String cedula;
          
    
             cedula=txtCodigoCliente.getText();
             Cliente cli= clienteDAO.buscar(cedula);
             txtCedula.setText(cli.getCedula());
             txtNombres.setText(cli.getNombres());
             txtEdad.setText(cli.getEdad());

        
      }
  

    
}
