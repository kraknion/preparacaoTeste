/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author UserPL022Pc05
 */
public class Utente {
    
    String nome;
    String dataNascimento;
    String observacoes;

    public Utente(String nome, String DataNascimento, String Observacoes) {
        this.nome = nome;
        this.dataNascimento = DataNascimento;
        this.observacoes = Observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.dataNascimento = DataNascimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.observacoes = Observacoes;
    }
    
}
