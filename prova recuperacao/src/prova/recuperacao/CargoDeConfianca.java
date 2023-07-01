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
public abstract class CargoDeConfianca  extends Fucionario{
    protected Bonificacao bonificao;

    public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }
    
    
}
