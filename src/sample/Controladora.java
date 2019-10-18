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
	ListView<String> lista;
	@FXML
	static ObservableList<String> list;

	public void lector(File log) {

		list = FXCollections.observableArrayList();
		Scanner sc;
		// Bucle que lea hasta el final del archivo
		try {
			sc = new Scanner(log);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				list.add(linea);
			}
			sc.close();
			lista = new ListView<String>();
			lista.setItems(list);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lector(new File("C:\\Users\\migue\\Documents\\GitHub\\VisorLogsFX\\src\\sample\\ArchivoLogs.txt"));

	}

}
