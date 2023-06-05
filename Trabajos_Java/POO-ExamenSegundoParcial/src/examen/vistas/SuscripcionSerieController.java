package examen.vistas;

import java.net.URL;
import java.util.ResourceBundle;

import examen.dominio.Cliente;
import examen.dominio.Serie;
import examen.repositorios.ClienteListDao;
import examen.repositorios.IClienteDao;
import examen.repositorios.ISerieDao;
import examen.repositorios.SerieListDao;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SuscripcionSerieController extends Application{
    @FXML
    TextField txtNumero;
    @FXML
    TextField txtFecha;
    @FXML
    TextField txtCodigoCliente;
    @FXML
    TextField txtCedula;
    @FXML
    TextField txtEdad;
    @FXML
    TextField txtNombres;
    @FXML
    TextField txtCodigoSerie;
    @FXML
    TextField txtNombreSerie;
    @FXML
    TextField txtTemporada;
    @FXML
    TextField txtCapitulos;
    @FXML
    TextField txtCostoTemporada;
    @FXML
    TextField txtDescuento;
    @FXML
    TextField txtTotal;
    @FXML
    TextField txtMonto;
    @FXML
    Button btnCliente;
    @FXML
    Button btnSerie;
    @FXML
    Button btnGrabar;

    IClienteDao clienteDao= new ClienteListDao();
    ISerieDao se= new SerieListDao();




    @Override
    public void start(Stage pantalla) throws Exception {

        Parent root= FXMLLoader.load(getClass().getResource("frmSuscripcionSerie.fxml"));

        Scene ventana= new Scene(root, 750,750);

        pantalla.setTitle("Suscripcion Serie");
        pantalla.setScene(ventana);
        pantalla.show();
       
        
    }
    public static void main(String[] args) {
        launch(args);
    }

    public void onCliente(){
        try{

        String ce;

        ce= String.valueOf(txtCodigoCliente.getText());

        Cliente cli=clienteDao.buscar(ce);
        txtCedula.setText(cli.getCedula());
        txtNombres.setText(cli.getNombres());
        txtEdad.setText(String.valueOf(cli.getEdad()));
        }catch(Exception cliendtedao){
            Alert alert = new Alert(AlertType.INFORMATION);
        
            alert.setTitle("Resultado");
            
            alert.setHeaderText("Ingrese un numero de cédula válido");
            alert.showAndWait().ifPresent(rs -> {});

        }
    }

    public void onSerie(){

        int codigo;
        codigo= Integer.parseInt(txtCodigoSerie.getText());

        Serie ses= se.buscar(codigo);

        txtNombreSerie.setText(ses.getNombre());
        txtTemporada.setText(ses.getTemporada());
        txtCapitulos.setText(String.valueOf(ses.getTotalCapitulos()));

    }



    
}
