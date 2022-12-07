/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class CadastroEstagio {
        private String emailAluno;
        private String matricula;
        private float nota; 
        private String professorOrientador;
        private String empresaPreferencia;

        public CadastroEstagio(String emailAluno, String matricula, String empresaPreferencia, float nota, String professorOrientador) {
            this.emailAluno = emailAluno;
            this.matricula = matricula;
            this.empresaPreferencia = empresaPreferencia;
            this.nota = nota;
            this.professorOrientador = professorOrientador;
        }

        public String getEmailAluno() {
            return emailAluno;
        }

        public void setEmailAluno(String emailAluno) {
            this.emailAluno = emailAluno;
        }

        public String getMatricula() {
            return matricula;
        }
               
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        
        public String getEmpresaPrefrerencia() {
            return empresaPreferencia;
        }


    public void setEmpresaPrefrerencia(String empresaPrefrerencia) {
            this.empresaPreferencia = empresaPreferencia;
        }


        
        public float getNota() {
            return nota;
        }
        
        public void setNota(Float nota){
            this.nota = nota;
        }
        
        
        public String professorOrientador() {
            return professorOrientador;
        }
        
        public void setProfessorOrientador(String professorOrientador) {
            this.professorOrientador = professorOrientador; 
        }

    String getProfessorOrientador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getEmpresaPreferencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getGrauFormacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
         
 
    
}