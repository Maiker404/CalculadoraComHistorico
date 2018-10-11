package br.edu.ifro.view;
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
}