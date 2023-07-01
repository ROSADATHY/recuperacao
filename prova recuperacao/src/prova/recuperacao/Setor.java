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
public enum Setor {
    
   ENGENHARIA("Engenhario"),
   
   JURIDICO("Juridico"),
   
   RECURSOS_HUMANOS("Recursos"),
   
   MARKETING("Marketing"),
   
   OPERACOES ("Operacoes");
   
   
   protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
   
   
    
}
