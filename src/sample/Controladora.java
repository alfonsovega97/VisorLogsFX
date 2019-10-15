package sample;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class Controladora implements Initializable {
	
	@FXML
	FilteredList lista;
	@FXML
	ObservableList<String> list;
	
private void lector () {
		
		list = FXCollections.observableArrayList();
		File log = new File("../ArchivoLogs.txt");
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
	        	
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lector();
		lista=new FilteredList(list);
		
	}
	
}
