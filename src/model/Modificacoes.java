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
public class Modificacoes implements iEntity{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private PizzaModificada pizzaModificada;
    @ManyToOne
    private Ingrediente ingrediente;
    private float quantidade;

    public Modificacoes() {
    }

    public Modificacoes(int id, PizzaModificada pizzaModificada, Ingrediente ingrediente, float quantidade) {
        this.id = id;
        this.pizzaModificada = pizzaModificada;
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PizzaModificada getPizzaModificada() {
        return pizzaModificada;
    }

    public void setPizzaModificada(PizzaModificada pizzaModificada) {
        this.pizzaModificada = pizzaModificada;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
}
