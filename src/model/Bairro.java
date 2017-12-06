/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author cristhian_anacleto
 */
@Entity
public class Bairro implements iEntity{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Time TempoEsperaMedio;
    @ManyToOne
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(int id, String nome, Time TempoEsperaMedio, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.TempoEsperaMedio = TempoEsperaMedio;
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTempoEsperaMedio() {
        return TempoEsperaMedio;
    }

    public void setTempoEsperaMedio(Time TempoEsperaMedio) {
        this.TempoEsperaMedio = TempoEsperaMedio;
    }
    
}
