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
