package geometria;
import java.awt.Label;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class triangoloequilatero extends Application {
	TextField tBase=new TextField();
	javafx.scene.control.Label eRisultato=new javafx.scene.control.Label();
	TextField tAltezza=new TextField();
	javafx.scene.control.Label eRisultato2=new javafx.scene.control.Label();
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		javafx.scene.control.Label lNome=new javafx.scene.control.Label();
		javafx.scene.control.Label lCognome=new javafx.scene.control.Label();
	
		
		javafx.scene.control.Label eBase=new javafx.scene.control.Label("BASE");
		javafx.scene.control.Label eAltezza=new javafx.scene.control.Label("ALTEZZA");
		Button p1=new Button("AREA");
		Button p2=new Button("PERIMETRO");
		
		
		
		
		
		griglia.add(tAltezza, 0, 0);
		griglia.add(tBase, 0, 1);
		griglia.add(eBase, 1, 1);
		griglia.add(eAltezza, 1, 0);
		griglia.add(p1, 0, 2);
		griglia.add(eRisultato, 1, 2);
		griglia.add(p2, 0,3);
		 p1.setOnAction(e->calcola());
		 p2.setOnAction(e->calcola2());
		griglia.add(eRisultato2, 1, 3);
		griglia.add(lNome, 0, 4);
		griglia.add(lCognome, 0,5);
		
		
		
		
		Scene scena =new Scene(griglia);
		  finestra.setTitle("ciao mondo griglia");
		  finestra.setScene(scena);
		  finestra.show();
	}
	
	public void calcola() {
		String uno="";
		uno=tAltezza.getText();
		String due="";
		due=tBase.getText();
		int a,b;
		a=Integer.parseInt(uno);
		b=Integer.parseInt(due);
		eRisultato.setText("l'area è "+a*b/2);
	
		
	}
	public void calcola2() {
		String uno="";
		uno=tAltezza.getText();
		String due="";
		due=tBase.getText();
		int a,b,perimetro,area;
		a=Integer.parseInt(uno);
		b=Integer.parseInt(due);

		area=a*b;
		eRisultato2.setText("l'area. è"+area);
		
		
	}
	
	public static void main(String[]args) {
	 launch(args);
	 
 }
}
