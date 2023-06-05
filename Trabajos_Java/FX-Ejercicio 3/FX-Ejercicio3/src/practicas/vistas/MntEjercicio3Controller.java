package practicas.vistas;
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
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import practicas.dominios.CompraVivienda;


public class MntEjercicio3Controller extends Application 

{

    @FXML
    Button btnHipoteca;
    @FXML
    TextField txtCosto;
    @FXML
    TextField txtPorcentaje;
    @FXML
    TextField txtMonto;
    @FXML
    TextField txtSaldo;
    @FXML
    TextField txtMeses;
    @FXML
    TextField txtCuota;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root=FXMLLoader.load(getClass().getResource("CompradeVivienda.fxml"));

        Scene ventana= new Scene(root, 650, 450);

        pantalla.setScene(ventana);
        pantalla.setTitle("Ejercicio 3");
        pantalla.show();   
    }

    @FXML
    public void onGenerarSerie() throws Exception {


            double numero;
            String saldo;
            String entrada,meses;

            numero = Double.parseDouble(txtCosto.getText());

            entrada = CompraVivienda.compraVivienda(numero);
            meses = CompraVivienda.compraViviendaMeses(numero);
            saldo = CompraVivienda.Saldo(numero);

            txtSaldo.setText(saldo);
            txtMonto.setText(entrada);
            txtCuota.setText(meses);
     
            txtPorcentaje.setText("10%");
            txtMeses.setText("12");

    }




    
}
