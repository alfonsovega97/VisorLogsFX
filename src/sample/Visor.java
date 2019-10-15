package sample;

import java.io.File;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Visor extends Main {
	
	public static void lector () {
		
		ObservableList<String> list = FXCollections.observableArrayList();
		File log = new File("src/ArchivoLogs.txt");
		Scanner sc;
		//Bucle que lea hasta el final del archivo 
	        try {
	        	sc = new Scanner(log);	            
	            while (sc.hasNextLine()) {
	                String linea = sc.nextLine();
	                list.add(linea);
	            }
	            sc.close();
	            
	         System.out.println("Lineas añadidas y lista cerrada");   
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        ListView<String> lista = new ListView<String>(list);
	        
	}
}
