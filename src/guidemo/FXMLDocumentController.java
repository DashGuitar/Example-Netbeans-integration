/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author dashelruizperez
 */
public class FXMLDocumentController implements Initializable {
    
    //These items are for the CheckBox example
    @FXML
    private Label pizzaOrderLabel;
    @FXML 
    private CheckBox pepperoniCheckBox;
    @FXML 
    private CheckBox pineappleCheckBox;
    @FXML 
    private CheckBox baconsCheckBox;
    
    //These items are for the ChoiceBox example
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    /**
     *  These items are for the ComboBox example
     */
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    
    
    //These items are for the RadioButton example
    @FXML private RadioButton phpRadioButton;
    @FXML private RadioButton javaRadioButton;
    @FXML private RadioButton cSharpRadioButton;
    @FXML private RadioButton cPlusRadioButton;
    @FXML private Label radioButtonLabel;
    private ToggleGroup favLanToggleGroup;
   
    
    /** 
     * This will update the Label for the ChoiceBox
     */  
    
    public void choiceBoxButtonPushed() {
        
        choiceBoxLabel.setText("My favorite fruit is: \n" + choiceBox.getValue().toString());
    }
    
    /**
     * This is for the choiceBox example
     */
    public void pizzaOrderButtonPush() {
        
        String order = "Toppins are: ";
        
        if (pepperoniCheckBox.isSelected()) {
            order += "\nPepperoni";
        }
        if (pineappleCheckBox.isSelected()) {
            order += "\nPineapple";
        }
        if (baconsCheckBox.isSelected()) {
            order += "\nBacon";
        }
        
        this.pizzaOrderLabel.setText(order);
    }
     
    /**
     * This method will update the radioButtonlabel
     */
    
    public void radioButtonChanged() {
        if (this.favLanToggleGroup.getSelectedToggle().equals(this.cPlusRadioButton)) {
            radioButtonLabel.setText("The selected language is: C++");
        } else if (this.favLanToggleGroup.getSelectedToggle().equals(this.cSharpRadioButton)) {
            radioButtonLabel.setText("The selected language is: C#");
        } else if (this.favLanToggleGroup.getSelectedToggle().equals(this.javaRadioButton)) {
            radioButtonLabel.setText("The selected language is: Java");
        } else {
            radioButtonLabel.setText("The selected language is: PHP");
        }
    }
       
    
    /**
     * This will update the comboBox the the ComboBox is changed
     */
    public void comboBoxWasUpdated() {
        
        this.comboBoxLabel.setText("Course selected: \n" + comboBox.getValue().toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pizzaOrderLabel.setText("");
        
        //This items are for the configuring ChoiceBox example
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges", "pears", "strawberries");
        choiceBox.setValue("apples");
        
        
        //This item is for configuring the ComboBox
        comboBox.getItems().addAll("COMP1030", "COMP1040", "COMP1050" , "COMP2000");
        comboBoxLabel.setText("");
        
        //These items are for configuring the RadioButtons
        radioButtonLabel.setText("");
        favLanToggleGroup = new ToggleGroup();
        this.cPlusRadioButton.setToggleGroup(favLanToggleGroup);
        this.cSharpRadioButton.setToggleGroup(favLanToggleGroup);
        this.javaRadioButton.setToggleGroup(favLanToggleGroup);
        this.phpRadioButton.setToggleGroup(favLanToggleGroup);
    }    
    
}
