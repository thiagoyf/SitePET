/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Realiza conexao com o Banco de Dados MySQL
 * @author Thiago
 * @since 2012112301
 * @version 2012112301
 */
public class Conexao {
    /**
     * Método que retorna a conexão com o banco de dados
     * @return Connection - Resultado da conexão
     */
    public Connection geConnection(){
        try{
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/projeto", "root", "");
        }catch(SQLException e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
