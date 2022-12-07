
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Operacoes {
      
    private String curso;
    private String nomeAluno;
    private String matricula;
    
    //crud - cadastro, atualizaçao, remoçao, busca
    public List<Alunos> ler(Connection con) throws SQLException{
        List lc = new LinkedList();  
        ResultSet rs = con.createStatement().executeQuery("select curso, nomeAluno,"
                        + "matricula");
        while(rs.next()){
            String  curso = rs.getString("curso");
            String nomeAluno = rs.getString("nomeAluno");
            String matricula = rs.getString("matricula");
            Alunos alunos= new Alunos (curso, nomeAluno, matricula);
            lc.add(alunos);
        }
       
        return lc;
       
    }
    


    public void criar(Connection con, Alunos alunos){
        String sql = "insert into alunos (curso, nomeAluno, matricula) values (?, ?, ?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, alunos.getCurso());
            stm.setString(2, alunos.getNomeAluno());
            stm.setString(3, alunos.getMatricula());
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    
    public void criar (Connection con, Empresa empresa) throws SQLException {
        String sql = "insert into empresa (nome, CNPJ, cargaHoraria) values (?,?,?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, empresa.getNome());
            stm.setInt(2, empresa.getCNPJ());
            stm.setInt(3, (int) empresa.getCargaHoraria());
            stm.executeUpdate();
              } catch (Exception e) {
        }
        }
    
    
      public void criar (Connection con, ProfessorOrientador professorOrientador) throws SQLException {
        String sql = "insert into professorOrientador (nome, grauFormacao, email) values (?,?,?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, professorOrientador.getNome());
            stm.setString(2, professorOrientador.getGrauFormacao());
            stm.setString(3, professorOrientador.getEmail());
            stm.executeUpdate();
              } catch (Exception e) {
        }
        }
      
      
            public void criar (Connection con, CadastroEstagio cadastroEstagio) throws SQLException {
        String sql = "insert into cadastroEstagio (emailAluno,matricula ,nota,professorOrientador,empresaPreferencia ) values (?,?,?,?,?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, cadastroEstagio.getEmailAluno());
            stm.setString(2, cadastroEstagio.getMatricula());
            stm.setFloat(3, cadastroEstagio.getNota());
            stm.setString(4, cadastroEstagio.getProfessorOrientador());
            stm.setString(5, cadastroEstagio.getEmpresaPreferencia());
            stm.executeUpdate();
              } catch (Exception e) {
        }
        }
      
       
    
   public void excluir(Connection con, Alunos alunos){
        String sql = "delete alunos where curso = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, alunos.getCurso());
            stm.executeUpdate();
        } catch (Exception e) {
        }
       
    }
   
   
     public void alterar(Connection con, Alunos alunos) throws SQLException{
        String sql = "update contas set nomeAluno=?, "
                + "matricula=? where curso = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, alunos.getNomeAluno());
        stm.setString(2, alunos.getMatricula());
        stm.setInt(3, alunos.getCurso());
        stm.executeUpdate();
    
     }
    
    
     
    public void alterar(Connection con, Empresa empresa) throws SQLException{
        String sql = "update contas set nome=?, "
                + "cargaHoraria=? where empresa = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, empresa.getNome());
        stm.setInt(2, empresa.getCNPJ());
        stm.setInt(3, (int) empresa.getCargaHoraria());
        stm.executeUpdate();
        
    }
    
    public void alterar(Connection con, ProfessorOrientador professorOrientador) throws SQLException{
        String sql = "update professorOrientador set nome=?, "
                + "email=? where professorOrientador = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, professorOrientador.getNome());
        stm.setString(2, professorOrientador.getGrauFormacao());
        stm.setString(3, professorOrientador.getEmail());
        stm.executeUpdate();
    
    }
    
    
   public void alterar(Connection con, CadastroEstagio cadastroEstagio) throws SQLException{
        String sql = "update cadastroEstagio set emailAluno=?, "
                + "empresaPreferencia=? where cadastroEstagio = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, cadastroEstagio.getNome());
        stm.setString(2, cadastroEstagio.getGrauFormacao());
        stm.setString(3, cadastroEstagio.getEmail());
        stm.executeUpdate();
    
    }
}
 
     
     
  
    
    
     



