/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Andre
 */
public interface OverDAO<F> {
    
    public void Insert(F objeto);
    
    public int Delete(F objeto);
    
    public int Update(F objeto);
    
    public F GetById(F objeto);
    
}
