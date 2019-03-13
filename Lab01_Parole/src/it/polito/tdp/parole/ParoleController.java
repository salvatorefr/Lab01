package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
		
	Parole elenco ;
	long tempoelab=0;
	

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    @FXML
    private Button cancella;
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader
    @FXML
    private TextArea txtbench;


    @FXML
    void doInsert(ActionEvent event) {
    	String par= this.txtParola.getText();
    this.tempoelab=elenco.addParola(par);
    this.txtResult.clear();
    aggiorna();
    this.txtbench.appendText("parola aggiunta in "+this.tempoelab);
    
       }

    @FXML
    void doCancella(ActionEvent event) {
    	this.tempoelab=elenco.removeParola(this.txtParola.getText());
    	aggiorna();
    	 this.txtbench.appendText("parola cancellata in "+this.tempoelab);
    }

    
    @FXML
    void doReset(ActionEvent event) {
    	
    	this.tempoelab=elenco.reset();
    	this.txtParola.clear();
    	this.txtResult.clear();
    	this.txtbench.clear();
    	 this.txtbench.appendText("resettato  in "+this.tempoelab);
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";

        elenco = new Parole() ;
        
    }
   void aggiorna(){
	   	this.txtParola.clear();
    	this.txtResult.clear();
    	String stampa = "le parole presenti sono:\n";
        for (String s : elenco.getElenco())
        {
           stampa += s + "\n";
        }
        this.txtResult.appendText(stampa);
        this.txtbench.clear();
        
      
    }
}
