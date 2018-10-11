/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Historico;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
    private TextField txtCalc;
    @FXML
    private Label lblProc;
    @FXML
    private Label lblAviso;

    private double valorUm, valorDois;
    private String operador;
    private boolean ponto = false;
    @FXML
    private TableView<?> tbHist;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT h FROM Historico as h");
        List<Historico> historico = query.getResultList();
        if(historico.isEmpty()==false){
            ObservableList ob= FXCollections.observableList(historico);
            this.tbHist.setItems(ob);
        }
        em.close();
        emf.close();
        this.txtCalc.setText("0");
        this.valorUm = 0;
        this.valorDois = 0;
        this.operador = "";
        this.btnResult.setDisable(true);
    }
    private void buscaReturn(double r){
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Historico hist=new Historico();
        hist.setOperador(operador);
        hist.setPrimeiroValor(valorUm);
        hist.setSegundoValor(valorDois);
        hist.setResultado(r);
        em.persist(hist);
        em.getTransaction().commit();
        Query query = em.createQuery("SELECT h FROM Historico as h");
        List<Historico> historico = query.getResultList();
        if(historico.isEmpty()==false){
            ObservableList ob= FXCollections.observableList(historico);
            this.tbHist.setItems(ob);
        }
        em.close();
        emf.close();
    }
    private void disabled() {
        this.btnDiv.setDisable(true);
        this.btnMod.setDisable(true);
        this.btnMult.setDisable(true);
        this.btnSoma.setDisable(true);
        this.btnsub.setDisable(true);
        this.btnResult.setDisable(false);
    }

    private void enabled() {
        this.btnDiv.setDisable(false);
        this.btnMod.setDisable(false);
        this.btnMult.setDisable(false);
        this.btnSoma.setDisable(false);
        this.btnsub.setDisable(false);
        this.btnResult.setDisable(true);
    }

    @FXML
    private void zero(ActionEvent event) {
        if (!this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText(this.txtCalc.getText() + "0");
        }
    }

    @FXML
    private void um(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("1");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "1");
        }

    }

    @FXML
    private void dois(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("2");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "2");
        }
    }
    @FXML
    private void tres(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("3");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "3");
        }
    }

    @FXML
    private void quatro(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("4");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "4");
        }
    }

    @FXML
    private void cinco(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("5");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "5");
        }
    }

    @FXML
    private void seis(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("6");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "6");
        }
    }

    @FXML
    private void sete(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("7");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "7");
        }
    }

    @FXML
    private void oito(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("8");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "8");
        }
    }

    @FXML
    private void nove(ActionEvent event) {
        if (this.txtCalc.getText().equals("0")) {
            this.txtCalc.setText("9");
        } else {
            this.txtCalc.setText(this.txtCalc.getText() + "9");
        }
    }

    @FXML
    private void subtrair(ActionEvent event) {
        this.disabled();
        this.valorUm = Double.parseDouble(this.txtCalc.getText());
        this.operador = "-";
        this.txtCalc.setText("0");
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        this.disabled();
        this.valorUm = Double.parseDouble(this.txtCalc.getText());
        this.operador = "*";
        this.txtCalc.setText("0");
    }

    @FXML
    private void soma(ActionEvent event) {
        this.disabled();
        this.valorUm = Double.parseDouble(this.txtCalc.getText());
        this.operador = "+";
        this.txtCalc.setText("0");
    }

    @FXML
    private void clear(ActionEvent event) {
        this.txtCalc.setText("0");
        this.ponto = false;
        this.valorUm = 0;
        this.operador = "";
        this.enabled();
    }

    @FXML
    private void ponto(ActionEvent event) {
        if (this.ponto == false) {
            this.txtCalc.setText(this.txtCalc.getText() + ".");
            this.ponto = true;
        } else {
            this.lblAviso.setText("Ponto não pode ser adicionado novamente!");
        }
    }

    @FXML
    private void mod(ActionEvent event) {
        this.disabled();
        this.valorUm = Double.parseDouble(this.txtCalc.getText());
        this.operador = "mod";
        this.txtCalc.setText("0");
    }

    @FXML
    private void dividir(ActionEvent event) {
        this.disabled();
        this.valorUm = Double.parseDouble(this.txtCalc.getText());
        this.operador = "/";
        this.txtCalc.setText("0");
    }

    @FXML
    private void result(ActionEvent event) {
        this.valorDois = Double.parseDouble(this.txtCalc.getText());
        double r=0;
        switch (operador) {
            case "+":
                r = this.valorUm + this.valorDois;
                this.lblProc.setText("Resultado: " + r);
                break;
            case "-":
                r = this.valorUm - this.valorDois;
                this.lblProc.setText("Resultado: " + r);
                break;
            case "*":
                r = this.valorUm * this.valorDois;
                this.lblProc.setText("Resultado: " + r);
                break;
            case "/":
                r = this.valorUm / this.valorDois;
                this.lblProc.setText("Resultado: " + r);
                break;
            
            case "mod":
                r = this.valorUm % this.valorDois;
                this.lblProc.setText("Resultado: " + r);
                break;
        }
        this.buscaReturn(r);
        this.resetar();
    }

    private void resetar() {
        this.txtCalc.setText("0");
        this.ponto = false;
        this.valorUm = 0;
        this.operador = "";
        this.enabled();        
    }
}
