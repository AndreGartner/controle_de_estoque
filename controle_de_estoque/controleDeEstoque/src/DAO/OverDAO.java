package DAO;

import java.util.List;

/**
 *
 * @author Andre
 */
public interface OverDAO<F> {
    
    public void Insert(F objeto);
    
    public int Delete(F objeto);
    
    public int Update(F objeto);
    
    public List<F> GetById(int id);
    
}
