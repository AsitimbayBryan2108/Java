package fundamentos.controlador;

import fundamentos.logica.Serie;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SerieController extends Application
{

    @FXML
    TextField txtNumero;
    @FXML
    TextArea txtSerie;
    @FXML
    Button buttonGenerar;
    @FXML
    Button buttonCancelar;
    public static void main(String[] args)
    {
       launch(args);
    }

    @Override
    public void start(Stage pantalla) throws Exception {
        
        Parent root=FXMLLoader.load(getClass().getResource("../vistas/Serie-Ulam.fxml"));

        Scene ventana=new Scene(root,650,450);

        pantalla.setScene(ventana);
        pantalla.setTitle("Serie de Ulam");
        pantalla.show();
        
    }
    

    @FXML
    public void onGenerarSerie()
    {
        int numero=0;
        String cadenaSerieUlam;

        //? 1.Recuperar el dato TextField txtNumero
        
        numero=Integer.parseInt(txtNumero.getText());

        //? 2. Llamar al método serieUlam y recuperar la cadena y presentarla en la txtSerieUlam
        cadenaSerieUlam=Serie.ulam(numero);

        //? 3. Presentamos la cadena en el widget txtSerie
        txtSerie.setText(cadenaSerieUlam);

        //System.out.println("Se disparó la acción del botón Generar Serie...");
        //System.out.println("Numero: "+txtNumero.getText());
    }
}
