/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andre
 */
public class DB {

    public static Connection con = null;

    public static Connection getConnection() throws SQLException {

        try {
            // Pedir para a classe carregar
            // O driver do mysql
            Class.forName("com.mysql.jdbc.Driver");
            // Caminho da base de dados
            String base = "jdbc:mysql://localhost:3306/dbAlmoxarifado?useSSL=false";
            String usuario = "root";
            String senha = "123";

            con = DriverManager.getConnection(base, usuario, senha);
            System.out.println("Conectado!!");

        } catch (ClassNotFoundException e) {
            System.out.println("ERRO ao carregar o driver");
            e.printStackTrace();
            
        } catch (SQLException e) {
            System.out.println("ERRO na base de dados");
            e.printStackTrace();
        }

        return con;
    }
}
