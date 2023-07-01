/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.recuperacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Advogado extends Fucionario{
 
  private final String oab;

    public Advogado(String oab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "Advogado{" + "oab=" + oab + '}';
    }
        
       
    
    
    
}
