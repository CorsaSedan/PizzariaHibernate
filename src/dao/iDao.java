/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author cristhian_anacleto
 */
public interface iDao<T> {
    
    public void save(T t);
    
    public T findById(int id);
    
    public List<T> findAll();
    
    public void delete(int id);
    
    public void delete(T t);
}
