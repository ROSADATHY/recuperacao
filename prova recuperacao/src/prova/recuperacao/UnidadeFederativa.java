/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.recuperacao;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Bahia","Ba"),
    
    SAO_PAULO("Sao_Paulo","Sp"),
    
    RIO_DE_JANERO("Rio_De_Janeiro","Rj");
    
    protected String nome;
            
    protected String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
    
    
    
    
    
    
}
