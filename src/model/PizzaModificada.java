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
public class PizzaModificada implements iEntity{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float quantidade;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private PizzaVendida pizzaVendida;

    public PizzaModificada() {
    }

    public PizzaModificada(int id, float quantidade, Pedido pedido, PizzaVendida pizzaVendida) {
        this.id = id;
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.pizzaVendida = pizzaVendida;
    }

    public PizzaVendida getPizzaVendida() {
        return pizzaVendida;
    }

    public void setPizzaVendida(PizzaVendida pizzaVendida) {
        this.pizzaVendida = pizzaVendida;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
