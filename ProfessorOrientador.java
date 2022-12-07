/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ProfessorOrientador {
    private String nome;
    private String grauFormacao;
    private String email;

    public ProfessorOrientador(String nome, String grauFormacao, String email) {
        this.nome = nome;
        this.grauFormacao = grauFormacao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public String getGrauFormacao() {
        return grauFormacao;
    }

    public void setGrauFormacao(String grauFormaco) {
        this.grauFormacao = grauFormacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
