package br.edu.ifro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private double primeiroValor;
    @Column
    private double segundoValor;
    @Column
    private String operador;
    @Column
    private double resultado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(double primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}