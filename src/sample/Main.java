package sample;
import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Main extends Application {
	
		static ListView<String> lista;	
		public static void lector ( ) {
			
			
			
			ObservableList<String> list = FXCollections.observableArrayList();
			File log = new File("src/ArchivoLogs.txt");
			Scanner sc;
			//Bucle que lea hasta el final del archivo to juapo
		        try {
		        	sc = new Scanner(log);	            
		            while (sc.hasNextLine()) {
		                String linea = sc.nextLine();
		                list.add(linea);
		                System.out.println("Linea añadida");
		            }
		            sc.close();
		         System.out.println("Lista Cerrada");   
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }
		        
		        lista.setItems(list);
		        
				
		}
		
		public static void main(String[] args) {
			 lector();
			
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

