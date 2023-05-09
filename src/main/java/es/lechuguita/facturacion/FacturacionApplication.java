package es.lechuguita.facturacion;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class FacturacionApplication extends Application{
	
	private Logger log = LogManager.getLogger(FacturacionApplication.class);
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		log.info("Se arranca la aplicacion");
		
		try {
			
			Screen screen = Screen.getPrimary();
			Rectangle2D bounds = screen.getVisualBounds();
	
			primaryStage.setX(bounds.getMinX());
			primaryStage.setY(bounds.getMinY());
			primaryStage.setWidth(bounds.getWidth());
			primaryStage.setHeight(bounds.getHeight());
			
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
	        Parent root = loader.load();
	        Scene scene = new Scene(root);
			
			primaryStage.setTitle("Facturación");
			primaryStage.setScene(scene);
	        primaryStage.show();
		
		} catch(Exception e){
			//log.error("Error al arrancar la aplicación", e);
		}
	}
	
	public static void main(String[] args) {
		Application.launch(FacturacionApplication.class, args);
	}


}
