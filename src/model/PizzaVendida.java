/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class PizzaVendida implements iEntity{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private PizzaBase pizzaBase;
    @ManyToOne
    private Tamanho tamanho;

    public PizzaVendida() {
    }

    public PizzaVendida(int id, PizzaBase pizzaBase, Tamanho tamanho) {
        this.id = id;
        this.pizzaBase = pizzaBase;
        this.tamanho = tamanho;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PizzaBase getPizzaBase() {
        return pizzaBase;
    }

    public void setPizzaBase(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }
    
}
