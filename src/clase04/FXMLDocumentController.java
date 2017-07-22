/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;


public class FXMLDocumentController implements Initializable {

    @FXML
    // click derecho en fxmldocument make controler agrega el controlador combobox automaticamente
    //si declaro el generic cliente
    private ComboBox<Cliente> cmbCliente;
    @FXML
    private TableView<Cliente> tblCliente;
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //se ejecuta cuando arranca el formulario
        //hay dos formas:
        // new Cliente().getAll().forEach(cmbCliente.getItems()::add);
        cmbCliente.getItems().addAll(new Cliente().getAll());
        
    }    

    @FXML
    private void aceptar(ActionEvent event) {
        Cliente cliente=cmbCliente.getValue();
        System.out.println(cliente);
    }
    
}
