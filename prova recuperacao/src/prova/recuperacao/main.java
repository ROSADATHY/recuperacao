/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.recuperacao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class main{
        public static void main(String[] args) {
        Motorista motorista = new Motorista("mario", "764464461","8544625", "Rua B", Setor.OPERACOES, Genero.MASCULINO, 40000, LocalDate.of(2000, Month.MARCH, 10));
    }
    
}
