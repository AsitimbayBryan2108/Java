package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Menus extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {

        AnchorPane root = new AnchorPane();
        Scene escena = new Scene(root, 300, 150);

        Menu menu1 = new Menu("Archivo");
        MenuItem ElementoArchivo1 = new MenuItem("Nueva Partida");
        MenuItem ElementoArchivo2 = new MenuItem("Cargar Partida");
        MenuItem ElementoArchivo3 = new MenuItem("Guardad Partida");
        MenuItem ElementoArchivo4 = new MenuItem("Cerrar");
        
        Menu menu2 = new Menu("Vista");
        Menu adicionalmenu = new Menu("Apariencia");
        RadioMenuItem Claro = new RadioMenuItem("Modo Claro");
        RadioMenuItem Oscuro = new RadioMenuItem("Modo Oscuro");
        ToggleGroup toggle1 = new ToggleGroup();
        Menu eleccion = new Menu("Dificultad");
        CheckMenuItem ElementoDi1 = new CheckMenuItem("Facil");
        CheckMenuItem ElementoDi2 = new CheckMenuItem("Medio");
        CheckMenuItem ElementoDi3 = new CheckMenuItem("Dificil");
        
        Menu menu3 = new Menu("Editar");
        MenuItem ElementoEditar1 = new MenuItem("Deshacer");
        MenuItem ElementoEditar2 = new MenuItem("Rehacer");

        MenuBar mainbar = new MenuBar();
        
        menu1.getItems().addAll(ElementoArchivo1,ElementoArchivo2,ElementoArchivo3,ElementoArchivo4);      
        menu2.getItems().add(adicionalmenu);
        menu3.getItems().addAll(eleccion,ElementoEditar1,ElementoEditar2);
        Claro.setToggleGroup(toggle1);
        Claro.setSelected(true);
        Oscuro.setToggleGroup(toggle1);
        eleccion.getItems().addAll(ElementoDi1,ElementoDi2,ElementoDi3);
        adicionalmenu.getItems().addAll(Claro,Oscuro);
        mainbar.getMenus().addAll(menu1,menu2,menu3);
        root.getChildren().add(mainbar);


        arg0.setTitle("Menu Juego ");
        arg0.setScene(escena);
        arg0.show();
    }
    
}

