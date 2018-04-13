package model;

import java.sql.Timestamp;

public class Actor {
    private int actor_id;
    private String nome;
    private String sobrenome;
    private Timestamp atualizacao;
        
    public Timestamp getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(Timestamp atualizacao) {
        this.atualizacao = atualizacao;
    }
    
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int ator_id) {
        this.actor_id = ator_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }   
}
