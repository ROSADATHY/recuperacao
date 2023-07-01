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
public class Motorista extends Fucionario{
    
    private String carteiraDeHabilitaco;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }
    
    
    
}
