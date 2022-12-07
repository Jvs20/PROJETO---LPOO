
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Conexao {
    
   
    public static void main(String[] args) throws SQLException, ClassNotFoundException  {
        Connection conexao = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/ProjetoEstagio", "root", "root");
            ResultSet rsAlunos = conexao.createStatement().executeQuery("SELECT * FROM ALUNOS");
            while (rsAlunos.next()){
                System.out.println("Curso: " + rsAlunos.getString("curso"));
                System.out.println("NomeAluno: " + rsAlunos.getString("nomeAluno"));
                System.out.println("Matricula: " + rsAlunos.getString("matricula"));
                
            }    
  
        
        }catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado.");
        }catch (SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }
    }  
}
