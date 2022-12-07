/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Empresa {
       
    private String nome;
    private int CNPJ;
    private int cargaHoraria;

    public Empresa(String nome, int CNPJ, int cargaHoraria) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCNPJ() {
        return CNPJ;
    }

 
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
 
    
}
