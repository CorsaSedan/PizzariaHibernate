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
public class IngredientePizzaVendida implements iEntity{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private IngredientePizzaBase ingredientePizzaBase;
    @ManyToOne
    private PizzaVendida pizzaVendida;
    private float quantidade;

    public IngredientePizzaVendida() {
    }

    public IngredientePizzaVendida(int id, IngredientePizzaBase ingredientePizzaBase, PizzaVendida pizzaVendida, float quantidade) {
        this.id = id;
        this.ingredientePizzaBase = ingredientePizzaBase;
        this.pizzaVendida = pizzaVendida;
        this.quantidade = quantidade;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IngredientePizzaBase getIngredientePizzaBase() {
        return ingredientePizzaBase;
    }

    public void setIngredientePizzaBase(IngredientePizzaBase ingredientePizzaBase) {
        this.ingredientePizzaBase = ingredientePizzaBase;
    }

    public PizzaVendida getPizzaVendida() {
        return pizzaVendida;
    }

    public void setPizzaVendida(PizzaVendida pizzaVendida) {
        this.pizzaVendida = pizzaVendida;
    }
    
}
