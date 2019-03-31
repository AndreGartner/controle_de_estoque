package DAO;
import model.Produto;
import connection.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre
 */
public class ProdutoDAO implements OverDAO<Produto> {
    
    Produto produto = new Produto();
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;

    public ProdutoDAO() {
        try {
            this.con = DB.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Insert(Produto objeto) {
        
        try {
            String sql = "INSERT INTO produtos VALUES (?,?,?,?);";
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getCategoria());
            stmt.setString(3, objeto.getDataCadastro());
            stmt.setInt(4, objeto.getQuantidade());
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            
            System.out.print("Erro ao inserir!" + e);
            
        }
        
    }

    @Override
    public int Delete(Produto objeto) {
        
        try {
            String sql = "DELETE FROM produto WHERE id = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao deletar!" + e);
            
        }
        
        return 0;
        
    }

    @Override
    public int Update(Produto objeto) {
        
        try {
            String sql = "UPDATE produto WHERE id = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao atualizar!" + e);
            
        }
        
        return 0;
        
    }

    @Override
    public Produto GetById(Produto objeto) {
        
        try {
            String sql = "SELECT * FROM produto WHERE id = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDataCadastro(rs.getString("cadastrado_em"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao Listar!" + e);
            
        } finally {

            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return produto;
        
    }
    
    public Produto GetByName(Produto objeto) {
        
        try {
            String sql = "SELECT * FROM produto WHERE nome = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDataCadastro(rs.getString("cadastrado_em"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao Listar!" + e);
            
        } finally {

            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return produto;
        
    }
    
    public Produto GetByCategoria(Produto objeto) {
        
        try {
            String sql = "SELECT * FROM produto WHERE categoria = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, objeto.getCategoria());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDataCadastro(rs.getString("cadastrado_em"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao Listar!" + e);
            
        } finally {

            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return produto;
        
    }
    
    public Produto GetByDate(Produto objeto) {
        
        try {
            String sql = "SELECT * FROM produto WHERE cadastrado_em = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, objeto.getDataCadastro());
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setDataCadastro(rs.getString("cadastrado_em"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }
            
        } catch (SQLException e) {
            
            System.out.println("Erro ao Listar!" + e);
            
        } finally {

            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return produto;
        
    }
    
}
