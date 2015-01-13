/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jfxcraps;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import static jfxcraps.FXMLCrapsController.Accountname;

public class JFXCraps extends Application {
    
    public static String VERSION = "Version 1.2";
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CrapsFXML.fxml"));
        Scene scene = new Scene(root, 1250, 800);
        stage.setResizable(false);
        stage.setTitle("Jay Craps ~ " + VERSION);
        stage.setScene(scene);
        stage.show();
        
        // Make sure the X box on the window saves Account Info
        scene.getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
        public void handle(WindowEvent ev) {
            if(!Accountname.equals("Guest")){
                FXMLCrapsController.BANK += FXMLCrapsController.TOTAL;
                Login l = new Login();
                l.updateBank();
                l.writeAccount();
                System.out.println("New bank record: " + FXMLCrapsController.BANK);
                System.out.println("Bank balance: " + FXMLCrapsController.Balance);
            }
            System.exit(0);
        }
        });
        
    }

   
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
