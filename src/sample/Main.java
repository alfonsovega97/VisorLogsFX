package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
		
		public static void main(String[] args) {
			Visor lista = new Visor();
			
			Visor.lector();
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			try {
				
				Parent root = FXMLLoader.load(getClass().getResource("/src/sample/sample.fxml"));
				primaryStage.setTitle("Visor de Logs");
				primaryStage.setScene(new Scene(root));
				primaryStage.show();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

