/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 76220842200
 */
public class TelaController implements Initializable {

    private Label label;
    @FXML
    private JFXButton btnDiv;
    @FXML
    private JFXButton btnMult;
    @FXML
    private JFXButton btnMod;
    @FXML
    private JFXButton btnsub;
    @FXML
    private JFXButton btnSoma;
    @FXML
    private JFXButton btnPonto;
    @FXML
    private JFXButton btnResult;
    @FXML
    private JFXButton btnPorc;
    @FXML
    private JFXTreeView<?> tbHisto;
    @FXML
    private TextField txtCalc;
    @FXML
    private Label lblProc;
    @FXML
    private Label lblAviso;
    
    private double valorUm,valorDois;
    private String operador;
    private boolean ponto=false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.txtCalc.setText("0");
    }

    @FXML
    private void zero(ActionEvent event) {
    }

    @FXML
    private void um(ActionEvent event) {
    }

    @FXML
    private void dois(ActionEvent event) {
    }

    @FXML
    private void tres(ActionEvent event) {
    }

    @FXML
    private void quatro(ActionEvent event) {
    }

    @FXML
    private void cinco(ActionEvent event) {
    }

    @FXML
    private void seis(ActionEvent event) {
    }

    @FXML
    private void sete(ActionEvent event) {
    }

    @FXML
    private void oito(ActionEvent event) {
    }

    @FXML
    private void nove(ActionEvent event) {
    }

    @FXML
    private void subtrair(ActionEvent event) {
    }

    @FXML
    private void multiplicar(ActionEvent event) {
    }

    @FXML
    private void soma(ActionEvent event) {
    }

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void ponto(ActionEvent event) {
    }

    @FXML
    private void mod(ActionEvent event) {
    }

    @FXML
    private void dividir(ActionEvent event) {
    }

    @FXML
    private void porcentagem(ActionEvent event) {
    }

    @FXML
    private void result(ActionEvent event) {
    }

}
