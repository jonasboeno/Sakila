
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionJDBC {
    private static Connection connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
        

        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
    
            //Dados da conexao
            String servidor = "localhost";
            String database = "C:\\Users\\User\\Documents\\Arquivo\\SAKILA.FDB";
            String User = "SYSDBA";
            String password = "masterkey";
            
            // Prepara url de conexao
            // jdbc:firebirdsql:IP/3050:/diretorio/do/banco.fdb?parametros adicionais
            String url = "jdbc:firebirdsql:" + servidor + "/3050:"+database+ "?encoding=win1252";
            
            
            // obtem a conexao xom o banco de dados
            connection = DriverManager.getConnection(url, User, password);


            
            System.out.println("Concluido!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não localizado!");
        } catch (SQLException ex) {
            System.out.println("Não foi possivel conectar ao BD.");
            System.out.println("Erro: "+ex.getMessage());
        }
        }
        return connection;
    }
    
    public static void main(String[] args) {
        System.out.println("Teste!");
        try {
            ConnectionJDBC.getConnection();
        } catch (Exception ex) {
            System.out.println(""+ex.getMessage());
        }
    }
}
