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
public class IngredientePizzaBase implements iEntity{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private PizzaBase pizzaBase;
    @ManyToOne
    private Ingrediente ingrediente;

    public IngredientePizzaBase() {
    }

    public IngredientePizzaBase(int id, PizzaBase pizzaBase, Ingrediente ingrediente) {
        this.id = id;
        this.pizzaBase = pizzaBase;
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
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
