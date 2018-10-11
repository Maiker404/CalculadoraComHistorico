/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author 01901822290
 */
public class LoginController implements Initializable {

    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXTextField txtSenha;
    @FXML
    private JFXButton btnLogar;
    @FXML
    private JFXButton btnSair;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void logar(ActionEvent event) {
        
    }

    @FXML
    private void sair(ActionEvent event) {
        System.exit(0);
        
    }
    
}
